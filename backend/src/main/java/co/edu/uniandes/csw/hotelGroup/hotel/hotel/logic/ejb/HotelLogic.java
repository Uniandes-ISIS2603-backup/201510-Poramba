package co.edu.uniandes.csw.SportGroup.hotel.logic.ejb;

import co.edu.uniandes.csw.SportGroup.usuario.logic.ejb.*;
import co.edu.uniandes.csw.SportGroup.hotel.logic.api.IHotelLogic;
import co.edu.uniandes.csw.SportGroup.country.logic.converter.CountryConverter;
import co.edu.uniandes.csw.SportGroup.country.logic.dto.CountryDTO;
import co.edu.uniandes.csw.SportGroup.country.logic.entity.CountryEntity;
import co.edu.uniandes.csw.SportGroup.hotel.logic.converter.HotelConverter;
import co.edu.uniandes.csw.SportGroup.hotel.logic.dto.HotelDTO;
import co.edu.uniandes.csw.SportGroup.hotel.logic.dto.HotelPageDTO;
import co.edu.uniandes.csw.SportGroup.hotel.logic.entity.HotelEntity;
import co.edu.uniandes.csw.SportGroup.usuario.logic.api.IUsuarioLogic;
import co.edu.uniandes.csw.SportGroup.usuario.logic.converter.UsuarioConverter;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioDTO;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioPageDTO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class HotelLogic implements IHotelLogic{

    @PersistenceContext(unitName = "HotelClassPU")
    protected EntityManager entityManager;

    public HotelDTO createHotel(HotelDTO hotel) {
        HotelEntity entity = HotelConverter.persistenceDTO2Entity(hotel);
        entityManager.persist(entity);
        return HotelConverter.entity2PersistenceDTO(entity);
    }

    public List<HotelDTO> getHoteles() {
        Query q = entityManager.createQuery("select u from HotelEntity u");
        return HotelConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public HotelPageDTO getHoteles(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from HotelyEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from HotelyEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        HotelPageDTO response = new HotelPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(HotelConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public HotelDTO getHotel(Long id) {
        return HotelConverter.entity2PersistenceDTO(entityManager.find(HotelEntity.class, id));
    }

    public void deleteHotel(Long id) {
       HotelEntity entity = entityManager.find(HotelEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateHotel(HotelDTO hotel) {
        HotelEntity entity = entityManager.merge(HotelConverter.persistenceDTO2Entity(hotel));
        HotelConverter.entity2PersistenceDTO(entity);
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
