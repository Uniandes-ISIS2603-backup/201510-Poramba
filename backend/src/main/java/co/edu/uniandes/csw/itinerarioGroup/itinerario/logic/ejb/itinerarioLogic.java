package co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.ejb;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.converter.*;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.dto.itinerarioDTO;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.entity.*;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.api.IitinerarioLogic;

public class itinerarioLogic implements IitinerarioLogic {

    @PersistenceContext(unitName = "ItinerarioClassPU")
    protected EntityManager entityManager;

    public itinerarioDTO createCiudad(itinerarioDTO ciudad) {
        itinerarioEntity entity = itinerarioConverter.persistenceDTO2Entity(ciudad);
        entityManager.persist(entity);
        return itinerarioConverter.entity2PersistenceDTO(entity);
    }

    public List<itinerarioDTO> getItinerarios() {
        Query q = entityManager.createQuery("select u from itinerarioEntity u");
        return itinerarioConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public itinerarioDTO getItinerario(Long id) {
        return itinerarioConverter.entity2PersistenceDTO(entityManager.find(itinerarioEntity.class, id));
    }

    public void deleteItinerario(Long id) {
        itinerarioEntity entity = entityManager.find(itinerarioEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateItinerario(itinerarioDTO itinerario) {
        itinerarioEntity entity = entityManager.merge(itinerarioConverter.persistenceDTO2Entity(itinerario));
        itinerarioConverter.entity2PersistenceDTO(entity);
    }

}
