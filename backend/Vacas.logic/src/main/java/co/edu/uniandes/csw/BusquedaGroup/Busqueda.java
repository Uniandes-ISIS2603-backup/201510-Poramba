/*
 * Paquete de clase busqueda
 */
package co.edu.uniandes.csw.BusquedaGroup;
//import static com.sun.xml.ws.spi.db.BindingContextFactory.LOGGER;
import  org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;
/**
 *Clase en la que se realiza la utilizacion del appi 
 * para busuqedas
 */
public class Busqueda 
{
    /*lista que retorna la respuesta necesaria, dependiendo de la busqueda*/
    List <String> arreglo ;
       
    public Busqueda()	
    {
        arreglo = new ArrayList<String>();
    }
    
    /**
     * esta es el url para ver las cate y sub categorias del appi
     * https://api.foursquare.com/v2/venues/categories?client_id=RX0HQUY3SIQ4ZH1HGIUMTQFFO344YVHCVD4UUCX2UUXNCXDE&client_secret=AQUBPLCCPU4W2AXWJNEZVUBQ1D2JVGO1EZ5PW1KE0ARCIS4D&v=20140815
     */
    /**
     * cLAVES NECESARIAS PARA EL USO DE FOURSQUARE, LAS DOS SON NECESARIAS
     */ 
    
    public final static  String ID_cliente = "client_id=RX0HQUY3SIQ4ZH1HGIUMTQFFO344YVHCVD4UUCX2UUXNCXDE";
    public final static String ID_SECRET = "&client_secret=AQUBPLCCPU4W2AXWJNEZVUBQ1D2JVGO1EZ5PW1KE0ARCIS4D";
    
    /**
     * eSTAS SON LAS PARTES BASICAS DEL URL PARA GENERAR LA INFO CORRESPONDIENTE A UNA CONSULTA EL
     * &QUERY ES QUE SE QUIERE BUSCAR
     */
    //https://api.foursquare.com/v2/venues/40afe980f964a5203bf31ee3?client_id=RX0HQUY3SIQ4ZH1HGIUMTQFFO344YVHCVD4UUCX2UUXNCXDE&client_secret=AQUBPLCCPU4W2AXWJNEZVUBQ1D2JVGO1EZ5PW1KE0ARCIS4D&v=20140815&ll=40.7,-74
    public final static String BASE_URL_GENERAL_VENUES = "https://api.foursquare.com/v2/venues/";
    
    public final static String BASE_URL_EVENTO= "/events?";
    public final static String BASE_URL_TIPS = "/tips?";
    public final static String BASE_URL_HOURS = "/hours?";
    
