package co.edu.uniandes.csw.Vacas.service;


import co.edu.uniandes.csw.LugarGroup.lugar.logic.api.ILugarLogic;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.dto.LugarDTO;

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
    protected ILugarLogic lugarLogic;

    @POST
    public LugarDTO createCiudad(LugarDTO ciudad)
    {
        return lugarLogic.createLugar(ciudad);
    }

    @DELETE
    @Path("{id}")
    public void deleteCiudad(@PathParam("id") String id) {
        lugarLogic.deleteLugar(id);
    }

   

    @GET
    @Path("{id}")
    public LugarDTO getCiudad(@PathParam("id") String id) {
        return lugarLogic.getLugar(id);
    }

   
}
