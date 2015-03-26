package co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.entity;

import co.edu.uniandes.csw.LugarGroup.lugar.logic.dto.LugarDTO;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class itinerarioEntity {
	

    @Id
    @GeneratedValue(generator = "itinerario")
    private String nombe;
	private String descripcion;
	private String terminacion;
	private String acciones;
	private String id;
        private List<LugarDTO> lugares;

    public List<LugarDTO> getLugares() 
    {
        return lugares;
    }

    public void setLugares(List<LugarDTO> lugares)
    {
        this.lugares = lugares;
    }
        
	public String getNombe() {
		return nombe;
	}
	public void setNombe(String nombe) {
		this.nombe = nombe;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTerminacion() {
		return terminacion;
	}
	public void setTerminacion(String terminacion) {
		this.terminacion = terminacion;
	}
	public String getAcciones() {
		return acciones;
	}
	public void setAcciones(String acciones) {
		this.acciones = acciones;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

    
}
