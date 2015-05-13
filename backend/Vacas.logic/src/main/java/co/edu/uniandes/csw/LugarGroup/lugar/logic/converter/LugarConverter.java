/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.LugarGroup.lugar.logic.converter;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniandes.csw.LugarGroup.lugar.logic.dto.LugarDTO;
import co.edu.uniandes.csw.LugarGroup.lugar.logic.entity.LugarEntity;


public class LugarConverter {
   
    private LugarConverter()
    {
        
    }
    public static LugarDTO entity2PersistenceDTO(LugarEntity entity) {
        if (entity != null) {
            LugarDTO dto = new LugarDTO(entity.getId(),entity.getInico(),entity.getFin());
            dto.setHotelActual(entity.getHotelActual().getId());
            dto.setTransporteActual(entity.getTransporteActual().getId());
            dto.setCiudad(entity.getIDCiudad().getId());
            return dto;
        }
        return null;
    }

    public static LugarEntity persistenceDTO2Entity(LugarDTO dto) {
        if (dto != null) {
            LugarEntity entity = new LugarEntity();
            entity.setId(dto.getId());            
            entity.setInico(dto.getInico());
            entity.setFin(dto.getFin());
            return entity;
        } else {
            return null;
        }
    }

    public static List<LugarDTO> entity2PersistenceDTOList(List<LugarEntity> entities) {
        List<LugarDTO> dtos = new ArrayList<LugarDTO>();
        for (LugarEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<LugarEntity> persistenceDTO2EntityList(List<LugarDTO> dtos) {
        List<LugarEntity> entities = new ArrayList<LugarEntity>();
        for (LugarDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
