/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.VacasPoramba.web.test;

import co.edu.uniandes.csw.Vacas.service.CityService;
import co.edu.uniandes.csw.Vacas.service.HotelService;
import co.edu.uniandes.csw.Vacas.service.ItinerarioService;
import co.edu.uniandes.csw.Vacas.service.LugarService;
import co.edu.uniandes.csw.Vacas.service.ViajeroService;
import java.io.File;
import java.net.URL;
import java.util.List;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.Filters;
import org.jboss.shrinkwrap.api.GenericArchive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.importer.ExplodedImporter;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.DependencyResolvers;
import org.jboss.shrinkwrap.resolver.api.maven.MavenDependencyResolver;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Angel
 */
//Anotacion de Junit para indicar el orden de ejecucion
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Arquillian.class)
public class VacasPorambaTest {

    public static String baseUrl;
    public static String URLRESOURCES = "src/main/webapp";
    public static WebDriver driver;
    private static StringBuffer verificationErrors = new StringBuffer();

    // Esta variable contendra la URL que utiliza arquillian paraejecutar el contenedor
    @ArquillianResource
    URL deploymentURL;

    @Deployment
    public static Archive<?> createDeployment() {

        MavenDependencyResolver resolver = DependencyResolvers.use(MavenDependencyResolver.class).loadMetadataFromPom("pom.xml");

        WebArchive war = ShrinkWrap
                // Nombre del Proyecto "VacasProbamba.service" seguido de ".war". Debe ser el mismo nombre del proyecto web que contiene los javascript y los  servicios Rest
                .create(WebArchive.class, "VacasPoramba.service.war")
                // Se agrega la dependencia a la lï¿½gica con el nombre groupid:artefactid:version (GAV)
                .addAsLibraries(resolver.artifact("co.edu.uniandes.csw.VacasPoramba:Vacas.logic:0.0.1")
                        .resolveAsFiles())
                // Se agregan los compilados de los paquetes que se van a probar
                .addPackage(CityService.class.getPackage())
                //.addPackage(Service.class.getPackage())
                // Se agregan los html, el bootstrap y los javascript. 
                .addAsWebResource(new File(URLRESOURCES, "index.html"))
                .merge(ShrinkWrap.create(GenericArchive.class).as(ExplodedImporter.class).importDirectory(URLRESOURCES + "/src/").as(GenericArchive.class), "/src/", Filters.includeAll())
                .merge(ShrinkWrap.create(GenericArchive.class).as(ExplodedImporter.class).importDirectory(URLRESOURCES + "/src/assets/css/").as(GenericArchive.class), "/src/assets/css/", Filters.includeAll())
                .merge(ShrinkWrap.create(GenericArchive.class).as(ExplodedImporter.class).importDirectory(URLRESOURCES + "/src/assets/fonts/").as(GenericArchive.class), "/src/assets/fonts/", Filters.includeAll())
                .merge(ShrinkWrap.create(GenericArchive.class).as(ExplodedImporter.class).importDirectory(URLRESOURCES + "/src/assets/libs/").as(GenericArchive.class), "/src/assets/libs/", Filters.includeAll())
                .merge(ShrinkWrap.create(GenericArchive.class).as(ExplodedImporter.class).importDirectory(URLRESOURCES + "/src/shared/crud").as(GenericArchive.class), "/src/shared/crud", Filters.includeAll())
                .merge(ShrinkWrap.create(GenericArchive.class).as(ExplodedImporter.class).importDirectory(URLRESOURCES + "/src/shared/mocks").as(GenericArchive.class), "/src/shared/mocks", Filters.includeAll())
                // Los siguientes son los javascript de los modulos que se van a probar.
                .merge(ShrinkWrap.create(GenericArchive.class).as(ExplodedImporter.class).importDirectory(URLRESOURCES + "/src/modules/City/").as(GenericArchive.class), "/src/modules/City/", Filters.includeAll())
                //.merge(ShrinkWrap.create(GenericArchive.class).as(ExplodedImporter.class).importDirectory(URLRESOURCES + "/src/modules/sport/").as(GenericArchive.class), "/src/modules/sport/", Filters.includeAll())
                // El archivo que contiene la configuracion a la base de datos. 
                .addAsResource("META-INF/persistence.xml", "META-INF/persistence.xml")
                //                // El archivo beans.xml es necesario para injecciï¿½n de dependencias. 
                .addAsWebInfResource(new File("src/main/webapp/WEB-INF/beans.xml"))
                // El archivo web.xml es necesario para el despliegue de los servlets
                .setWebXML(new File("src/main/webapp/WEB-INF/web.xml"));

        return war;
    }

