package co.edu.uniandes.csw.transporteGroup.transporte.logic.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2015-03-26T00:07:13")
@StaticMetamodel(transporteEntity.class)
public class transporteEntity_ { 

    public static volatile SingularAttribute<transporteEntity, String> id;
    public static volatile SingularAttribute<transporteEntity, Long> distancia;
    public static volatile SingularAttribute<transporteEntity, Integer> medio_de_transporte;
    public static volatile SingularAttribute<transporteEntity, String> reglas;
    public static volatile SingularAttribute<transporteEntity, String> ciudad_destino;
    public static volatile SingularAttribute<transporteEntity, String> ciudad_origen;

}