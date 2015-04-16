package co.edu.uniandes.csw.eventoGroup.evento.logic.ejb;

import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.eventoGroup.evento.logic.dto.EventoDTO;
import co.edu.uniandes.csw.eventoGroup.evento.logic.api.IEventoLogic;
import java.util.ArrayList;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EventoLogic implements IEventoLogic {

    List<EventoDTO> eventos;
    CiudadDTO ciudad;

    public EventoLogic() {
        eventos = new ArrayList<EventoDTO>();
    }

    @PersistenceContext(unitName = "VacasClassPU")
    protected EntityManager entityManager;

    
    public void setCiudad(CiudadDTO ciudad) {
        this.ciudad = ciudad;
    }
    
    public CiudadDTO getCiudad() {
        return ciudad;
    }
    
    public EventoDTO createEvento(EventoDTO detail) {
        eventos.add(detail);
        return detail;
    }

    public List<EventoDTO> getEventos() {
        return eventos;
    }
    
    public EventoDTO getEvento(String id) {
        EventoDTO respuesta = null;
        int act = eventos.size();
        for (int i = 0; i < act; i++) {
            if (eventos.get(i).getId().equals(id)) {
                respuesta = eventos.get(i);
            }
            break;
        }
        return respuesta;
    }

    public void deleteEvento(String id) {
        EventoDTO event = getEvento(id);
        if (event != null) {
            eventos.remove(event);
        }
    }

    public void updateEvento(EventoDTO detail, String id) {
        EventoDTO event = getEvento(id);
        if (event != null) {
            boolean ya = false;
            int i = 0;
            while (!ya) {
                if (eventos.get(i) == event) {
                    ya = true;
                } else {
                    i++;
                }
            }
            eventos.set(i, detail);
            eventos.remove(event);
        }
    }

   
    

  
}
