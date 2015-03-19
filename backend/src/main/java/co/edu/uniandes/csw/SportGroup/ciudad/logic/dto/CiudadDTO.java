package co.edu.uniandes.csw.SportGroup.ciudad.logic.dto;

import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.*;
import co.edu.uniandes.csw.SportGroup.transporte.logic.dto.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CiudadDTO {
    private Long id;

    private String nombre;
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

    public void Link(String link) {
        this.link = link;
    }
    
    public String hetLink() {
        return link;
    }
    
    
    
}