package co.edu.uniandes.csw.ciudadGroup.ciudad.logic.ejb;

import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.api.ICiudadLogic;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadDTO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class CiudadLogic implements ICiudadLogic{
    
    List<CiudadDTO> ciudades;

    @PersistenceContext(unitName = "CiudadClassPU")
    protected EntityManager entityManager;

    
    public CiudadDTO createCiudad(CiudadDTO detail) {
        ciudades.add(detail);
        return detail;
    }

    public List<CiudadDTO> getCiudades() {
        return ciudades;
    }

    public CiudadDTO getCiudad(String id) {
        CiudadDTO respuesta = null;
        int act = ciudades.size();
        for (int i = 0; i < act; i++) {
            if (ciudades.get(i).getId().equals(id)) {
                respuesta = ciudades.get(i);
            }
            break;
        }
        return respuesta;
    }

    public void deleteCiudad(String id) {
        CiudadDTO trans = getCiudad(id);
        if (trans != null) {
            ciudades.remove(trans);
        }
    }

    public void updateCiudad(CiudadDTO detail, String id) {
        CiudadDTO ciud = getCiudad(id);
        if (ciud != null) {
            boolean ya = false;
            int i = 0;
            while (!ya) {
                if (ciudades.get(i) == ciud) {
                    ya = true;
                } else {
                    i++;
                }
            }
            ciudades.set(i, detail);
            ciudades.remove(ciud);
        }
    }

    

}

   
