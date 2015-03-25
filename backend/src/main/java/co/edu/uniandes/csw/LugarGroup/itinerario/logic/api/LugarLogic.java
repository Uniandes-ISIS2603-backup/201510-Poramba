/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.LugarGroup.itinerario.logic.api;
import co.edu.uniandes.csw.CiudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.dto.LugarDTO;
import co.edu.uniandes.csw.eventoGroup.evento.logic.dto.EventoDTO;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public interface LugarLogic {

    public LugarDTO createLugar(LugarDTO detail);

    public List<CiudadDTO> getCiudades();
    /**
     * Agrega una cidad al lugar
     * @param detail Parametros de la ciudad a agregar
     * @return Retona la ciudad 
     */
    public CiudadDTO addCiudad(CiudadDTO detail);
    
    /**
     * Agregar un evento al lugar
     * @param detail Evento a agregar
     * @return  El evento agregado
     */
    public EventoDTO addEvento(EventoDTO detail);

    /**
     * Obtener un lugar a partir de su id.
     * @param id Id del lugar, esta es unica
     * @return Lugar Buscado
     */
    public LugarDTO getLugar(Long id);

    public void deleteCiudad(Long id);

}
