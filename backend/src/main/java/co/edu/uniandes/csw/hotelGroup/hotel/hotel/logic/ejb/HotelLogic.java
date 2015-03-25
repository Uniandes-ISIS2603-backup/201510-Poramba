package co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.ejb;

import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.api.IHotelLogic;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.converter.HotelConverter;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.entity.HotelEntity;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class HotelLogic implements IHotelLogic {

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
