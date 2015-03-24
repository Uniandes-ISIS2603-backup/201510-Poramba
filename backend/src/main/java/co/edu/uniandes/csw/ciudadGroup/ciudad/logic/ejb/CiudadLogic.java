package co.edu.uniandes.csw.CiudadGroup.ciudad.logic.ejb;

import co.edu.uniandes.csw.SportGroup.ciudad.logic.api.ICiudadLogic;
import co.edu.uniandes.csw.SportGroup.ciudad.logic.converter.CiudadConverter;
import co.edu.uniandes.csw.SportGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.SportGroup.ciudad.logic.dto.CiudadPageDTO;
import co.edu.uniandes.csw.SportGroup.ciudad.logic.entity.CiudadEntity;
import co.edu.uniandes.csw.SportGroup.usuario.logic.ejb.*;
import co.edu.uniandes.csw.SportGroup.ciudad.logic.api.ICiudadLogic;
import co.edu.uniandes.csw.SportGroup.country.logic.converter.CountryConverter;
import co.edu.uniandes.csw.SportGroup.country.logic.dto.CountryDTO;
import co.edu.uniandes.csw.SportGroup.country.logic.entity.CountryEntity;
import co.edu.uniandes.csw.SportGroup.usuario.logic.api.IUsuarioLogic;
import co.edu.uniandes.csw.SportGroup.usuario.logic.converter.UsuarioConverter;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioDTO;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioPageDTO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class CiudadLogic implements ICiudadLogic{

    @PersistenceContext(unitName = "CiudadClassPU")
    protected EntityManager entityManager;

    public CiudadDTO createCiudad(CiudadDTO ciudad) {
        CiudadEntity entity = CiudadConverter.persistenceDTO2Entity(ciudad);
        entityManager.persist(entity);
        return CiudadConverter.entity2PersistenceDTO(entity);
    }

    public List<CiudadDTO> getCiudades() {
        Query q = entityManager.createQuery("select u from CiudadEntity u");
        return CiudadConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public CiudadPageDTO getCiudades(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from CiudadyEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from CiudadyEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        CiudadPageDTO response = new CiudadPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(CiudadConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public CiudadDTO getCiudad(Long id) {
        return CiudadConverter.entity2PersistenceDTO(entityManager.find(CiudadEntity.class, id));
    }

    public void deleteCiudad(Long id) {
       CiudadEntity entity = entityManager.find(CiudadEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateCiudad(CiudadDTO ciudad) {
        CiudadEntity entity = entityManager.merge(CiudadConverter.persistenceDTO2Entity(ciudad));
        CiudadConverter.entity2PersistenceDTO(entity);
    }

    /*public CountryDTO getMostPopulated() {
        Query query = entityManager.createQuery("select u from CountryEntity u WHERE u.population = (SELECT MAX(v.population) from CountryEntity v)");
        return CountryConverter.entity2PersistenceDTO((CountryEntity)query.getSingleResult());
    }

    public CountryDTO getLeastPopulated() {
        Query query = entityManager.createQuery("select u from CountryEntity u WHERE u.population = (SELECT MIN(v.population) from CountryEntity v)");
        return CountryConverter.entity2PersistenceDTO((CountryEntity)query.getSingleResult());
    }*/
}
