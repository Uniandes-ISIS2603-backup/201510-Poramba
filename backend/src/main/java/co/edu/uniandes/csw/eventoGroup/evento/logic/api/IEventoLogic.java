/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.eventoGroup.evento.logic.api;

import co.edu.uniandes.csw.eventoGroup.evento.logic.dto.EventoDTO;
import java.util.List;

/**
 *
 * @author poramba
 */
public interface IEventoLogic {

    public EventoDTO createEvento(EventoDTO detail);

    public List<EventoDTO> getEventos();


    public EventoDTO getEvento(Long id);

    public void deleteEvento(Long id);

    public void updateEvento(EventoDTO detail);
    
    
}
