package co.edu.uniandes.csw.Vacas.service;

import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.api.IHotelLogic;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
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
@Path("/hotel")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class HotelService {

    @Inject
    protected IHotelLogic countryLogic;

    @POST
    public HotelDTO createHotel(HotelDTO Hotel) {
        return countryLogic.createHotel(Hotel);
    }

    @DELETE
    @Path("{id}")
    public void deleteHotel(@PathParam("id") String id) {
        countryLogic.deleteHotel(id);
    }

    @GET
    public List<HotelDTO> getHoteles() {
        return countryLogic.getHoteles();
    }

    @GET
    @Path("{id}")
    public HotelDTO getHotel(@PathParam("id") String id) {
        return countryLogic.getHotel(id);
    }

    @PUT
    @Path("{id}")
    public
            void updateHotel(HotelDTO hotel, @PathParam("id") String id) {
    }

}
