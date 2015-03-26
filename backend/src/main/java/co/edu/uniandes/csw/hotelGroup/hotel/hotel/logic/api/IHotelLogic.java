package co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.api;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import java.util.List;
import static org.eclipse.persistence.jpa.rs.util.JPARSLogger.exception;

/**
 *
 * @author poramba
 */
public interface IHotelLogic {

    /**
     * Crea un nuevo hotel y lo agrega a la base de datos.
     * @param detail hotel nuevo.
     * @return El nuevo hotel creado
     */
    public HotelDTO createHotel(HotelDTO detail);

    /**
     * 
     * @return Retorna la lista de hoteles.
     */
    public List<HotelDTO> getHoteles();
    /**
     * Da el hotel con el identificador que entra por parametro
     * @param id String con el identificador nuevo.
     * @return Hotel con el identificador que etra por parametro
     */
    public HotelDTO getHotel(String id);
    /**
     *  Elimina de la base de datos un hotel con el identificador que entra por parametro
     * @param id String con identificador que entra por parametro
     */
    public void deleteHotel(String id);

    /**
     * Actualiza un hotel con la información que entra por parametro
     * @param detail información del hotel
     * @id identificador del hotel que se le desea cambiar la informacion
     * @throws Exception en caso de que el hotel que se quiere actualizar no exista
     */
    public void updateHotel(HotelDTO detail, String id) throws Exception;
    
}
