package co.edu.uniandes.csw.LugarGroup.lugar.logic.entity;

import co.edu.uniandes.csw.CiudadGroup.ciudad.logic.dto.CiudadDTO;
import co.edu.uniandes.csw.hotelGroup.hotel.hotel.logic.dto.HotelDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2015-03-26T00:07:13")
@StaticMetamodel(LugarEntity.class)
public class LugarEntity_ { 

    public static volatile SingularAttribute<LugarEntity, String> id;
    public static volatile SingularAttribute<LugarEntity, HotelDTO> hotelActual;
    public static volatile SingularAttribute<LugarEntity, CiudadDTO> ciudad;
    public static volatile SingularAttribute<LugarEntity, Date> fin;
    public static volatile SingularAttribute<LugarEntity, transporteDTO> transporteActual;
    public static volatile SingularAttribute<LugarEntity, List> eventos;
    public static volatile SingularAttribute<LugarEntity, Date> inico;

}