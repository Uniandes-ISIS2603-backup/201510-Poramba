package co.edu.uniandes.csw.usuarioGroup.usuario.logic.ejb;

import co.edu.uniandes.csw.usuarioGroup.usuario.logic.api.IUsuarioLogic;
import co.edu.uniandes.csw.usuarioGroup.usuario.logic.converter.UsuarioConverter;
import co.edu.uniandes.csw.usuarioGroup.usuario.logic.dto.UsuarioDTO;
import co.edu.uniandes.csw.usuarioGroup.usuario.logic.entity.UsuarioEntity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class UsuarioLogic implements IUsuarioLogic{


    @PersistenceContext(unitName = "VacasClassPU")
    protected EntityManager entityManager;

    public UsuarioDTO createUsuario(UsuarioDTO detail) 
    {
        UsuarioEntity en = UsuarioConverter.persistenceDTO2Entity(detail);
        entityManager.persist(en);
        return UsuarioConverter.entity2PersistenceDTO(en);
    }

    public List<UsuarioDTO> getUsuarios() 
    {
        Query q = entityManager.createQuery("select u from UsuarioEntity u");
        return UsuarioConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public UsuarioDTO getUsuario(String id) 
    {
        return UsuarioConverter.entity2PersistenceDTO(entityManager.find(UsuarioEntity.class, id));
    }

    public void deleteUsuario(String id) 
    {
        UsuarioEntity en = entityManager.find(UsuarioEntity.class, id);
        entityManager.remove(en);
        
    }

    public void updateUsuario(UsuarioDTO detail) 
    {
        UsuarioEntity en = entityManager.merge(UsuarioConverter.persistenceDTO2Entity(detail));
        UsuarioConverter.entity2PersistenceDTO(en);
    }
    
    


}
