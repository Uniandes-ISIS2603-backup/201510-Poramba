package co.edu.uniandes.csw.transporteGroup.transporte.logic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class transporteEntity {
	

    @Id
    @GeneratedValue(generator = "transporte")
    private String id;
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String ciudad_origen;
    private String ciudad_destino;
    private Long distancia;
    private Integer medio_de_transporte;
    private String reglas ;
	public String getCiudad_origen() {
		return ciudad_origen;
	}
	public void setCiudad_origen(String ciudad_origen) {
		this.ciudad_origen = ciudad_origen;
	}
	public String getCiudad_destino() {
		return ciudad_destino;
	}
	public void setCiudad_destino(String ciudad_destino) {
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
