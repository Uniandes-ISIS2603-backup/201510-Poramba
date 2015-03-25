package co.edu.uniandes.csw.LugarGroup.lugar.logic.ejb;

import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.ejb.*;
import co.edu.uniandes.csw.CiudadGroup.ciudad.logic.api.ICiudadLogic;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.converter.*;
import co.edu.uniandes.csw.CiudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.entity.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


public class LugarLogic implements ICiudadLogic{

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

  


}

   
