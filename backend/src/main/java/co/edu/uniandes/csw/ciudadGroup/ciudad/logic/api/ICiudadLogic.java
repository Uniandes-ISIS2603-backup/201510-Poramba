/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.CiudadGroup.ciudad.logic.api;

import co.edu.uniandes.csw.CiudadGroup.ciudad.logic.dto.CiudadDTO;
import java.util.List;

/**
 *
 * @author poramba
 */
public interface ICiudadLogic {

    public CiudadDTO createCiudad(CiudadDTO detail);

    public List<CiudadDTO> getCiudades();
    
    public void updateCiudad(CiudadDTO detail, String id);

    public CiudadDTO getCiudad(String id);

    public void deleteCiudad(String  id);
    
    public void updateCiudad(CiudadDTO detail, String id);
    

}
