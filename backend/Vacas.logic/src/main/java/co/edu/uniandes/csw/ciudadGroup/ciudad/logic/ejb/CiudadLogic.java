package co.edu.uniandes.csw.ciudadGroup.ciudad.logic.ejb;

import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.api.ICiudadLogic;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.converter.CiudadConverter;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadPageDTO;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.entity.CiudadEntity;
import java.util.ArrayList;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


public class CiudadLogic implements ICiudadLogic{

    @PersistenceContext(unitName = "VacasClassPU")
    protected EntityManager entityManager;

    public CiudadDTO createCiudad(CiudadDTO detail) 
    {
        CiudadEntity entidad = CiudadConverter.persistenceDTO2Entity(detail);
        entityManager.persist(entidad);
        return CiudadConverter.entity2PersistenceDTO(entidad);
    }

    public List<CiudadDTO> getCiudades() 
    {
        Query q = entityManager.createQuery("select u from CiudadEntity u");
        return CiudadConverter.entity2PersistenceDTOList(q.getResultList());
        
    }

    public CiudadPageDTO getCiudades(Integer page,Integer maxRecords ) 
    {
        Query con = entityManager.createQuery("select count(u) from CiudadyEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(con.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from CiudadyEntity u");
        if(page != null && maxRecords != null)
        {
            q.setFirstResult((page -1)*maxRecords);
            q.setFirstResult(maxRecords);
        }
        CiudadPageDTO respuesta = new CiudadPageDTO();
        respuesta.setTotalRecords(regCount);
        respuesta.setRecords(CiudadConverter.entity2PersistenceDTOList(q.getResultList()));
        return respuesta;
    }

    public void deleteCiudad(String id) 
    {
        CiudadEntity entidad =entityManager.find(CiudadEntity.class, id);
        entityManager.remove(entidad);
    }

    public void updateCiudad(CiudadDTO detail, String id) 
    {
        CiudadEntity entidad = entityManager.merge(CiudadConverter.persistenceDTO2Entity(detail));
        CiudadConverter.entity2PersistenceDTO(entidad);
    }
    
    public CiudadDTO getCiudad(String id)
    {
        return CiudadConverter.entity2PersistenceDTO(entityManager.find(CiudadEntity.class, id));
    }
    

}

   
