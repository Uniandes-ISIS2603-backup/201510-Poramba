package co.edu.uniandes.csw.LugarGroup.lugar.logic.ejb;


import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.api.ILugarLogic;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.converter.LugarConverter;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.dto.LugarDTO;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.dto.LugarPageDTO;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.entity.LugarEntity;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.converter.CiudadConverter;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.entity.CiudadEntity;
import co.edu.uniandes.csw.eventoGroup.evento.logic.converter.EventoConverter;
import co.edu.uniandes.csw.eventoGroup.evento.logic.dto.EventoDTO;
import co.edu.uniandes.csw.eventoGroup.evento.logic.entity.EventoEntity;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Default
@Stateless
@LocalBean

public class LugarLogic implements ILugarLogic{

    @PersistenceContext(unitName = "VacasClassPU")
    protected EntityManager entityManager;
   /**
    * Crea un lugar
    * @param detail Lugar a crear
    * @return El lugar creado, nulo si ya existe.
    */
    public LugarDTO createLugar(LugarDTO detail) 
    {
        LugarEntity entity = LugarConverter.persistenceDTO2Entity(detail);
        entityManager.persist(entity);
        return LugarConverter.entity2PersistenceDTO(entity);
    }
    
    public List<LugarDTO> getLugares()
    {
        Query q = entityManager.createQuery("Select u from LugarEntity u");
        return LugarConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public LugarPageDTO gerLugar(Integer page, Integer maxRecords)
    {
        Query count = entityManager.createQuery("select count(u) from LugarEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from CountryEntity u");
        if(page != null && maxRecords != null)
        {
            q.setFirstResult((page -1)*maxRecords);
            q.setMaxResults(maxRecords);
        }
        LugarPageDTO r = new LugarPageDTO();
        r.setTotalRecords(regCount);
        r.setRecords(LugarConverter.entity2PersistenceDTOList(q.getResultList()));
        return r;
    }
    
    public LugarDTO getLugar(String id)
    {
        return LugarConverter.entity2PersistenceDTO(entityManager.find(LugarEntity.class, id));
    }
    
    public void deleteLugar(String id)
    {
        LugarEntity ent = entityManager.find(LugarEntity.class, id);
        entityManager.remove(ent);
    }
    
    public void updateLugar(LugarDTO detail)
    {
        LugarEntity entity = entityManager.merge(LugarConverter.persistenceDTO2Entity(detail));
        LugarConverter.entity2PersistenceDTO(entity);
    }
    public CiudadEntity getCiudad(LugarDTO lugar)
    {
        if(lugar != null && lugar.getCiudad() != null)
        {
            return entityManager.find(CiudadEntity.class, lugar.getCiudad());
        }
        else
        {
            return null;
        }
    }

    public void setCiudad(CiudadDTO ciudad, LugarDTO lugar) 
    {
         CiudadEntity ci = entityManager.merge(CiudadConverter.persistenceDTO2Entity(ciudad));
         LugarEntity lug = entityManager.merge(LugarConverter.persistenceDTO2Entity(lugar));
         lug.setCiudadActual(ci);
    }
    
    public void addEvento(EventoDTO detail, LugarDTO lugar)
    {
        EventoEntity ev = entityManager.merge(EventoConverter.persistenceDTO2Entity(detail));
        LugarEntity lug = entityManager.merge(LugarConverter.persistenceDTO2Entity(lugar));
        lug.agregarEvento(ev);
    }
    
    public EventoEntity getEvento(String id, LugarDTO lug)
    {
        if(lug != null && lug.getEvento(id) != null)
        {
            return entityManager.find(EventoEntity.class, lug.getEvento(id));
        }
        else
        {
            return null;
        }
        
    }
    public List<EventoEntity> getEventos(LugarDTO lug)
    {
        if(lug != null)
        {
           ArrayList<EventoEntity> retornar = new ArrayList<EventoEntity>();
           int i = 0;
           int fin = lug.getEventos().size();
           while(i < fin)
           {
               EventoEntity ev = entityManager.find(EventoEntity.class, lug.getEventos().get(i));
               retornar.add(ev);
           }
           return retornar;
        }
        else
        {
            return null;
        }
    }
    
    public void deleteEvento(String id, LugarDTO lug)
    {
        lug.deleteEvento(id);
    }
    public void cleanLugar(LugarDTO lug)
    {
        lug.clean();
    }
 

}