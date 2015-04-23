package co.edu.uniandes.csw.Vacas.service;


import co.edu.uniandes.csw.usuarioGroup.usuario.logic.api.IUsuarioLogic;
import co.edu.uniandes.csw.usuarioGroup.usuario.logic.dto.UsuarioDTO;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author estudiante
 */
@Path("/viajero")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ViajeroService 
{

    @Inject
    protected IUsuarioLogic usarioLogic;

    @POST
    public UsuarioDTO createUsuario(UsuarioDTO cad) {
        return usarioLogic.createUsuario(cad);
    }

    @DELETE
    @Path("{id}")
    public void deleteUsuario(@PathParam("id") String id) {
        usarioLogic.deleteUsuario(id);
    }

    @GET
    public List<UsuarioDTO> getUsuarios() {
        return usarioLogic.getUsuarios();
    }

    @GET
    @Path("{id}")
    public UsuarioDTO getUsuario(@PathParam("id") String id) {
        return usarioLogic.getUsuario(id);
    }

    @PUT
    @Path("{id}")
    public void updateUsuario( UsuarioDTO usuario,@PathParam("id") String id) {
        usarioLogic.updateUsuario(usuario, id);
    }

   
}
