package co.edu.uniandes.csw.LugarGroup.lugar.logic.dto;


import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LugarDTO {
    private Long id;

    private String nombre;
    private String descripcion;
    private String link;
    private String pasaporte;


    public String getPasaporte()
    {
        return pasaporte;
    }
//    public void setPasaporte(String pasaporte)
//    {
//        this.pasaporte = pasaporte;
//    }
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

    public void Link(String link) {
        this.link = link;
    }
    
    public String getLink() {
        return link;
    }
    public void setLink(String link)
    {
        this.link = link;
    }
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    
    
    
}