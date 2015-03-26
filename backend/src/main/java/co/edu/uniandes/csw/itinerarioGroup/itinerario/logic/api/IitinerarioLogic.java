/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.api;


import java.util.List;

import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.dto.itinerarioDTO;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.dto.itinerarioPageDTO;

/**
 *
 * @author Vacas
 */
public interface IitinerarioLogic {

    /**
     * Crea un intinerario apartir del dato obtenido por parametro
     * @param detail Caracteristicas del nuevo itinerario crear. 
     * @return El nuevo itinerario creado 
     */
    public itinerarioDTO createItinerario(itinerarioDTO detail);

    /**
     * Retorna todos los itineraris existentes
     * @return Lista con los itinerarios existentes
     */
    public List<itinerarioDTO> getItinerarios();
    
    /**
     * Retorna todos los itinerarios paginados
     * @param page Pagina de la cual se desea buscar
     * @param maxRecords numero maximo de respuesta
     * @return Un objeto JSON con los itinerarios
     */
    public itinerarioPageDTO getItinerarios(Integer page, Integer maxRecords);

    
    /**
     * Retrina el itinerario con la id dada por parametro
     * @param id Id del itinrario a buscar
     * @return  El itineario buscado
     */
    public itinerarioDTO getItinerario(String id);

    /**
     * Elimina el itinerario con la id buscada
     * @param id ID del itinerario a buscar
     * @return  true si se elimina el itinerario, false en caso contrario.
     */
    public boolean deleteItinerario(String id);
    
    /**
     * Cambia el itinerario por uno dado por parametro.
     * @param detail Nuevo itinerario a cambiar
     */
    public void updateItinerario(itinerarioDTO detail);
    
    
    public 
    
   
}
