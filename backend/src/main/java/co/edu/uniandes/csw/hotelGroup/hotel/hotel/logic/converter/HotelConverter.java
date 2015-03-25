package co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.converter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*import co.edu.uniandes.csw.SportGroup.usuario.logic.entity;*/
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.entity.HotelEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public class HotelConverter {
    public static HotelDTO entity2PersistenceDTO(HotelEntity entity) {
        if (entity != null) {
            HotelDTO dto = new HotelDTO();
            dto.setId(entity.getId());
            dto.setNombre(entity.getNombre());
            dto.setUbicacion(entity.getUbicacion());
            dto.setEstrellas(entity.getEstrellas());
            dto.setDescripcion(entity.getDescripcion());
            dto.setLink(entity.getLink());
            /*dto.setPopulation(entity.getPopulation());*/
            return dto;
        } else {
            return null;
        }
    }

    public static HotelEntity persistenceDTO2Entity(HotelDTO dto) {
        if (dto != null) {
            HotelEntity entity = new HotelEntity();
            entity.setId(dto.getId());

            entity.setNombre(dto.getNombre());
            entity.setUbicacion(dto.getUbicacion());
            entity.setEstrellas(dto.getEstrellas());
            entity.setDescripcion(dto.getDescripcion());
            entity.setLink(dto.getLink());

            return entity;
        } else {
            return null;
        }
    }

    public static List<HotelDTO> entity2PersistenceDTOList(List<HotelEntity> entities) {
        List<HotelDTO> dtos = new ArrayList<HotelDTO>();
        for (HotelEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<HotelEntity> persistenceDTO2EntityList(List<HotelDTO> dtos) {
        List<HotelEntity> entities = new ArrayList<HotelEntity>();
        for (HotelDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
