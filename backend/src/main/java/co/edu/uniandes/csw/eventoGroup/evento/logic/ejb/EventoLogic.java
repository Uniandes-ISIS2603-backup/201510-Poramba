package co.edu.uniandes.csw.eventoSportGroup.evento.logic.ejb;


import co.edu.uniandes.csw.eventoGroup.evento.logic.dto.EventoDTO;
import co.edu.uniandes.csw.eventoGroup.evento.logic.api.IEventoLogic;
import co.edu.uniandes.csw.eventoGroup.evento.logic.converter.*;
import co.edu.uniandes.csw.eventoGroup.evento.logic.entity.*;
import co.edu.uniandes.csw.eventoGroup.evento.logic.dto.*;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class EventoLogic implements IEventoLogic{

    @PersistenceContext(unitName = "EventoClassPU")
    protected EntityManager entityManager;

    public EventoDTO createEvento(EventoDTO evento) {
        EventoEntity entity =EventoConverter.persistenceDTO2Entity(evento);
        entityManager.persist(entity);
        return EventoConverter.entity2PersistenceDTO(entity);
    }

    public List<EventoDTO> getEventos() {
        Query q = entityManager.createQuery("select u from EventoEntity u");
        return EventoConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public EventoDTO getEvento(Long id) {
        return EventoConverter.entity2PersistenceDTO(entityManager.find(EventoEntity.class, id));
    }

    public void deleteEvento(Long id) {
       EventoEntity entity = entityManager.find(EventoEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateEvento(EventoDTO evento) {
        EventoEntity entity = entityManager.merge(EventoConverter.persistenceDTO2Entity(evento));
        EventoConverter.entity2PersistenceDTO(entity);
    }


  
}
