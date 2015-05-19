package co.edu.uniandes.csw.LugarGroup.lugar.logic.entity;

import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.entity.CiudadEntity;
import co.edu.uniandes.csw.eventoGroup.evento.logic.entity.EventoEntity;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.entity.HotelEntity;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.entity.transporteEntity;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.DATE;



@Entity
public class LugarEntity  implements Serializable{

    /*constante de serializacion*/
  private static final long serialVersionUID = 2405172041950251807L;

    @Id
    @GeneratedValue(generator = "Lugar")
    
    private String id;

    @Temporal(DATE)
    private Date inico;
    
    @Temporal(DATE)
    private Date fin;
    
    private HotelEntity HotelActual;
    
    private transporteEntity transporteActual;
    
    private List<EventoEntity> eventos;
    
    private CiudadEntity ciudad;
public LugarEntity(){}

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
    public HotelEntity getHotelActual() {
        return this.HotelActual;
    }

    /**
     * @param hotelActual the hotelActual to set
     */
    public void setIDHotelActual(HotelEntity hotel) {
        this.HotelActual = hotel;
    }

    /**
     * @return the transporteActual
     */
    public transporteEntity getTransporteActual() {
        return transporteActual;
    }

    /**
     * @param transporteActual the transporteActual to set
     */
    public void setIDTransporteActual(transporteEntity transport) {
        this.transporteActual = transport;
    }

    /**
     * @return the eventos
     */
    public List<EventoEntity> getEventos() {
        return eventos;
    }

    /**
     * @param ideventos id de los eventos to set
     */
    public void setEventos(List<EventoEntity> eventos) {
        this.eventos = eventos;
    }

    /**
     * Agrega un evento a la lista que entra por parametro
     */
    public void agregarEvento(EventoEntity ev)
    {
        eventos.add(ev);
    }
    /**
     * @return the ciudad
     */
    public CiudadEntity getIDCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudadActual(CiudadEntity ciudad) {
        
        this.ciudad = ciudad;
    }
    
    public void cambiarEventoAnteriorPorNuevo(EventoEntity viejo, EventoEntity nuevo)
    {
        for(int i = 0; i < eventos.size(); i++)
        {
            if(eventos.get(i).getId().equals(viejo.getId()))
            {
                eventos.remove(i);
                eventos.add(i, nuevo);
                break;
            }
        }
    }
    
    public void eliminarTransporteActual()
    {
        transporteActual = null;
    }
 

}