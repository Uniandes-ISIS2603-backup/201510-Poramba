package co.edu.uniandes.csw.LugarGroup.lugar.logic.ejb;


import co.edu.uniandes.csw.LugarGroup.itinerario.logic.api.ILugarLogic;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


public class LugarLogic implements ILugarLogic{

    @PersistenceContext(unitName = "CiudadClassPU")
    protected EntityManager entityManager;

}
