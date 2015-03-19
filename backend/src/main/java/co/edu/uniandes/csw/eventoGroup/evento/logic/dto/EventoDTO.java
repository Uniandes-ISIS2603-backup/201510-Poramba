package co.edu.uniandes.csw.SportGroup.evento.logic.dto;

import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.*;
import co.edu.uniandes.csw.SportGroup.transporte.logic.dto.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EventoDTO {
    private Long id;


    private String nombre;
    private Integer minage;
    private Integer maxage;
    private String rules;


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
    
    public Integer getMinAge() {
        return minage;
    }
    
    public void setMinAge(Integer minage) {
        this.minage = minage;
    }
    
    
    public Integer getMaxAge() {
        return maxage;
    }
    
    public void setMaxAge(Integer maxage) {
        this.maxage = maxage;
    }
    
    public String getRules() {
        return nombre;
    }
    
    public void setRules(String rules) {
        this.rules = rules;
    }

    

    
}