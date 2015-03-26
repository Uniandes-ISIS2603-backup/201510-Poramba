/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.usuarioGroup.usuario.logic.converter;
import co.edu.uniandes.csw.usuarioGroup.usuario.logic.dto.UsuarioDTO;
import co.edu.uniandes.csw.usuarioGroup.usuario.logic.entity.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author poramba
 */
public class UsuarioConverter {
    public static UsuarioDTO entity2PersistenceDTO(UsuarioEntity entity) {
        if (entity != null) {
            UsuarioDTO dto = new UsuarioDTO();
            dto.setId(entity.getId());
            dto.setPasaporte(entity.getPasaporte());
            dto.setNombre(entity.getNombre());
            dto.setApellido(entity.getApellido());
            dto.setFechaNacimento(entity.getFechaNacimiento());
            /*dto.setPopulation(entity.getPopulation());*/
            return dto;
        } else {
            return null;
        }
    }

    public static UsuarioEntity persistenceDTO2Entity(UsuarioDTO dto) {
        if (dto != null) {
            UsuarioEntity entity = new UsuarioEntity();
            entity.setId(dto.getId());

            entity.setPasaporte(dto.getPasaporte());
            entity.setNombre(dto.getNombre());
            entity.setApellido(dto.getApellido());
            entity.setFechaNacimiento(dto.getFechaNacimiento());

            return entity;
        } else {
            return null;
        }
    }

    public static List<UsuarioDTO> entity2PersistenceDTOList(List<UsuarioEntity> entities) {
        List<UsuarioDTO> dtos = new ArrayList<UsuarioDTO>();
        for (UsuarioEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<UsuarioEntity> persistenceDTO2EntityList(List<UsuarioDTO> dtos) {
        List<UsuarioEntity> entities = new ArrayList<UsuarioEntity>();
        for (UsuarioDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