    public final static String  BASE_URL = "https://api.foursquare.com/v2/venues/search?client_id=RX0HQUY3SIQ4ZH1HGIUMTQFFO344YVHCVD4UUCX2UUXNCXDE&client_secret=AQUBPLCCPU4W2AXWJNEZVUBQ1D2JVGO1EZ5PW1KE0ARCIS4D&query=";
    public final static String FINAL_URL_BASICO = "&v=20140806&m=foursquare";
    public final static String CIUDAD = "&near=";
    
    
    /**
     *COnstantes de tipos de eventos 
     */
    public final static String E_AQUARIO = "4fceea171983d5d06c3e9823";
    public final static String E_GALERIA = "4bf58dd8d48988d1e2931735";
    public final static String E_BOLOS = "4bf58dd8d48988d1e4931735";
    public final static String E_CASINO = "52e81612bcbc57f1066b79e7";
    public final static String E_CIRCO = "4bf58dd8d48988d17c941735";
    /*THEATHERS */
    public final static String THEATHER = "4bf58dd8d48988d137941735";
    public final static String MOVIE_THEATHER = "4bf58dd8d48988d17f941735";
    public final static String MULTIPLEX = "4bf58dd8d48988d180941735";
    public final static String OPERA_HPUSE ="4bf58dd8d48988d136941735";
    /*MUSEUMS*/
    public final static String MUSEUM_ARTE = "4bf58dd8d48988d18f941735";
    public final static String MUSEUM_HISTORIA = "4bf58dd8d48988d190941735";
    /*MUSIC CLUBS*/
    public final static String CLUB_ROCK = "4bf58dd8d48988d1e9931735";
    public final static String JAZZ_CLUB = "4bf58dd8d48988d1e7931735";
    /*ESTADUMS*/
    public final static String  BASEBALL_STADIUM = "4bf58dd8d48988d18c941735";
    public final static String BASKETBAL_STADIUM = "4bf58dd8d48988d18b941735";
    public final static String FOOTBALL_STADIUM = "4bf58dd8d48988d189941735";
    public final static String SOCCER_STADIUM = "4bf58dd8d48988d188941735";
    /*PARQUES*/
    public final static String THEME_PARK_RIDE = "5109983191d435c0d71c2bb1";
    public final static String WATER_PARK = "4bf58dd8d48988d193941735";
    public final static String ZOO = "4bf58dd8d48988d17b941735";
    
    
    
    
     /**
     * pARTES BASICAS DEL URL DE LA IMAGEN (FOTOS), inicio, tamanio y final
     * la estructura basica es
     * BASE:IMAGEN + SIZE +  FINAL_IMAGEN
     */
    public final static String BASE_IMAGEN = "https://api.foursquare.com/v2/venues/";
    public final static String FINAL_IMAGEN  = "/photos?v=20140319&client_id=RX0HQUY3SIQ4ZH1HGIUMTQFFO344YVHCVD4UUCX2UUXNCXDE&client_secret=AQUBPLCCPU4W2AXWJNEZVUBQ1D2JVGO1EZ5PW1KE0ARCIS4D";
    
    
    public final static String TAMANIO  = "original";
    public final static String   LIMITE = "&limit=";
    /**
     * Metodo que da un Objeto JSOn al realizar una consulta de busqueda cn el api FOurSquare
     * @param  direc url que es la que encargada de generar la arespuesta en JSOn 
     * @return el objeto JSon que se genera de la consulta
     * @throws IOException  en caso de que se genere algun error en el momento de la lectura  del url
     */
    private JSONObject darJSON(String direc) throws IOException 
    {
		URL url = new URL(direc);
		HttpURLConnection request = (HttpURLConnection) url.openConnection();
		request.connect();
		JSONParser parser = new JSONParser();
		Object root;
		try 
                {
			root = parser.parse(new InputStreamReader((InputStream) request
					.getContent()));
			JSONObject jsonObject = (JSONObject) root;
			return jsonObject;
		}

		catch (IOException e) 
                {
                    Logger.getLogger(e.toString());
                  throw new RuntimeException(e);
		} 
                catch (ParseException e) {
                    Logger.getLogger(e.toString());
                    throw new RuntimeException(e);
        }
    }
    
    public String darImagen(String ID )
	{
            String respuesta = "";
            // URL FORMADO POR LAS PARTES BASICAS Y EL ID DE LA IMAGEN 
		String url=BASE_IMAGEN+ID+FINAL_IMAGEN;
		try {
			//url
			JSONObject imagenes=darJSON(url);
			//Este es el objeto 
			JSONObject response= (JSONObject) imagenes.get("response");
			//Este es el response 
			JSONObject photos= (JSONObject) response.get("photos");
			//Este es el photos 
			JSONArray items=  (JSONArray) photos.get("items");
		        //Este es le itemdss 
			Iterator<JSONObject> iterator = items.iterator();
			int i = 0;
			while (iterator.hasNext() && i < 1) 
			{
				JSONObject meme = iterator.next();
                             //	Este es el source 
				String prefijo = (String) meme.get("prefix");
				String sufijo = (String) meme.get("suffix");
				//prefijo +TAMANIO+sufijo
                                respuesta = url + prefijo + sufijo;
				i++;

				//Estos son los venues meme
			}
		
			
		} catch (Exception e) {
                    Logger.getLogger(e.toString());
                    throw new RuntimeException(e);
		}
		return respuesta;
		
	}
    
