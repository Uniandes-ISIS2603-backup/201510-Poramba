package co.edu.uniandes.csw.LugarGroup.lugar.logic.entity;

import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.DATE;

@Entity
public class LugarEntity implements  Serializable {

    /*constante de serializacion*/
  private static final long serialVersionUID = 2405172041950251807L;
    @Id
    @GeneratedValue(generator = "Lugar")
    
    private String id;

    @Temporal(DATE)
    private Date inico;
    @Temporal(DATE)
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
    public void setNombreHotelActual(HotelDTO hotelActual) {
        this.hotelActual = hotelActual.getId();
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
    public void setNombreTransporteActual(transporteDTO transporteActual) {
        this.transporteActual = transporteActual.getId();
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
    public void setNombreCiudadActual(CiudadDTO ciudad) {
        
        this.ciudad = ciudad.getId();
    }
 

}