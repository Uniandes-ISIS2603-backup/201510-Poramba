package co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HotelDTO {
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
    
    public void setDescripcion(String descripcion) {
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