    /**
     * Metodo que retorna un arreglo de string con el id, el nombre, la imagen,
     * la direccion y la ciudad de lo buscado  separarado por _
     * @param numMax numero maximo de venues
     * @param ciudad ciudad donde pertenece evento o demas
     * @param CriterioDebqueda que es lo que se quiere buscar 
     * @return  un arreglo con la info necesaria
     */
    public List<String> darURl(int numMax, String ciudad, String CriterioDebqueda)
    {
        
            String url= BASE_URL +CriterioDebqueda +CIUDAD + ciudad+FINAL_URL_BASICO + LIMITE + numMax;
//		{"referralId":"v-1427344009","id":"4ba3fd5ef964a520f17438e3","location":{"postalCode":"110311","address":"Cra 4 No. 22-61","state":"Bogotá D.C."
            JSONObject AaLeer;
            List<String>resultadoImagen = new ArrayList<String >();
            try {
                    AaLeer = darJSON(url);
                    JSONObject primero=(JSONObject) AaLeer.get("response");
                    //Este es el primero primero
                    JSONArray obejtos=(JSONArray) primero.get("venues");
                    //Estos son los obejtos
                    Iterator<JSONObject> iterator = obejtos.iterator();
                    while (iterator.hasNext() ) 
                    {
                            JSONObject meme = iterator.next();

                            String ID = (String) meme.get("id");
                            // meme + "este es eel meme"
                            JSONObject dirc=(JSONObject) meme.get("location");
                            String adress = (String) dirc.get("address");
                            
                           // jkaskdnankdfmvsovm String state (String) dirc.get("state")
                            
                            darImagen(ID);
                            String name = (String) meme.get("name");
                            //name + "name"
                            String info = ID +"_"+name +"_" + darImagen(ID) + "_" + adress +"_" + dirc;
                            resultadoImagen.add(info);
                    }
            } 
            catch (Exception e) 
            {
                Logger.getLogger(e.toString());
               throw new RuntimeException(e);
            }
        return resultadoImagen;
    }
    public List <String> darCategoriasBusqueda()
    {
         List<String> categoriasRespuesta = new ArrayList<String>();
         
        return categoriasRespuesta;
    }
    public List darInfoHotel()
    {
         List<String> categoriasRespuesta = new ArrayList<String>();
         
        return categoriasRespuesta;
    }
    
    /*
    *Metodo que retorna  el nombre, el id del evento y el url  en un determinado 
    *( infomacion  BASICA ) de un evento especificamente de un lugar, ciudad    
    */
    
    public List<String> darInfoEventos(String venueId )
    {
        String url= BASE_URL_GENERAL_VENUES+ venueId+ BASE_URL_EVENTO+ID_cliente
                +ID_SECRET+FINAL_URL_BASICO + LIMITE + "100";
//		{"referralId":"v-1427344009","id":"4ba3fd5ef964a520f17438e3","location":{"postalCode":"110311","address":"Cra 4 No. 22-61","state":"Bogotá D.C."
            JSONObject AaLeer;
           List <String>resultado = new ArrayList<String >();
            try {
                    AaLeer = darJSON(url);
                    JSONObject primero=(JSONObject) AaLeer.get("response");
                    //Este es el primero" +primero
                    JSONObject eventos=(JSONObject) AaLeer.get("events");
                    JSONArray obejtos=(JSONArray) eventos.get("items");
                    //Estos son los obejtos
                    Iterator<JSONObject> iterator = obejtos.iterator();
                    while (iterator.hasNext() ) 
                    {
                            JSONObject event = iterator.next();

                            //id del evento por si se quiere mas informacion
                            String ID = (String) event.get("id");
                             //event's name
                            String name = (String)event.get("name");
                                                        //timezone
                            String timezone = (String) event.get("timeZone");
                            //url del evento
                            String urlP = (String)event.get("url");
                            //url de la imagen del evento categoria                     
                            darImagen(ID);
                           
                            String info = ID +"_"+name +"_" + darImagen(ID) + "_" + timezone +"_" + urlP;
                            resultado.add(info);
                    }
            } 
            catch (Exception e) 
            {
                // TODO Auto-generated catch block
                Logger.getLogger(e.toString());
               throw new RuntimeException(e);
            }
        return resultado;
    }
    
    public List <String> darInfoTransporte()
    {
        List<String> transporteList = new ArrayList<String>();
         
        return transporteList;
    }
}
