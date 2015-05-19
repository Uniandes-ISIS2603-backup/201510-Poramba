package co.edu.uniandes.csw.eventoGroup.evento.logic.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EventoDTO {

    private String id;

    private String nombre;
    private Integer minage;
    private Integer maxage;
    private String rules;
    private String ciudad;

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
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
