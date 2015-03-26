/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.transporteGroup.transporte.logic.api;

import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
import java.util.List;

/**
 *
 * @author poramba
 */
public interface ITransporteLogic {

    public transporteDTO createtransporte(transporteDTO detail);

    public List<transporteDTO> getTrantransportes();

    public transporteDTO gettransporte(String id);

    public void deletetransporte(String id);

    public void updatetransporte(transporteDTO detail, String id);
    
    public void setCiudadOrigen(CiudadDTO origen);
    
    public void setCiudadDestino(CiudadDTO destino);
    
    public CiudadDTO getCiudadOrigen();
    
    public CiudadDTO getCiudadDestino(); 
   
}
