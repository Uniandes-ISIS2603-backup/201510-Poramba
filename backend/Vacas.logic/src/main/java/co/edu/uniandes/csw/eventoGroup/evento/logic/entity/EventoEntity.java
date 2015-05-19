package co.edu.uniandes.csw.eventoGroup.evento.logic.entity;

import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.entity.CiudadEntity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EventoEntity implements Serializable{
  private static final long serialVersionUID = 240572041950251807L;
     @Id private String id;
    private String nombre;
    private Integer minage;
    private Integer maxage;
    private String rules;
    private CiudadEntity ciudad;

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

    public CiudadEntity getCiudad() {
        return ciudad;
    }

    public void setCiudad(CiudadEntity ciudad) {
        this.ciudad = ciudad;
    }

}
