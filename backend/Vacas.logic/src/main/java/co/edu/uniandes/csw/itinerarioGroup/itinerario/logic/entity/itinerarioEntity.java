package co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.entity;

import co.edu.uniandes.csw.LugarGroup.lugar.logic.dto.LugarDTO;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.entity.LugarEntity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class itinerarioEntity implements Serializable{
	  private static final long serialVersionUID = 240172041950251807L;

    
    @GeneratedValue(generator = "itinerario")
    private String nombe;
	private String descripcion;
	private String terminacion;
	private String acciones;
        
	@Id private String id;
        private List<LugarEntity> lugares;

    public List<LugarEntity> getLugares() 
    {
        return lugares;
    }

    public void setLugares(List<LugarEntity> lug)
    {
        this.lugares = lug;
    }
    
    public void agregarLugares(LugarEntity lug)
    {
        lugares.add(lug);
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

    public void remove(LugarEntity lugar) 
    {
        this.lugares.remove(lugar);
    }
    public void clean()
    {
        this.lugares.clear();
    }
    
}
