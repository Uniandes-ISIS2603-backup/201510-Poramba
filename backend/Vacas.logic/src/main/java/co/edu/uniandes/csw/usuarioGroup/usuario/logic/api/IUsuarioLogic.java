/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.usuarioGroup.usuario.logic.api;

import co.edu.uniandes.csw.usuarioGroup.usuario.logic.dto.UsuarioDTO;
import java.util.List;

/**
 *
 * @author poramba
 */
public interface IUsuarioLogic {

    public UsuarioDTO createUsuario(UsuarioDTO detail);

    public List<UsuarioDTO> getUsuarios();


    public UsuarioDTO getUsuario(String id);

    public void deleteUsuario(String id);

    public void updateUsuario(UsuarioDTO detail);
    

}
