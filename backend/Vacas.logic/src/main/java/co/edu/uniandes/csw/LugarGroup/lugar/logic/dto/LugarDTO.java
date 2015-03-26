package co.edu.uniandes.csw.LugarGroup.lugar.logic.dto;


import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.*;
import co.edu.uniandes.csw.eventoGroup.evento.logic.dto.EventoDTO;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LugarDTO {
    private String id;

    private Date inico;
    private Date fin;
    
    private HotelDTO hotelActual;
    
    private transporteDTO transporteActual;
    
    private List<EventoDTO> eventos;
    
    private CiudadDTO ciudad;

    public LugarDTO(String id, Date inico, Date fin) 
    {
        this.id = id;
        this.inico = inico;
        this.fin = fin;
        eventos= new ArrayList<EventoDTO>();
    }

    
    

    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the inico
     */
    public Date getInico() {
        return inico;
    }

    /**
     * @param inico the inico to set
     */
    public void setInico(Date inico) {
        this.inico = inico;
    }

    /**
     * @return the fin
     */
    public Date getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(Date fin) {
        this.fin = fin;
    }

    /**
     * @return the hotelActual
     */
    public HotelDTO getHotelActual() {
        return hotelActual;
    }

    /**
     * @param hotelActual the hotelActual to set
     */
    public void setHotelActual(HotelDTO hotelActual) {
        this.hotelActual = hotelActual;
    }

    /**
     * @return the transporteActual
     */
    public transporteDTO getTransporteActual() {
        return transporteActual;
    }

    /**
     * @param transporteActual the transporteActual to set
     */
    public void setTransporteActual(transporteDTO transporteActual) {
        this.transporteActual = transporteActual;
    }

    /**
     * @return the eventos
     */
    public List<EventoDTO> getEventos() {
        return eventos;
    }

    /**
     * @param eventos the eventos to set
     */
    public void setEventos(List<EventoDTO> eventos) {
        this.eventos = eventos;
    }

    /**
     * @return the ciudad
     */
    public CiudadDTO getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(CiudadDTO ciudad) {
        this.ciudad = ciudad;
    }
    
    
    public boolean addEvento(EventoDTO evento)
    {
        for (int i = 0; i < eventos.size(); i++) 
        {
            EventoDTO actual = eventos.get(i);
            if(actual.getId().equals(evento.getId()))
                    {
                         return false;
                    }
           
        }
        
        eventos.add(evento);
        return true;
    }
    
    public boolean deleteEvento(String id)
    {
        for (int i = 0; i < eventos.size(); i++) 
        {
            EventoDTO actual = eventos.get(i);
            if(actual.getId().equals(id))
            {
                eventos.remove(i);
                 return true;
             }
              
        }
        
        return false;
        
    }
    
    public EventoDTO getEvento(String id)
    {
        for (int i = 0; i < eventos.size(); i++) 
        {
            EventoDTO actual = eventos.get(i);
            if(actual.getId().equals(id))
            {
               return actual;
                
                 
            }
              
        }
        
        return null;
        
    }
    /**
     * Retorna un evento por su posicion 
     * @param id Id del evento
     * @return la posicion del evento, -1 si no lo encuentra
     */
    public int eventoPosicion(String id)
    {
        int aRetornar=-1;
        
         for (int i = 0; i < eventos.size(); i++) 
        {
            EventoDTO actual = eventos.get(i);
            if(actual.getId().equals(id))
            {
                aRetornar=i;
               return aRetornar;
                
                 
            }
              
        }
         return aRetornar;
    }
        
    
    public void clean()
    {
     
        hotelActual = null;
        transporteActual = null;
        eventos = null;
        ciudad = null;
    }
        
    
   
    
}