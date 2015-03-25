package co.edu.uniandes.csw.transporteGroup.transporte.logic.ejb;

import co.edu.uniandes.csw.CiudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.api.ITransporteLogic;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.converter.transporteConverter;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.entity.transporteEntity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class transporteLogic implements ITransporteLogic {

    @PersistenceContext(unitName = "TransporteClassPU")
    protected EntityManager entityManager;

    public transporteDTO createTransporte(transporteDTO transporte) {
        transporteEntity entity = transporteConverter.persistenceDTO2Entity(transporte);
        entityManager.persist(entity);
        return transporteConverter.entity2PersistenceDTO(entity);
    }

    public List<transporteDTO> getTransportes() {
        Query q = entityManager.createQuery("select u from transporteEntity u");
        return transporteConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public transporteDTO getTransporte(Long id) {
        return transporteConverter.entity2PersistenceDTO(entityManager.find(transporteEntity.class, id));
    }

    public void deleteTransporte(String id) {
        transporteEntity entity = entityManager.find(transporteEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateTransporte(transporteDTO transporte) {
        transporteEntity entity = entityManager.merge(transporteConverter.persistenceDTO2Entity(transporte));
        transporteConverter.entity2PersistenceDTO(entity);
    }

}
