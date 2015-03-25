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
 * @author afesguerra
 */
public interface IUsuarioLogic {

    public UsuarioDTO createUsuario(UsuarioDTO detail);

    public List<UsuarioDTO> getUsuarios();


    public UsuarioDTO getUsuario(Long id);

    public void deleteUsuario(Long id);

    public void updateUsuario(UsuarioDTO detail);
    
    /*public UsuarioDTO getMostPopulated();
    
    public UsuarioDTO getLeastPopulated();*/
}
