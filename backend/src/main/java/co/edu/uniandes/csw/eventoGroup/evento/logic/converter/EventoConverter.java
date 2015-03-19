/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.SportGroup.evento.logic.converter;

import co.edu.uniandes.csw.SportGroup.usuario.logic.converter.*;
import co.edu.uniandes.csw.SportGroup.transporte.logic.converter.*;
import co.edu.uniandes.csw.SportGroup.country.logic.dto.CountryDTO;
import co.edu.uniandes.csw.SportGroup.country.logic.entity.CountryEntity;
import co.edu.uniandes.csw.SportGroup.evento.logic.dto.EventoDTO;
import co.edu.uniandes.csw.SportGroup.evento.logic.entity.EventoEntity;
import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.UsuarioDTO;
/*import co.edu.uniandes.csw.SportGroup.evento.logic.entity;*/
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public class EventoConverter {
    public static EventoDTO entity2PersistenceDTO(EventoEntity entity) {
        if (entity != null) {
            EventoDTO dto = new EventoDTO();
            dto.setId(entity.getId());            
            dto.setNombre(entity.getNombre());
            dto.setMinAge(entity.getMinAge());
            dto.setMaxAge(entity.getMaxAge());            
            dto.setRules(entity.getRules());
            /*dto.setPopulation(entity.getPopulation());*/
            return dto;
        } else {
            return null;
        }
    }

    public static EventoEntity persistenceDTO2Entity(EventoDTO dto) {
        if (dto != null) {
            EventoEntity entity = new EventoEntity();
            entity.setId(dto.getId());            
            entity.setNombre(dto.getNombre());
            entity.setMinAge(dto.getMinAge());
            entity.setMaxAge(dto.getMaxAge());
            entity.setRules(dto.getRules());
            return entity;
        } else {
            return null;
        }
    }

    public static List<EventoDTO> entity2PersistenceDTOList(List<EventoEntity> entities) {
        List<EventoDTO> dtos = new ArrayList<EventoDTO>();
        for (EventoEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<EventoEntity> persistenceDTO2EntityList(List<EventoDTO> dtos) {
        List<EventoEntity> entities = new ArrayList<EventoEntity>();
        for (EventoDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
