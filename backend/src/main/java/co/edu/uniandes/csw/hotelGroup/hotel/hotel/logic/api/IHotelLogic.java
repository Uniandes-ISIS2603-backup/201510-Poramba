package co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.api;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public interface IHotelLogic {

    public HotelDTO createHotel(HotelDTO detail);

    public List<HotelDTO> getHoteles();


    public HotelDTO getHotel(Long id);

    public void deleteHotel(Long id);

    public void updateHotel(HotelDTO detail);
    
    /*public UsuarioDTO getMostPopulated();
    
    public UsuarioDTO getLeastPopulated();*/
}
