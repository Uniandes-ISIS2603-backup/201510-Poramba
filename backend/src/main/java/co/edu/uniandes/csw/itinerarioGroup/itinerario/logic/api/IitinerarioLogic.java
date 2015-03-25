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
 * @author afesguerra
 */
public interface IitinerarioLogic {

    public itinerarioDTO createItinerario(itinerarioDTO detail);

    public List<itinerarioDTO> getItinerarios();

    public itinerarioPageDTO getItinerarios(Integer page, Integer maxRecords);

    public itinerarioDTO getItinerario(Long id);

    public void deleteItinerario(Long id);

    public void updateItinerario(itinerarioDTO detail);
    
   
}
