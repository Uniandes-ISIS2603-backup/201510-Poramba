package co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.dto;

import co.edu.uniandes.csw.LugarGroup.lugar.logic.dto.LugarDTO;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class itinerarioDTO {

	
	private String nombe;
	private String descripcion;
	private String terminacion;
	private String acciones;
	private String id;
        private List<LugarDTO> lugares;

     public itinerarioDTO()
     {
         lugares=new ArrayList<LugarDTO>();
     }
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
	
	public LugarDTO addLugar(LugarDTO nuevo)
        {
            for (int i = 0; i < lugares.size(); i++) 
            {
                LugarDTO actual = lugares.get(i);
                if(actual.getId().equals(nuevo.getId()))
                 {
                     return null;
                 }   
            }
            lugares.add(nuevo);
            return nuevo;
        }
        
        public boolean deleteLugar(String id)
        {
            for (int i = 0; i < lugares.size(); i++) 
            {
                LugarDTO actual = lugares.get(i);
                if(actual.getId().equals(id))
                 {
                     lugares.remove(i);
                     return true;
                 }   
            }
            
            return false;
        }
        public LugarDTO getLugar(String id)
        {
            for (int i = 0; i < lugares.size(); i++) 
            {
                LugarDTO actual = lugares.get(i);
                if(actual.getId().equals(id))
                 {
                     return actual;
                 }   
            }
           
            return null;
        }
        
         public int  posiionLugar(String id)
        {
            for (int i = 0; i < lugares.size(); i++) 
            {
                LugarDTO actual = lugares.get(i);
                if(actual.getId().equals(id))
                 {
                     return i;
                 }   
            }
           
            return -1;
        }

    

    
}