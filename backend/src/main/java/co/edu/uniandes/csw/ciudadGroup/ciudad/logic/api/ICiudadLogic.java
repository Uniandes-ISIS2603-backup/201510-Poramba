/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.SportGroup.ciudad.logic.api;

import co.edu.uniandes.csw.SportGroup.usuario.logic.api.*;
import co.edu.uniandes.csw.SportGroup.country.logic.dto.CountryDTO;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioDTO;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioPageDTO;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public interface ICiudadLogic {

    public CountryDTO createCiudad(UsuarioDTO detail);

    public List<UsuarioDTO> getCiudades();

    public UsuarioPageDTO getCiudades(Integer page, Integer maxRecords);

    public CountryDTO getCiudad(Long id);

    public void deleteCiudad(Long id);

    public void updateCiudad(CiudadDTO detail);
    
    /*public UsuarioDTO getMostPopulated();
    
    public UsuarioDTO getLeastPopulated();*/
}
