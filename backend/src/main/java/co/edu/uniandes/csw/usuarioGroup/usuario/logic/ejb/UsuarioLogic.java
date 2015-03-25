package co.edu.uniandes.csw.usuarioGroup.usuario.logic.ejb;

import co.edu.uniandes.csw.usuarioGroup.usuario.logic.api.IUsuarioLogic;
import co.edu.uniandes.csw.usuarioGroup.usuario.logic.converter.UsuarioConverter;
import co.edu.uniandes.csw.usuarioGroup.usuario.logic.dto.UsuarioDTO;
import co.edu.uniandes.csw.usuarioGroup.usuario.logic.entity.UsuarioEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class UsuarioLogic implements IUsuarioLogic{

    @PersistenceContext(unitName = "UsuarioClassPU")
    protected EntityManager entityManager;

    public UsuarioDTO createUsuario(UsuarioDTO usuario) {
        UsuarioEntity entity = UsuarioConverter.persistenceDTO2Entity(usuario);
        entityManager.persist(entity);
        return UsuarioConverter.entity2PersistenceDTO(entity);
    }

    
    public List<UsuarioDTO> getUsuarios() {
        Query q = entityManager.createQuery("select u from UsuarioEntity u");
        return UsuarioConverter.entity2PersistenceDTOList(q.getResultList());
    }

    

    public UsuarioDTO getUsuario(Long id) {
        return UsuarioConverter.entity2PersistenceDTO(entityManager.find(UsuarioEntity.class, id));
    }

    public void deleteUsuario(Long id) {
       UsuarioEntity entity = entityManager.find(UsuarioEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateUsuario(UsuarioDTO usuario) {
        UsuarioEntity entity = entityManager.merge(UsuarioConverter.persistenceDTO2Entity(usuario));
        UsuarioConverter.entity2PersistenceDTO(entity);
    }

    /*public CountryDTO getMostPopulated() {
        Query query = entityManager.createQuery("select u from CountryEntity u WHERE u.population = (SELECT MAX(v.population) from CountryEntity v)");
        return CountryConverter.entity2PersistenceDTO((CountryEntity)query.getSingleResult());
    }

    public CountryDTO getLeastPopulated() {
        Query query = entityManager.createQuery("select u from CountryEntity u WHERE u.population = (SELECT MIN(v.population) from CountryEntity v)");
        return CountryConverter.entity2PersistenceDTO((CountryEntity)query.getSingleResult());
    }*/


}