    @BeforeClass
    public static void setUp() {
        // Se crea un ainstancia del driver de firefox sobre el que se ejecutara la aplicacion.
        driver = new FirefoxDriver();
//        // Este timeout sirve para esperar que inicie el firefox
//        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }

    @Before
    public void setUpTest() {
        // El browser ira a esta url. Se ejecuta al inicar cada uno de los metodos de prueba indicados con @Test
        driver.get(deploymentURL + "index.html");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        //Se ejecuta al terminar todos los metodos de prueba indicados con @Test
        // Cierra el browser
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    @Test
    @RunAsClient
    public void t1createCity() throws InterruptedException {
        Thread.sleep(1500);
        boolean success = false;
        driver.findElement(By.partialLinkText("CIUDADES")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("createBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Bogota");
        driver.findElement(By.id("desc")).clear();
        driver.findElement(By.id("desc")).sendKeys("Distrito Capital");
        driver.findElement(By.id("link")).clear();
        driver.findElement(By.id("link")).sendKeys("http://www.bogota.gov.co/");
        driver.findElement(By.id("img")).clear();
        driver.findElement(By.id("img")).sendKeys("Imágen de Bogota");
        driver.findElement(By.id("saveBtn")).click();
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id,'recordList')]/tbody/tr"));
        for (WebElement webElement : rows) {
            List<WebElement> elems = webElement.findElements(By.xpath("td"));
            if (elems.get(0).getText().equals("Bogota") && elems.get(1).getText().equals("Distrito Capital") && elems.get(2).getText().equals("http://www.bogota.gov.co/") && elems.get(3).getText().equals("Imágen de Bogota")) {
                success = true;
            }
        }
        assertTrue(success);
        Thread.sleep(1000);
    }

    @Test
    @RunAsClient
    public void t2createEvent() throws InterruptedException {
        Thread.sleep(1500);
        boolean success = false;
        driver.findElement(By.partialLinkText("EVENTOS")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("createBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Rock al Parque");
        driver.findElement(By.id("minAge")).clear();
        driver.findElement(By.id("minAge")).sendKeys("18");
        driver.findElement(By.id("maxAge")).clear();
        driver.findElement(By.id("maxAge")).sendKeys("80");
        driver.findElement(By.id("rules")).clear();
        driver.findElement(By.id("rules")).sendKeys("No violencia");
        driver.findElement(By.id("img")).clear();
        driver.findElement(By.id("img")).sendKeys("Sin imagen");
        driver.findElement(By.id("saveBtn")).click();
        Thread.sleep(2000);
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id,'recordList')]/tbody/tr"));
        for (WebElement webElement : rows) {
            List<WebElement> elems = webElement.findElements(By.xpath("td"));
            if (elems.get(0).getText().equals("Rock al Parque") && elems.get(1).getText().equals("18") && elems.get(2).getText().equals("80") && elems.get(3).getText().equals("No violencia") && elems.get(4).getText().equals("Sin imagen")) {
                success = true;
            }
        }
        assertTrue(success);
        Thread.sleep(1000);
    }
    
    @Test
    @RunAsClient
    public void t3createItinerary() throws InterruptedException {
        Thread.sleep(1500);
        boolean success = false;
        driver.findElement(By.partialLinkText("ITINERARIOS")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("createBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Itinerairo 1");
        driver.findElement(By.id("Descripcion")).clear();
        driver.findElement(By.id("Descripcion")).sendKeys("Primer viaje");
        driver.findElement(By.id("inicio")).clear();
        driver.findElement(By.id("inicio")).sendKeys("06/05/1015");
        driver.findElement(By.id("final")).clear();
        driver.findElement(By.id("final")).sendKeys("24/05/1015");
        driver.findElement(By.id("rules")).clear();
        driver.findElement(By.id("rules")).sendKeys("No violencia");        
        org.openqa.selenium.support.ui.Select ciudades = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ciudad")));
        ciudades.selectByVisibleText("Bogota");
        org.openqa.selenium.support.ui.Select eventos = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("eventos")));
        eventos.selectByVisibleText("Rock al Parque");
        driver.findElement(By.id("saveBtn")).click();
        Thread.sleep(2000);
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id,'recordList')]/tbody/tr"));
        for (WebElement webElement : rows) {
            List<WebElement> elems = webElement.findElements(By.xpath("td"));
            if (elems.get(0).getText().equals("Itinerario 1") && elems.get(1).getText().equals("Primer viaje") && elems.get(2).getText().equals("06/05/1015") && elems.get(3).getText().equals("06/05/1015") && elems.get(4).getText().equals("Bogota") && elems.get(4).getText().equals("Rock al parque")) {
                success = true;
            }
        }
        assertTrue(success);
        Thread.sleep(1000);
    }
    
    @Test
    @RunAsClient
    public void t4createTransportation() throws InterruptedException {
        Thread.sleep(1500);
        boolean success = false;
        driver.findElement(By.partialLinkText("TRSNSPORTE")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("createBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Itinerairo 1");
        driver.findElement(By.id("Descripcion")).clear();
        driver.findElement(By.id("Descripcion")).sendKeys("Primer viaje");
        driver.findElement(By.id("inicio")).clear();
        driver.findElement(By.id("inicio")).sendKeys("06/05/1015");
        driver.findElement(By.id("final")).clear();
        driver.findElement(By.id("final")).sendKeys("24/05/1015");
        driver.findElement(By.id("rules")).clear();
        driver.findElement(By.id("rules")).sendKeys("No violencia");        
        org.openqa.selenium.support.ui.Select ciudades = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ciudad")));
        ciudades.selectByVisibleText("Bogota");
        org.openqa.selenium.support.ui.Select eventos = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("eventos")));
        eventos.selectByVisibleText("Rock al Parque");
        driver.findElement(By.id("saveBtn")).click();
        Thread.sleep(2000);
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id,'recordList')]/tbody/tr"));
        for (WebElement webElement : rows) {
            List<WebElement> elems = webElement.findElements(By.xpath("td"));
            if (elems.get(0).getText().equals("Itinerario 1") && elems.get(1).getText().equals("Primer viaje") && elems.get(2).getText().equals("06/05/1015") && elems.get(3).getText().equals("06/05/1015") && elems.get(4).getText().equals("Bogota") && elems.get(4).getText().equals("Rock al parque")) {
                success = true;
            }
        }
        assertTrue(success);
        Thread.sleep(1000);
    }
}
