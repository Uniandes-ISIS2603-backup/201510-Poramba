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

    public itinerarioPageDTO getItinerarios(Integer page, Integer maxRecords);

    public itinerarioDTO getItinerario(Long id);

    public void deleteItinerario(Long id);

    public void updateItinerario(itinerarioDTO detail);
    
    
    
   
}
