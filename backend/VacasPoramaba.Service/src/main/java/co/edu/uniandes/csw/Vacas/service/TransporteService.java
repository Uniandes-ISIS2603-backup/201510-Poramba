package co.edu.uniandes.csw.Vacas.service;




import co.edu.uniandes.csw.transporteGroup.transporte.logic.api.ITransporteLogic;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
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
 * @author Luis Angel Cervantes Cortes
 */
@Path("/transportes")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TransporteService 
{

    @Inject
    protected ITransporteLogic cityLogic;

    @POST
    public transporteDTO createCiudad(transporteDTO ciudad) {
        return cityLogic.createtransporte(ciudad);
    }

     @GET
       @Path("/city/conectado")
      public String sirve() {
       return "Si sirve";
    }
      
    @DELETE
    @Path("{id}")
    public void deleteCiudad(@PathParam("id") String id) {
        cityLogic.deletetransporte(id);
    }

    @GET
    public List<transporteDTO> getCountries() {
        return cityLogic.getTrantransportes();
    }

    @GET
    @Path("{id}")
    public transporteDTO getCiudad(@PathParam("id") String id) {
        return cityLogic.gettransporte(id);
    }

    @PUT
    @Path("{id}")
    public void updateCiudad( transporteDTO ciudad,@PathParam("id") String id) {
        cityLogic.updatetransporte(ciudad);
    }
}
