package co.edu.uniandes.csw.CiudadGroup.ciudad.logic.entity;

import co.edu.uniandes.csw.SportGroup.usuario.logic.entity.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CiudadEntity {

    @Id
    @GeneratedValue(generator = "Ciudad")
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
