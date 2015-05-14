package co.edu.uniandes.csw.eventoGroup.evento.logic.ejb;

import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.converter.CiudadConverter;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.entity.CiudadEntity;
import co.edu.uniandes.csw.eventoGroup.evento.logic.dto.EventoDTO;
import co.edu.uniandes.csw.eventoGroup.evento.logic.api.IEventoLogic;
import co.edu.uniandes.csw.eventoGroup.evento.logic.converter.EventoConverter;
import co.edu.uniandes.csw.eventoGroup.evento.logic.entity.EventoEntity;
import java.util.ArrayList;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class EventoLogic implements IEventoLogic {

    @PersistenceContext(unitName = "VacasClassPU")
    protected EntityManager entityManager;
    
    public EventoDTO createEvento(EventoDTO detail) 
    {
        EventoEntity entidad = EventoConverter.persistenceDTO2Entity(detail);
        CiudadEntity ciudad = this.getCiudad(detail);
        if(ciudad != null)
        {
            entidad.setCiudad(ciudad);
        }
        entityManager.persist(entidad);
        return EventoConverter.entity2PersistenceDTO(entidad);
    }

    public List<EventoDTO> getEventos()
    {
        Query q = entityManager.createNamedQuery("select u from EventiEntity u");
        return EventoConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public EventoDTO getEvento(String id) 
    {
        EventoEntity even = entityManager.find(EventoEntity.class, id);
        return EventoConverter.entity2PersistenceDTO(even);
    }

    public void deleteEvento(String id) 
    {
        EventoEntity e = entityManager.find(EventoEntity.class, id);
        entityManager.remove(e);
    }

    public void updateEvento(EventoDTO detail) 
    {
        EventoEntity e = entityManager.merge(EventoConverter.persistenceDTO2Entity(detail));
        CiudadEntity c = this.getCiudad(detail);
        if(c != null)
        {
            e.setCiudad(c);
        }
        EventoConverter.entity2PersistenceDTO(e);
    }

    public void setCiudad(CiudadDTO ciudad, EventoDTO detail) 
    {
        EventoEntity e = entityManager.merge(EventoConverter.persistenceDTO2Entity(detail));
        CiudadEntity c = entityManager.merge(CiudadConverter.persistenceDTO2Entity(ciudad));
        e.setCiudad(c);
    }

    public CiudadEntity getCiudad(EventoDTO detail)
    {
        EventoEntity e = entityManager.merge(EventoConverter.persistenceDTO2Entity(detail));
        return e.getCiudad();
    }



}

   
    

  
