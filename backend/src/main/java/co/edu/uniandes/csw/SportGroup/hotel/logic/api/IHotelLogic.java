/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.SportGroup.hotel.logic.api;

import co.edu.uniandes.csw.SportGroup.usuario.logic.api.*;
import co.edu.uniandes.csw.SportGroup.country.logic.dto.CountryDTO;
import co.edu.uniandes.csw.SportGroup.hotel.logic.dto.HotelDTO;
import co.edu.uniandes.csw.SportGroup.hotel.logic.dto.HotelPageDTO;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioDTO;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioPageDTO;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public interface IHotelLogic {

    public HotelDTO createHotel(HotelDTO detail);

    public List<HotelDTO> getHoteles();

    public HotelPageDTO getv(Integer page, Integer maxRecords);

    public HotelDTO getHotel(Long id);

    public void deleteHotel(Long id);

    public void updateHotel(HotelDTO detail);
    
    /*public UsuarioDTO getMostPopulated();
    
    public UsuarioDTO getLeastPopulated();*/
}
