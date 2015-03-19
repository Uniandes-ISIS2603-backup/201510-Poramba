package co.edu.uniandes.csw.SportGroup.evento.logic.ejb;

import co.edu.uniandes.csw.SportGroup.usuario.logic.ejb.*;
import co.edu.uniandes.csw.SportGroup.evento.logic.api.IEventoLogic;
import co.edu.uniandes.csw.SportGroup.country.logic.converter.CountryConverter;
import co.edu.uniandes.csw.SportGroup.country.logic.dto.CountryDTO;
import co.edu.uniandes.csw.SportGroup.country.logic.entity.CountryEntity;
import co.edu.uniandes.csw.SportGroup.evento.logic.api.IEventoLogic;
import co.edu.uniandes.csw.SportGroup.evento.logic.converter.EventoConverter;
import co.edu.uniandes.csw.SportGroup.evento.logic.dto.EventoDTO;
import co.edu.uniandes.csw.SportGroup.evento.logic.dto.EventoPageDTO;
import co.edu.uniandes.csw.SportGroup.evento.logic.entity.EventoEntity;
import co.edu.uniandes.csw.SportGroup.usuario.logic.api.IUsuarioLogic;
import co.edu.uniandes.csw.SportGroup.usuario.logic.converter.UsuarioConverter;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioDTO;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioPageDTO;
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

    public EventoPageDTO getEventos(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from EventoEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from EventoEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        EventoPageDTO response = new EventoPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(EventoConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
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

    /*public CountryDTO getMostPopulated() {
        Query query = entityManager.createQuery("select u from CountryEntity u WHERE u.population = (SELECT MAX(v.population) from CountryEntity v)");
        return CountryConverter.entity2PersistenceDTO((CountryEntity)query.getSingleResult());
    }

    public CountryDTO getLeastPopulated() {
        Query query = entityManager.createQuery("select u from CountryEntity u WHERE u.population = (SELECT MIN(v.population) from CountryEntity v)");
        return CountryConverter.entity2PersistenceDTO((CountryEntity)query.getSingleResult());
    }*/
}
