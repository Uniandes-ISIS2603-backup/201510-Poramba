/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.LugarGroup.itinerario.logic.api;
import co.edu.uniandes.csw.CiudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.dto.LugarDTO;
import co.edu.uniandes.csw.eventoGroup.evento.logic.dto.EventoDTO;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public interface ILugarLogic {

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
     * El transporte que se va a agregar al lugar
     * @param detail Transporte a agregar
     * @return Retorna el nuevo transporte agregado
     */
    public transporteDTO addTransporte(transporteDTO detail);

    /**
     * El nuevo hotel a agregar en el lugar.
     * @param detail Nuevo hotel
     * @return El nuevo hotel agregado
     */
    
    public HotelDTO addHotel(HotelDTO detail);
    /**
     * Obtener un lugar a partir de su id.
     * @param id Id del lugar, esta es unica
     * @return Lugar Buscado
     */
    public LugarDTO getLugar(Long id);

    /**
     * Elimina el lugar asociado a la id
     * @param id Id del lugar a eliminar
     */
    public void deleteLugar(Long id);
    
    /**
     * Cambia el lugar actual por otro
     * @param lugar Nuevo lugar
     * @return 
     */
    public LugarDTO updateLugar(LugarDTO lugar);

}
