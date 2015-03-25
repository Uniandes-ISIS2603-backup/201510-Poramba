/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.transporteGroup.transporte.logic.api;

import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transportePageDTO;
import java.util.List;

/**
 *
 * @author poramba
 */
public interface ITransporteLogic {

    public transporteDTO createtransporte(transporteDTO detail);

    public List<transporteDTO> getTrantransportes();

    public transportePageDTO getTransportes(Integer page, Integer maxRecords);

    public transporteDTO gettransporte(Long id);

    public void deletetransporte(Long id);

    public void updatetransporte(transporteDTO detail);
    
   
}
