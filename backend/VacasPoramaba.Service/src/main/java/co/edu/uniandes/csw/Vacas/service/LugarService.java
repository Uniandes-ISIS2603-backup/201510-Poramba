package co.edu.uniandes.csw.Vacas.service;


import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.api.ICiudadLogic;
import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadDTO;
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
@Path("/lugar")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LugarService 
{

    @Inject
    protected ICiudadLogic lugarLogic;

    @POST
    public CiudadDTO createCiudad(CiudadDTO ciudad)
    {
        return lugarLogic.createCiudad(ciudad);
    }

    @DELETE
    @Path("{id}")
    public void deleteCiudad(@PathParam("id") String id) {
        lugarLogic.deleteCiudad(id);
    }

    @GET
    public List<CiudadDTO> getCountries() {
        return lugarLogic.getCiudades();
    }

    @GET
    @Path("{id}")
    public CiudadDTO getCiudad(@PathParam("id") String id) {
        return lugarLogic.getCiudad(id);
    }

    @PUT
    @Path("{id}")
    public void updateCiudad( CiudadDTO ciudad,@PathParam("id") String id) {
        lugarLogic.updateCiudad(ciudad,id);
    }

   
}
