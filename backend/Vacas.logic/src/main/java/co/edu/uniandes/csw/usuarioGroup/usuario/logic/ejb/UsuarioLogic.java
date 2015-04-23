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
    
    List<UsuarioDTO> usuarios;

    @PersistenceContext(unitName = "VacasClassPU")
    protected EntityManager entityManager;
    public UsuarioLogic()
    {
        usuarios = new ArrayList<UsuarioDTO>();
    }

    public UsuarioDTO createUsuario(UsuarioDTO usuario) {
        usuarios.add(usuario);
        return usuario;
//        UsuarioEntity entity = UsuarioConverter.persistenceDTO2Entity(usuario);
//        entityManager.persist(entity);
//        return UsuarioConverter.entity2PersistenceDTO(entity);
    }

    
    public List<UsuarioDTO> getUsuarios() {
        return usuarios;
//        Query q = entityManager.createQuery("select u from UsuarioEntity u");
//        return UsuarioConverter.entity2PersistenceDTOList(q.getResultList());
    }

    

    public UsuarioDTO getUsuario(String id) {
        UsuarioDTO res = null;
        int act = usuarios.size();
        for(int i = 0; i < act; i++)
        {
            UsuarioDTO temp = usuarios.get(i);
            if(temp.getId().equals(id))res = temp; break;
            
        }
        return res;
//        return UsuarioConverter.entity2PersistenceDTO(entityManager.find(UsuarioEntity.class, id));
    }

    public void deleteUsuario(String id)
    {
        UsuarioDTO act = getUsuario(id);
        if(act!=null )
        {            
        usuarios.remove(act);
        }
//       UsuarioEntity entity = entityManager.find(UsuarioEntity.class, id);
//        entityManager.remove(entity);
    }

    public void updateUsuario(UsuarioDTO usuario, String id) 
    {
        UsuarioDTO trans = getUsuario(id);
        if(trans != null)
        {
            boolean ya = false;
            int i = 0;
            while(!ya &&  i < usuarios.size())
            {
                if(usuarios.get(i) == trans)ya = true;
               
                i++;
            }
            usuarios.set(i, usuario);
        }
//        UsuarioEntity entity = entityManager.merge(UsuarioConverter.persistenceDTO2Entity(usuario));
//        UsuarioConverter.entity2PersistenceDTO(entity);
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
