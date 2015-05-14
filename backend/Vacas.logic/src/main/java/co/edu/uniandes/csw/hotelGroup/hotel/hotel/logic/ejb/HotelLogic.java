package co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.ejb;

import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.api.IHotelLogic;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.converter.HotelConverter;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelPageDTO;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.entity.HotelEntity;


import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless 
@LocalBean
public class HotelLogic implements IHotelLogic 
{
    
    @PersistenceContext(unitName = "VacasClassPU")
    protected EntityManager em;

    public HotelDTO createHotel(HotelDTO detail) 
    {
        HotelEntity en = HotelConverter.persistenceDTO2Entity(detail);
        em.persist(en);
        return HotelConverter.entity2PersistenceDTO(en);
    }

    public List<HotelDTO> getHoteles() 
    {
        Query q = em.createQuery("select u from HotelEntity u");
        return HotelConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public HotelDTO getHotel(String id)
    {
        return HotelConverter.entity2PersistenceDTO(em.find(HotelEntity.class, id));
    }
    
    public HotelPageDTO getHotels(Integer page, Integer maxRecords)
    {
        Query count = em.createQuery("select count (u) from HotelEntity u");
        Long regC = 0L;
        regC = Long.parseLong(count.getSingleResult().toString());
        Query q = em.createQuery("select u from HotelEntity u");
        if(page != null && maxRecords != null)
        {
            q.setFirstResult((page-1)*maxRecords);
            q.setMaxResults(maxRecords);
        }
        HotelPageDTO res = new HotelPageDTO();
        res.setTotalRecords(regC);
        res.setRecords(HotelConverter.entity2PersistenceDTOList(q.getResultList()));
        return res;
    }
    public void deleteHotel(String id) 
    {
        HotelEntity en = em.find(HotelEntity.class, id);
        em.remove(en);
    }

    public void updateHotel(HotelDTO detail) 
    {
        HotelEntity en = em.merge(HotelConverter.persistenceDTO2Entity(detail));
        em.remove(en);
    }
    
}