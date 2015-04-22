package co.edu.uniandes.csw.SportGroup.sport.logic.entity;

import co.edu.uniandes.csw.SportGroup.country.logic.entity.CountryEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2015-04-21T23:01:46")
@StaticMetamodel(SportEntity.class)
public class SportEntity_ { 

    public static volatile SingularAttribute<SportEntity, CountryEntity> country;
    public static volatile SingularAttribute<SportEntity, Integer> maxAge;
    public static volatile SingularAttribute<SportEntity, Integer> minAge;
    public static volatile SingularAttribute<SportEntity, String> name;
    public static volatile SingularAttribute<SportEntity, String> rules;
    public static volatile SingularAttribute<SportEntity, Long> id;

}