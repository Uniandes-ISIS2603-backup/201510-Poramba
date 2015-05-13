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
    
    private String hotelActual;
    
    private String transporteActual;
    
    private List<String> IDeventos;
    
    private String ciudad;

    public LugarDTO(String i, Date ini, Date fn) 
    {
        this.id = i;
        this.inico = ini;
        this.fin = fn;
        IDeventos= new ArrayList<String>();
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
    public String getHotelActual() {
        return hotelActual;
    }
    /**
     * @param hotelActual the hotelActual to set
     */
    public void setHotelActual(String hotel) 
    {
        this.hotelActual = hotel;
    }
    /**
     * @return the transporteActual
     */
    public String getTransporteActual() {
        return transporteActual;
    }
    /**
     * @param transporteActual the transporteActual to set
     */
    public void setTransporteActual(String transport) {
        this.transporteActual = transport;
    }
    /**
     * @return the eventos
     */
    public List<String> getEventos() {
        return IDeventos;
    }
    /**
     * @param eventos the eventos to set
     */
    public void setEventos(List<String> eventos) {
        this.IDeventos = eventos;
    }
    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }
    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String city) {
        this.ciudad = city;
    }
    public void addEvento(String evento)
    {
        IDeventos.add(evento);
    }
    public void deleteEvento(String evento)
    {
        IDeventos.remove(evento);
    }
    public String getEvento(String id)
    {
        for (int i = 0; i < IDeventos.size(); i++) 
        {
            if(IDeventos.get(i).equals(id))
            {
               return IDeventos.get(i);
            }
        }
        return null;
    }
    public void clean()
    {
        hotelActual = null;
        transporteActual = null;
        IDeventos = null;
        ciudad = null;
    }
}