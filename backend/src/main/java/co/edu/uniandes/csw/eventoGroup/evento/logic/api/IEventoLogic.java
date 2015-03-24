/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.eventoGroup.evento.logic.api;

import co.edu.uniandes.csw.SportGroup.usuario.logic.api.*;
import co.edu.uniandes.csw.SportGroup.country.logic.dto.CountryDTO;
import co.edu.uniandes.csw.SportGroup.evento.logic.dto.EventoDTO;
import co.edu.uniandes.csw.SportGroup.evento.logic.dto.EventoPageDTO;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioDTO;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioPageDTO;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public interface IEventoLogic {

    public EventoDTO createEvento(EventoDTO detail);

    public List<EventoDTO> getEventos();

    public EventoPageDTO getEventos(Integer page, Integer maxRecords);

    public EventoDTO getEvento(Long id);

    public void deleteEvento(Long id);

    public void updateEvento(EventoDTO detail);
    
    /*public UsuarioDTO getMostPopulated();
    
    public UsuarioDTO getLeastPopulated();*/
}
