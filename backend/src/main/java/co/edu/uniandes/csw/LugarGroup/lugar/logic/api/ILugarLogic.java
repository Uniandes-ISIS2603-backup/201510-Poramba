/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.LugarGroup.lugar.logic.api;
import co.edu.uniandes.csw.CiudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.dto.LugarDTO;
import co.edu.uniandes.csw.eventoGroup.evento.logic.dto.EventoDTO;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
import java.util.List;

/**
 *
 * @author poramba
 */
public interface ILugarLogic {

    public LugarDTO createLugar(LugarDTO detail);

    /**
     * Obtiene la ciudad del lugar actual
     * @return  Ciudad del luga actual, nulo si no existe
     */
    public CiudadDTO getCiudad();
    /**
     * Agrega una cidad a el  lugar
     * @param detail Parametros de la ciudad a agregar
     * @return Retorna la ciudad, nulo si ya eiste una ciudad asociada 
     */
    public CiudadDTO addCiudad(CiudadDTO detail);
   
    /**
     * Elimina la ciudad actual del lugar
     * @return  true si elimina, false en caso contrario
     */
    public boolean deleteCiudad();
    
    /**
     * Reemplaza la ciudad actual por una dada por parametro
     * @param ciudad La ciudad por la cual se va a cambiar la actual
     * @return La nueva ciuad agregada.
     */
    public CiudadDTO updateCiudad(CiudadDTO ciudad);
    /**
     * Agregar un evento al lugar
     * @param detail Evento a agregar
     * @return  El evento agregado
     */
    public EventoDTO addEvento(EventoDTO detail);
    
    /**
     * Retorna un evento asociado al itinerario con el id dado por parametro
     * @param id Id del evento a buscar
     * @return El evento que tiene la id dada por paramentro, nulo si no la encuntra.
     */
    public EventoDTO getEvento(String id);
    
    /**
     * Retorna todos los eventos 
     * @return ista con los eventos del lugar
     */
    public List<EventoDTO> getEventos();
    
    /**
     * Elimina un evento del lugar asociado al id dado por parametro
     * @param id Id del evento a eliminar
     * @return true si elimina, false en caso contrario
     */
    public boolean deleteEvento(String id);
    
    /**
     * Elimina todos los eventos, hotel y tranporte asociados al lugar.
     * @return true si elimina todo, false en caso contrario. 
     */
    public boolean cleanLugar();
    
    /**
     * Cambia el evento por la id por parametro por el nuevo Evento pasado por parametro
     * @param idActual Id del evento a reemplazar.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
     * @param nuevo Nuevo Evento a agregar.
     * @return El nuevo evento agregado, null si no pudo agregarlo
     */
    public EventoDTO updateEvento(String idActual,EventoDTO nuevo );
    /**
     * El transporte que se va a agregar al lugar
     * @param detail Transporte a agregar
     * @return Retorna el nuevo transporte agregado
     */
    public transporteDTO addTransporte(transporteDTO detail);
    
    /**
     * Reemplaza el tranporte actual por uno dado por parametro
     * @param detail Nuevo transporte
     */
    public void updateTransporte(transporteDTO detail);
    
    /**
     * Elimian el transporte actual
     * @return true si se elimina el transporte, false en caso contrario
     */
    public boolean deleteTRanporte();
    
    /**
     * Retorna el transporte actual del lugar 
     * @return El transporte actual
     */
    public transporteDTO getTransporte();
    /**
     * El nuevo hotel a agregar en el lugar.
     * @param detail Nuevo hotel
     * @return El nuevo hotel agregado
     */
    
    public HotelDTO addHotel(HotelDTO detail);
   /**
    * Elimian el hotel actual
    * @return true si se elimina, false en caso contrario. 
    */
    public boolean deleteHotel();
    
    /**
     * Retorna el hotel actual.
     * @return EL hotel actual, null si no esxite uno
     */
    public HotelDTO getHotel();
    
    /**
     * Cambia el hotelactual por uno dado por parametro
     * @param hotel El nuevo hotel
     * @return 
     */
    public HotelDTO setHotel(HotelDTO hotel);
    /**
     * Obtener un lugar a partir de su id.
     * @param id Id del lugar, esta es unica
     * @return Lugar Buscado
     */
    public LugarDTO getLugar(String id);

    /**
     * Elimina el lugar asociado a la id
     * @param id Id del lugar a eliminar
     */
    public void deleteLugar(String id);
    
    /**
     * Cambia el lugar actual por otro
     * @param lugar Nuevo lugar
     * @return 
     */
    public LugarDTO updateLugar(LugarDTO lugar);

}
