package co.edu.uniandes.csw.SportGroup.hotel.logic.entity;

import co.edu.uniandes.csw.SportGroup.usuario.logic.entity.*;
import co.edu.uniandes.csw.SportGroup.transporte.logic.entity.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HotelEntity {

    @Id
    @GeneratedValue(generator = "Hotel")
    private Long id;    
    private String nombre;
    private String ubicacion;
    private Integer estrellas;
    private String descripcion;
    private String link;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    
    
}
