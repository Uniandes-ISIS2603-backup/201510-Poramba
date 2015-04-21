package co.edu.uniandes.csw.LugarGroup.lugar.logic.ejb;


import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.api.ILugarLogic;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.dto.LugarDTO;
import co.edu.uniandes.csw.eventoGroup.evento.logic.dto.EventoDTO;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


public class LugarLogic implements ILugarLogic{

    @PersistenceContext(unitName = "VacasClassPU")
    protected EntityManager entityManager;
    /**
     * Lista con los lugares actuales
     */
    private List<LugarDTO> lugares;
    /**
     * Lugar actual
     */
    private LugarDTO actual;
    
    /**
     * Constuctor de la clase LugarLogic
     */
   public LugarLogic()
   {
       lugares= new ArrayList<LugarDTO>();
       actual=null;
   }  
         
   /**
    * Crea un lugar
    * @param detail Lugar a crear
    * @return El lugar creado, nulo si ya existe.
    */
    public LugarDTO createLugar(LugarDTO detail) 
    {
        LugarDTO aRetornar=null;
       Iterator<LugarDTO> actuales= lugares.iterator();
       
       while(actuales.hasNext())
       {
          LugarDTO actual= actuales.next();
          if(actual.getId().equals(detail.getId()))
          {
              return aRetornar;
          }
              
       }
        
       lugares.add(detail);
       actual=detail;
       return detail;
    }
    
    /**
     * Retorna la ciudad asociada al lugar 
     * @return La ciuda asociadoa
     */
    public CiudadDTO getCiudad()
    {
        return actual.getCiudad();
    }

    public CiudadDTO addCiudad(CiudadDTO detail) 
    {
        boolean aRetonrar=actual.getCiudad()==null?true:false;
        
        if(aRetonrar)
        {
            actual.setCiudad(detail.getId());
            return detail;
        }
        return null;
    }

    public boolean deleteCiudad() 
    {
         boolean aRetonrar=actual.getCiudad()==null?true:false;
         if(aRetonrar)
        {
            actual.setCiudad(null);
            
        }
        return aRetonrar;
        }

    public CiudadDTO updateCiudad(CiudadDTO ciudad) 
    {
        actual.setCiudad(ciudad.getId());
        return ciudad;
    }

    public EventoDTO addEvento(EventoDTO detail) 
    {
       
       if(actual.addEvento(detail.getId()))
       {
           return detail;
       }
           return null;
    }

    public EventoDTO getEvento(String id)
    {
        return actual.getEvento(id);
    }

    public List<EventoDTO> getEventos() {
        return actual.getEventos();
        }

    public boolean deleteEvento(String id) 
    {
     return actual.deleteEvento(id);
       }

    public void cleanLugar()
    {
        actual.clean();
       }

    public EventoDTO updateEvento(String idActual, EventoDTO nuevo) 
    {
       int pos=actual.eventoPosicion(idActual);
       if(pos!=-1)
       {
           actual.getEventos().set(pos, nuevo);
       }
       return null;
     }

    public transporteDTO addTransporte(transporteDTO detail) 
    {
       if( actual.getTransporteActual()==null)
       {
           actual.setTransporteActual(detail.getId());
           return detail;
       }
       return null;
     }

    public void updateTransporte(transporteDTO detail)
    {
      actual.setTransporteActual(detail.getId());
     }

    public boolean deleteTRanporte()
    {
      if(actual.getTransporteActual()!=null)
      { 
          actual.setTransporteActual(null);
          return true;
      }
      return false;
    }
    

    public transporteDTO getTransporte() 
    {
        return actual.getTransporteActual();
      }

    public HotelDTO addHotel(HotelDTO detail) 
    {
     if(actual.getHotelActual()==null)
     {
         actual.setHotelActual(detail.getId());
         return detail;
     }
     return null;
         }

    public boolean deleteHotel() {
        
        if(actual.getHotelActual()!=null)
        {
            
            actual.setHotelActual(null);
            return  true;
        } 
           return false;
    }

    public HotelDTO getHotel() 
    {
     return actual.getHotelActual() ;
     }

    public HotelDTO setHotel(HotelDTO hotel) 
    {
        
         actual.setHotelActual(hotel.getId());
         return hotel;
      }

    public LugarDTO getLugar(String id)
    {
        for (int i = 0; i < lugares.size(); i++)
        {
            LugarDTO actual = lugares.get(i);
            if(actual.getId().equals(id))
            {
                return actual;
            }
        }
        return null;
     }

    public boolean deleteLugar(String id)
    {
        
        for (int i = 0; i < lugares.size(); i++)
        {
            LugarDTO actual = lugares.get(i);
            if(actual.getId().equals(id))
            {
                lugares.remove(i);
                return true;
            }
        }
        return false;
     }

    public LugarDTO updateLugar(LugarDTO lugar)
    {
         
        for (int i = 0; i < lugares.size(); i++)
        {
            LugarDTO actual = lugares.get(i);
            if(actual.getId().equals(lugar.getId()))
            {
                lugares.set(i, lugar);
                return lugar;
            }
        }
        return null;
        
    }
    
     /**
     *Cambia el lugar actual por el dado por parametro
     * @param lugar Nuevo lugar actual
     * @return El nuevi lugar, nulo so no exosten lugares.
     */
    public LugarDTO setLugar(LugarDTO lugar)
    {
        actual=lugar;
        return lugar;
    }

}
