/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.CiudadGroup.service;

import co.edu.uniandes.csw.Vacas.service.CityService;
import co.edu.uniandes.csw.SportGroup.country.logic.dto.CountryDTO;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class CityServiceTest {
    
    public CityServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createCountry method, of class CityService.
     */
    @Test
    public void testCreateCountry() throws Exception {
        System.out.println("createCountry");
        CountryDTO sport = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityService instance = (CityService)container.getContext().lookup("java:global/classes/CityService");
        instance.createCountry(sport);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCountry method, of class CityService.
     */
    @Test
    public void testDeleteCountry() throws Exception {
        System.out.println("deleteCountry");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityService instance = (CityService)container.getContext().lookup("java:global/classes/CityService");
        instance.deleteCountry(id);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCountries method, of class CityService.
     */
    @Test
    public void testGetCountries() throws Exception {
        System.out.println("getCountries");
        Integer page = null;
        Integer maxRecords = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityService instance = (CityService)container.getContext().lookup("java:global/classes/CityService");
        instance.getCountries(page, maxRecords);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCountry method, of class CityService.
     */
    @Test
    public void testGetCountry() throws Exception {
        System.out.println("getCountry");
        Long id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityService instance = (CityService)container.getContext().lookup("java:global/classes/CityService");
        instance.getCountry(id);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCountry method, of class CityService.
     */
    @Test
    public void testUpdateCountry() throws Exception {
        System.out.println("updateCountry");
        Long id = null;
        CountryDTO sport = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityService instance = (CityService)container.getContext().lookup("java:global/classes/CityService");
        instance.updateCountry(id, sport);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMostPopulated method, of class CityService.
     */
    @Test
    public void testGetMostPopulated() throws Exception {
        System.out.println("getMostPopulated");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityService instance = (CityService)container.getContext().lookup("java:global/classes/CityService");
        instance.getMostPopulated();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeastPopulated method, of class CityService.
     */
    @Test
    public void testGetLeastPopulated() throws Exception {
        System.out.println("getLeastPopulated");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityService instance = (CityService)container.getContext().lookup("java:global/classes/CityService");
        instance.getLeastPopulated();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
