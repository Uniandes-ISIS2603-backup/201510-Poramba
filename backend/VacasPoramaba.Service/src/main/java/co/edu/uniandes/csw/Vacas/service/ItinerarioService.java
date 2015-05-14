package co.edu.uniandes.csw.Vacas.service;



import co.edu.uniandes.csw.ciudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.dto.LugarDTO;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.entity.LugarEntity;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.api.IitinerarioLogic;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.dto.itinerarioDTO;
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
@Path("/itinerary")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ItinerarioService 
{

    @Inject
    protected IitinerarioLogic countryLogic;

    @POST
    public itinerarioDTO createItinerario(itinerarioDTO itinerario) {
        return countryLogic.createItinerario(itinerario);
    }

    @DELETE
    @Path("{id}")
    public void deleteItinerario(@PathParam("id") String id) {
        countryLogic.deleteItinerario(id);
    }

    @GET
    public List<itinerarioDTO> getItinerarios() {
        return countryLogic.getItinerarios();
    }

    @GET
    @Path("{id}")
    public itinerarioDTO getItinerario(@PathParam("id") String id) {
        return countryLogic.getItinerario(id);
    }

    @PUT
    public void updateItinerario( itinerarioDTO itinerario) {
        countryLogic.updateItinerario(itinerario);
    }
    
    @PUT
    @Path("/addLugar")
    public void addLugar( LugarDTO ciudad, itinerarioDTO itinerario) 
    {
         countryLogic.addLugar(ciudad, itinerario);
    }
    
    @GET
    @Path("/getLugares")
    public List<LugarEntity> getLugares(itinerarioDTO itinerario)
     {
                return countryLogic.getLugares(itinerario);
     }
    
    
    @DELETE
    @Path("deleteLugar/{id}")
    public void deleteLugar(LugarDTO ciudad, itinerarioDTO itinerario) 
    {
        countryLogic.deleteLugar(ciudad, itinerario);
    }

    
    @PUT
    @Path("{clean}")
    public void clean(itinerarioDTO itinerario )
    {
        countryLogic.clean(itinerario);
    }

   
}
