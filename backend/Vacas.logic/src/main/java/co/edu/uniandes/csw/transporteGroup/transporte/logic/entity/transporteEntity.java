package co.edu.uniandes.csw.transporteGroup.transporte.logic.entity;

import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.entity.CiudadEntity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class transporteEntity implements Serializable{

    @Id
    @GeneratedValue(generator = "transporte")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private CiudadEntity ciudad_origen;
    private CiudadEntity ciudad_destino;
    private Long distancia;
    private Integer medio_de_transporte;
    private String reglas;

    public CiudadEntity getCiudad_origen() {
        return ciudad_origen;
    }

    public void setCiudad_origen(CiudadEntity ciudad_origen) {
        this.ciudad_origen = ciudad_origen;
    }

    public CiudadEntity getCiudad_destino() {
        return ciudad_destino;
    }

    public void setCiudad_destino(CiudadEntity ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    public Long getDistancia() {
        return distancia;
    }

    public void setDistancia(Long distancia) {
        this.distancia = distancia;
    }

    public Integer getMedio_de_transporte() {
        return medio_de_transporte;
    }

    public void setMedio_de_transporte(Integer medio_de_transporte) {
        this.medio_de_transporte = medio_de_transporte;
    }

    public String getReglas() {
        return reglas;
    }

    public void setReglas(String reglas) {
        this.reglas = reglas;
    }

}
