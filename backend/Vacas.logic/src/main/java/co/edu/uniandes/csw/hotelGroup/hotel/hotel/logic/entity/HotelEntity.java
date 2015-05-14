package co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.entity;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HotelEntity implements Serializable{

    @Id
    @GeneratedValue(generator = "Hotel")
    private String id;    
    private String nombre;
    private String ubicacion;
    private Integer estrellas;
    private String descripcion;
    private String link;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public Integer getEstrellas() {
        return estrellas;
    }
    
    public void setEstrelas(Integer estrellas) {
        this.estrellas = estrellas;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDecripcion(String descripcion) {
        this.descripcion = descripcion;
    }
     
     public void setEstrellas(Integer estrellas) {
        this.estrellas = estrellas;
    }
    
     public String getLink() {
        return link;
    }
    
    public void setLink(String link) {
        this.link = link;
    }

    public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
    }

    
    
}
