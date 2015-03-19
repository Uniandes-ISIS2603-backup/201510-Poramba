/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.SportGroup.usuario.logic.api;

import co.edu.uniandes.csw.SportGroup.country.logic.dto.CountryDTO;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioDTO;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioPageDTO;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public interface IUsuarioLogic {

    public UsuarioDTO createUsuario(UsuarioDTO detail);

    public List<UsuarioDTO> getUsuarios();

    public UsuarioPageDTO getUsuarios(Integer page, Integer maxRecords);

    public UsuarioDTO getUsuario(Long id);

    public void deleteUsuario(Long id);

    public void updateUsuario(UsuarioDTO detail);
    
    /*public UsuarioDTO getMostPopulated();
    
    public UsuarioDTO getLeastPopulated();*/
}
