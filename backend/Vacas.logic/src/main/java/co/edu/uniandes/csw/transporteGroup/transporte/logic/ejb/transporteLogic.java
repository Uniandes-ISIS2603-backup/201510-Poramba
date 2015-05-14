package co.edu.uniandes.csw.transporteGroup.transporte.logic.ejb;

import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.converter.CiudadConverter;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.entity.CiudadEntity;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.api.ITransporteLogic;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.converter.transporteConverter;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.entity.transporteEntity;
import java.util.ArrayList;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.mail.event.TransportEvent;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

   @Default
    @Stateless
    @LocalBean
public class transporteLogic implements ITransporteLogic {


    @PersistenceContext(unitName = "VacasClassPU")
    protected EntityManager entityManager;

 
    public transporteDTO createtransporte(transporteDTO detail)
    {
        transporteEntity ent = transporteConverter.persistenceDTO2Entity(detail);
        CiudadEntity or = this.getCiudadOrigen(detail);
        CiudadEntity des = this.getCiudadDestino(detail);
        if(or != null)
        {
            ent.setCiudad_origen(or);
        }
        if(des != null)
        {
            ent.setCiudad_destino(des);
        }
        entityManager.persist(ent);
        return transporteConverter.entity2PersistenceDTO(ent);
    }

    public List<transporteDTO> getTrantransportes()
    {
        Query q = entityManager.createQuery("select u from transporteEntity u");
        return transporteConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public transporteDTO gettransporte(String id) 
    {
       return transporteConverter.entity2PersistenceDTO(entityManager.find(transporteEntity.class, id));
       
    }

    public void deletetransporte(String id) 
    {
        transporteEntity en = entityManager.find(transporteEntity.class, id);
        entityManager.remove(en);
    }

    public void updatetransporte(transporteDTO detail) 
    {
        transporteEntity en = entityManager.merge(transporteConverter.persistenceDTO2Entity(detail));
        CiudadEntity ori = this.getCiudadOrigen(detail);
        CiudadEntity des = this.getCiudadDestino(detail);
        if(ori != null)
        {
            en.setCiudad_origen(ori);
        }
        if(des != null)
        {
            en.setCiudad_destino(des);
        }
        transporteConverter.entity2PersistenceDTO(en);
    }
    public void setCiudadOrigen(CiudadDTO origen, transporteDTO detail) 
    {
        transporteEntity en = entityManager.merge(transporteConverter.persistenceDTO2Entity(detail));
        CiudadEntity ci = entityManager.merge(CiudadConverter.persistenceDTO2Entity(origen));
        en.setCiudad_origen(ci);
        transporteConverter.entity2PersistenceDTO(en);
    }

    public void setCiudadDestino(CiudadDTO destino, transporteDTO detail)
    {
         transporteEntity en = entityManager.merge(transporteConverter.persistenceDTO2Entity(detail));
        CiudadEntity ci = entityManager.merge(CiudadConverter.persistenceDTO2Entity(destino));
        en.setCiudad_origen(ci);
        transporteConverter.entity2PersistenceDTO(en);
    }

    public CiudadEntity getCiudadOrigen(transporteDTO detail) 
    {
        if(detail != null && detail.getCiudad_origen() != null)
        {
            return entityManager.find(CiudadEntity.class, detail.getCiudad_origen());
        }
        else
        {
            return null;
        }
    }

    public CiudadEntity getCiudadDestino(transporteDTO detail) 
    {
                if(detail != null && detail.getCiudad_destino()!= null)
        {
            return entityManager.find(CiudadEntity.class, detail.getCiudad_destino());
        }
        else
        {
            return null;
        }
    }



}
