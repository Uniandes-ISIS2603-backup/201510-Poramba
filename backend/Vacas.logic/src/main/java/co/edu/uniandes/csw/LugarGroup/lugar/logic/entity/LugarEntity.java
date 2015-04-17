package co.edu.uniandes.csw.LugarGroup.lugar.logic.entity;

import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.eventoGroup.evento.logic.dto.EventoDTO;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LugarEntity {

    @Id
    @GeneratedValue(generator = "Lugar")
    
    private String id;

    private Date inico;
    private Date fin;
    
    private String hotelActual;
    
    private String transporteActual;
    
    private List<String> eventos;
    
    private String ciudad;

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
    public String getNombreHotelActual() {
        return hotelActual;
    }

    /**
     * @param hotelActual the hotelActual to set
     */
    public void setNombreHotelActual(String hotelActual) {
        this.hotelActual = hotelActual;
    }

    /**
     * @return the transporteActual
     */
    public String getNombreTransporteActual() {
        return transporteActual;
    }

    /**
     * @param transporteActual the transporteActual to set
     */
    public void setNombreTransporteActual(String transporteActual) {
        this.transporteActual = transporteActual;
    }

    /**
     * @return the eventos
     */
    public List<String> getEventos() {
        return eventos;
    }

    /**
     * @param eventos the eventos to set
     */
    public void setEventos(List<String> eventos) {
        this.eventos = eventos;
    }

    /**
     * @return the ciudad
     */
    public String getNombreCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setNombreCiudadActual(String ciudad) {
        this.ciudad = ciudad;
    }
 

}