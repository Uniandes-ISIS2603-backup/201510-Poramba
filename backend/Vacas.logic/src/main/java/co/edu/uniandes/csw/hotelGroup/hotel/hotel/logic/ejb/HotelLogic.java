package co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.ejb;

import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.api.IHotelLogic;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.converter.HotelConverter;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.entity.HotelEntity;
import java.util.AbstractList;
import java.util.ArrayList;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class HotelLogic implements IHotelLogic {
    
    private List<HotelDTO> hoteles;

    @PersistenceContext(unitName = "VacasClassPU")
    protected EntityManager entityManager;
    public HotelLogic()
    {
        hoteles = new ArrayList<HotelDTO>();
    }

        /**
     * Crea un nuevo hotel y lo agrega a la base de datos.
     * @param hotel hotel nuevo.
     * @return El nuevo hotel creado
     */
    public HotelDTO createHotel(HotelDTO hotel) {
        
          
          hoteles.add(hotel);
          return hotel;
//        HotelEntity entity = HotelConverter.persistenceDTO2Entity(hotel);
//        entityManager.persist(entity);
//        return HotelConverter.entity2PersistenceDTO(entity);
    }

    /**
     * 
     * @return Retorna la lista de hoteles.
     */
    public List<HotelDTO> getHoteles() {
        
        return hoteles;
//        Query q = entityManager.createQuery("select u from HotelEntity u");
//        return HotelConverter.entity2PersistenceDTOList(q.getResultList());
    }

        /**
     * Da el hotel con el identificador que entra por parametro
     * @param id String con el identificador nuevo.
     * @return Hotel con el identificador que etra por parametro, nulla si no lo encuentra
     */
    public HotelDTO getHotel(String id) {
        HotelDTO respuesta = null;
        int arg = hoteles.size();
        for(int i = 0; i < arg; i++)
        {
            if(hoteles.get(i).getId().equals(id) )
            {
                respuesta = hoteles.get(i);
                break;
            }
        }
        return respuesta;
        //return HotelConverter.entity2PersistenceDTO(entityManager.find(HotelEntity.class, id));
    }
    /**
     *  Elimina de la base de datos un hotel con el identificador que entra por parametro
     * @param id String con identificador que entra por parametro
     */
    public void deleteHotel(String id) {
        HotelDTO act = getHotel(id);
        if(act != null)
        {
            hoteles.remove(act);
        }
//        HotelEntity entity = entityManager.find(HotelEntity.class, id);
//        entityManager.remove(entity);
    }
   /**
     * Actualiza un hotel con la información que entra por parametro
     * @param detail información del hotel
     */
    public void updateHotel(HotelDTO hotel, String id)  {
        HotelDTO hote = getHotel(id);
        if(hote == null);      
        else 
        {
            int i = 0; 
            boolean ya = false;
            while(!ya && i < hoteles.size())
            {
                if(hote == hoteles.get(i)) ya = true;
           
                i++;
            }
            hoteles.set(i, hotel);
        }

    }
    
}

