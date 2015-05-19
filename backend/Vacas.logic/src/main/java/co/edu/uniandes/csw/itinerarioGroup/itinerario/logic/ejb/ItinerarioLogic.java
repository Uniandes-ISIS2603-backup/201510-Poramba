package co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.ejb;

import co.edu.uniandes.csw.LugarGroup.lugar.logic.converter.LugarConverter;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.dto.LugarDTO;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.entity.LugarEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.api.IitinerarioLogic;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.converter.itinerarioConverter;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.dto.itinerarioDTO;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.dto.itinerarioPageDTO;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.entity.itinerarioEntity;
import java.util.ArrayList;
import javax.persistence.Query;

public class ItinerarioLogic implements IitinerarioLogic {

    @PersistenceContext(unitName = "VacasClassPU")
    protected EntityManager entityManager;

    public itinerarioDTO createItinerario(itinerarioDTO detail) 
    {
        itinerarioEntity en = itinerarioConverter.persistenceDTO2Entity(detail);
//        List<LugarEntity> lug = this.getLugares(detail);
//        if(lug != null)
//        {
//            en.setLugares(lug);
//        }
        entityManager.persist(en);
        return itinerarioConverter.entity2PersistenceDTO(en);
    }

    public List<itinerarioDTO> getItinerarios() 
    {
        Query q = entityManager.createQuery("select u from itinerarioEntity u");
        return itinerarioConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public itinerarioDTO getItinerario(String id) 
    {
        return itinerarioConverter.entity2PersistenceDTO(entityManager.find(itinerarioEntity.class, id));
    }

    public void deleteItinerario(String id) 
    {
        itinerarioEntity en = entityManager.find(itinerarioEntity.class, id);
        entityManager.remove(en);
    }

    public void updateItinerario(itinerarioDTO detail) 
    {
        itinerarioEntity en = entityManager.merge(itinerarioConverter.persistenceDTO2Entity(detail));
        List<LugarEntity> lug = this.getLugares(detail);
        if(lug != null)
        {
            en.setLugares(lug);
        }
        itinerarioConverter.entity2PersistenceDTO(en);
    }

    public void addLugar(LugarDTO lugar, itinerarioDTO detail)
    {
        itinerarioEntity en = entityManager.merge(itinerarioConverter.persistenceDTO2Entity(detail));
        LugarEntity lug = entityManager.merge(LugarConverter.persistenceDTO2Entity(lugar));
        en.agregarLugares(lug);
        itinerarioConverter.entity2PersistenceDTO(en);
    }

    public List<LugarEntity> getLugares(itinerarioDTO detail) 
    {
        itinerarioEntity en = entityManager.merge(itinerarioConverter.persistenceDTO2Entity(detail));
        return en.getLugares();
    }

    public void deleteLugar(LugarDTO lug, itinerarioDTO detail) 
    {
        itinerarioEntity en = entityManager.merge(itinerarioConverter.persistenceDTO2Entity(detail));
        LugarEntity lugar = entityManager.merge(LugarConverter.persistenceDTO2Entity(lug));
        en.remove(lugar);
    }
    
    public void  clean(itinerarioDTO detail)
    {
        itinerarioEntity en = entityManager.merge(itinerarioConverter.persistenceDTO2Entity(detail));
        en.clean();
    }


    
    
}
