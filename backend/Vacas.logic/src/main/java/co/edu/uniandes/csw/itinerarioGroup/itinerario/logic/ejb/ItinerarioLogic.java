package co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.ejb;

import co.edu.uniandes.csw.LugarGroup.lugar.logic.dto.LugarDTO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.api.IitinerarioLogic;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.dto.itinerarioDTO;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.dto.itinerarioPageDTO;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.entity.itinerarioEntity;
import java.util.ArrayList;

public class ItinerarioLogic implements IitinerarioLogic {

    @PersistenceContext(unitName = "VacasClassPU")
    protected EntityManager entityManager;
    
    public List<itinerarioDTO> itinerarios;
    public itinerarioDTO itinerarioActual;
    
    public ItinerarioLogic()
    {
        itinerarios= new ArrayList<itinerarioDTO>();
        itinerarioActual=null;
    }
    
    public itinerarioDTO createItinerario(itinerarioDTO detail) 
    {
        for (int i = 0; i < itinerarios.size(); i++) 
        {
            itinerarioDTO actual = itinerarios.get(i);
            if(actual.getId().equals(detail.getId()))
            {
                
                return null;
            }
        }
        itinerarios.add(detail);
        return detail;
     }

    public List<itinerarioDTO> getItinerarios()
    {
     return itinerarios;
    }

    //public itinerarioPageDTO getItinerarios(Integer page, Integer maxRecords) 
    {
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public itinerarioDTO getItinerario(String id)
    {
    for (int i = 0; i < itinerarios.size(); i++) 
        {
            itinerarioDTO actual = itinerarios.get(i);
            if(actual.getId().equals(id))
            {
                
                return actual;
            }
        }
       
        return null; 
    }

    public boolean deleteItinerario(String id) 
    {
      for (int i = 0; i < itinerarios.size(); i++) 
        {
            itinerarioDTO actual = itinerarios.get(i);
            if(actual.getId().equals(id))
            {
                itinerarios.remove(i);
                return true;
            }
        }
       
        return false; 
    
    }

    public void updateItinerario(itinerarioDTO detail)
    {
        itinerarioActual=detail;
    
    }

    public LugarDTO addLugar(LugarDTO lugar)
    {
       return  itinerarioActual.addLugar(lugar);
      }

    public List<LugarDTO> getLugares()
    {
        return itinerarioActual.getLugares();
    }

    public LugarDTO getLugar(String id) {
     return itinerarioActual.getLugar(id);
             }

    public boolean deleteLugar(String id) 
    {
     return itinerarioActual.deleteLugar(id);
     }

    public void updateLugar(String idACambiar, LugarDTO nuevo)
    {
        int pos=itinerarioActual.posiionLugar(idACambiar);
        
        if(pos!=-1)
        {
         itinerarioActual.getLugares().set(pos, nuevo);
        }
     }

  
    public void clean()   
    {
        itinerarios= new ArrayList<itinerarioDTO>();
     }

    

}
