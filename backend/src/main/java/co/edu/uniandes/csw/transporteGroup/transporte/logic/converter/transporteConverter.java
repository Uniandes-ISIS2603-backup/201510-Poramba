/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.transporteGroup.transporte.logic.converter;

import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.entity.transporteEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ProdAndes
 */
public class transporteConverter {
    public static transporteDTO entity2PersistenceDTO(transporteEntity entity) {
        if (entity != null) {
        	
            transporteDTO dto = new transporteDTO();
            dto.setCiudad_destino(entity.getCiudad_destino());
            dto.setCiudad_origen(entity.getCiudad_origen());
            dto.setDistancia(entity.getDistancia());
            dto.setId(entity.getId());
            dto.setMedio_de_transporte(entity.getMedio_de_transporte());
            dto.setReglas(entity.getReglas());
            
            
            return dto;
        } else {
            return null;
        }
    }

    public static transporteEntity persistenceDTO2Entity(transporteDTO dto) {
        if (dto != null) {
        	transporteEntity entity = new transporteEntity();
        	entity.setCiudad_destino(dto.getCiudad_destino());
        	entity.setCiudad_origen(dto.getCiudad_origen());
        	entity.setDistancia(dto.getDistancia());
        	entity.setId(dto.getId());
        	entity.setMedio_de_transporte(dto.getMedio_de_transporte());
        	entity.setReglas(dto.getReglas());

            return entity;
        } else {
            return null;
        }
    }

    public static List<transporteDTO> entity2PersistenceDTOList(List<transporteEntity> entities) {
        List<transporteDTO> dtos = new ArrayList<transporteDTO>();
        for (transporteEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<transporteEntity> persistenceDTO2EntityList(List<transporteDTO> dtos) {
        List<transporteEntity> entities = new ArrayList<transporteEntity>();
        for (transporteDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
