/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.converter;


import java.util.ArrayList;
import java.util.List;

import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.dto.itinerarioDTO;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.entity.itinerarioEntity;

/**
 *
 * @author ProdAndes
 */
public class itinerarioConverter {
    public static itinerarioDTO entity2PersistenceDTO(itinerarioEntity entity) {
        if (entity != null) {
        	
            itinerarioDTO dto = new itinerarioDTO();
            dto.setAcciones(entity.getAcciones());
            dto.setDescripcion(entity.getDescripcion());
            dto.setId(entity.getId());
            dto.setNombe(entity.getNombe());
            dto.setTerminacion(entity.getTerminacion());
            
            
            
            return dto;
        } else {
            return null;
        }
    }

    public static itinerarioEntity persistenceDTO2Entity(itinerarioDTO dto) {
        if (dto != null) {
        	itinerarioEntity entity = new itinerarioEntity();
        
        	entity.setAcciones(dto.getAcciones());
        	entity.setDescripcion(dto.getDescripcion());
        	entity.setId(dto.getId());
        	entity.setNombe(dto.getNombe());
        	entity.setTerminacion(dto.getTerminacion());

            return entity;
        } else {
            return null;
        }
    }

    public static List<itinerarioDTO> entity2PersistenceDTOList(List<itinerarioEntity> entities) {
        List<itinerarioDTO> dtos = new ArrayList<itinerarioDTO>();
        for (itinerarioEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<itinerarioEntity> persistenceDTO2EntityList(List<itinerarioDTO> dtos) {
        List<itinerarioEntity> entities = new ArrayList<itinerarioEntity>();
        for (itinerarioDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
