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

    public itinerarioDTO createitinerario(itinerarioDTO detail);

    public List<itinerarioDTO> getitinerarios();

    public itinerarioPageDTO getitinerarios(Integer page, Integer maxRecords);

    public itinerarioDTO getitinerario(Long id);

    public void deleteitinerario(Long id);

    public void updateitinerario(itinerarioDTO detail);
    
   
}
