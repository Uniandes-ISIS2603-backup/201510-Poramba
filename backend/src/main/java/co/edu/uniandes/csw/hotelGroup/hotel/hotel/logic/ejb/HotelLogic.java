package co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.ejb;

import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.api.IHotelLogic;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.converter.HotelConverter;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.entity.HotelEntity;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class HotelLogic implements IHotelLogic {

    @PersistenceContext(unitName = "HotelClassPU")
    protected EntityManager entityManager;

        /**
     * Crea un nuevo hotel y lo agrega a la base de datos.
     * @param detail hotel nuevo.
     * @return El nuevo hotel creado
     */
    public HotelDTO createHotel(HotelDTO hotel) {
        HotelEntity entity = HotelConverter.persistenceDTO2Entity(hotel);
        entityManager.persist(entity);
        return HotelConverter.entity2PersistenceDTO(entity);
    }

    /**
     * 
     * @return Retorna la lista de hoteles.
     */
    public List<HotelDTO> getHoteles() {
        Query q = entityManager.createQuery("select u from HotelEntity u");
        return HotelConverter.entity2PersistenceDTOList(q.getResultList());
    }

        /**
     * Da el hotel con el identificador que entra por parametro
     * @param id String con el identificador nuevo.
     * @return Hotel con el identificador que etra por parametro
     */
    public HotelDTO getHotel(String id) {
        return HotelConverter.entity2PersistenceDTO(entityManager.find(HotelEntity.class, id));
    }
    /**
     *  Elimina de la base de datos un hotel con el identificador que entra por parametro
     * @param id String con identificador que entra por parametro
     */
    public void deleteHotel(String id) {
        HotelEntity entity = entityManager.find(HotelEntity.class, id);
        entityManager.remove(entity);
    }
   /**
     * Actualiza un hotel con la información que entra por parametro
     * @param detail información del hotel
     */
    public void updateHotel(HotelDTO hotel) {
        HotelEntity entity = entityManager.merge(HotelConverter.persistenceDTO2Entity(hotel));
        HotelConverter.entity2PersistenceDTO(entity);
    }
    
}

