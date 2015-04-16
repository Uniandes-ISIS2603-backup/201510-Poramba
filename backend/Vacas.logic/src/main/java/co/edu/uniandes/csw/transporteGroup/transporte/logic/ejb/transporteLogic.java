package co.edu.uniandes.csw.transporteGroup.transporte.logic.ejb;

import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.api.ITransporteLogic;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
import java.util.ArrayList;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class transporteLogic implements ITransporteLogic {

    List<transporteDTO> transportes;
    CiudadDTO origen;
    CiudadDTO destino;

    public transporteLogic() {
        transportes = new ArrayList<transporteDTO>();
    }

    @PersistenceContext(unitName = "VacasClassPU")
    protected EntityManager entityManager;

//    public transporteDTO createTransporte(transporteDTO transporte) {
//        
////        transportes.add(transporte);
////        return transporte;
////        transporteEntity entity = transporteConverter.persistenceDTO2Entity(transporte);
////        entityManager.persist(entity);
////        return transporteConverter.entity2PersistenceDTO(entity);
//    }
//    public List<transporteDTO> getTransportes() {
//        return transportes;
////        Query q = entityManager.createQuery("select u from transporteEntity u");
////        return transporteConverter.entity2PersistenceDTOList(q.getResultList());
//    }
//    public transporteDTO getTransporte(String id) {
//        transporteDTO respuesta = null;
//        int act = transportes.size();
//        for(int i = 0; i <act; i++)
//        {
//            if(transportes.get(i).getId().equals(id)) respuesta = transportes.get(i); break; 
//        }
//        return respuesta;
////        return transporteConverter.entity2PersistenceDTO(entityManager.find(transporteEntity.class, id));
//    }
//    public void deleteTransporte(String id) {
//        transporteDTO trans = getTransporte(id);
//        if( trans != null)transportes.remove(trans);
//
////        transporteEntity entity = entityManager.find(transporteEntity.class, id);
////        entityManager.remove(entity);
//    }
//    public void updateTransporte(transporteDTO transporte, String id) {
//        transporteDTO trans = getTransporte(id);
//        if(trans != null)
//        {
//            boolean ya = false;
//            int i = 0;
//            while(!ya)
//            {
//                if(transportes.get(i) == trans)ya = true;
//                else i++;
//            }
//            transportes.set(i, transporte);
//            transportes.remove(trans);
//        }
//    }
    public void setCiudadOrigen(CiudadDTO origen) {
        this.origen = origen;
    }

    public void setCiudadDestino(CiudadDTO destino) {
        this.destino = destino;
    }

    public CiudadDTO getCiudadOrigen() {
        return origen;
    }

    public CiudadDTO getCiudadDestino() {
        return destino;
    }

//        transporteEntity entity = entityManager.merge(transporteConverter.persistenceDTO2Entity(transporte));
//        transporteConverter.entity2PersistenceDTO(entity);
    public transporteDTO createtransporte(transporteDTO detail) {
        transportes.add(detail);
        return detail;
    }

    public List<transporteDTO> getTrantransportes() {
        return transportes;
    }

    public transporteDTO gettransporte(String id) {
        transporteDTO respuesta = null;
        int act = transportes.size();
        for (int i = 0; i < act; i++) {
            if (transportes.get(i).getId().equals(id)) {
                respuesta = transportes.get(i);
            }
            break;
        }
        return respuesta;
    }

    public void deletetransporte(String id) {
        transporteDTO trans = gettransporte(id);
        if (trans != null) {
            transportes.remove(trans);
        }
    }

    public void updatetransporte(transporteDTO detail, String id) {
        transporteDTO trans = gettransporte(id);
        if (trans != null) {
            boolean ya = false;
            int i = 0;
            while (!ya) {
                if (transportes.get(i) == trans) {
                    ya = true;
                } else {
                    i++;
                }
            }
            transportes.set(i, detail);
            transportes.remove(trans);
        }
    }

}
