package co.edu.uniandes.csw.ciudadGroup.ciudad.logic.entity;
;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Entity
public class CiudadEntity implements Serializable{

    //----------------------------------------------------------------
    //Atributos y constantes
    //----------------------------------------------------------------

    private static final long serialVersionUID = 06711121155171L;
     @Id
    @GeneratedValue(generator = "Ciudad")
    private String id;
    private String nombre;
    private String descripcion;
    private String link;
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
     * pARTES BASICAS DEL URL DE LA IMAGEN (FOTOS), inicio, tamanio y final
     * la estructura basica es
     * BASE:IMAGEN + SIZE +  FINAL_IMAGEN
     */
    public final static String BASE_IMAGEN = "https://api.foursquare.com/v2/venues/";
    public final static String FINAL_IMAGEN  = "/photos?v=20140319&client_id=RX0HQUY3SIQ4ZH1HGIUMTQFFO344YVHCVD4UUCX2UUXNCXDE&client_secret=AQUBPLCCPU4W2AXWJNEZVUBQ1D2JVGO1EZ5PW1KE0ARCIS4D";
    
    
    public final static String TAMANIO  = "original";
    public final static String   LIMITE = "&limit=";
    
    //----------------------------------------------------------------
    //Metodos
    //----------------------------------------------------------------

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    //--------------------------------------------------------
    //Metodos de busqueda
    //--------------------------------------------------------
 
    
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
                    throw e;
		} 
                catch (ParseException e) {
                    Logger.getLogger(e.toString());
                   throw new RuntimeException("error en el metodo dar objetoJson persistencia"+e);
        }
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
               throw new RuntimeException("error en el metodo dar url del objeto "+e);
            }
        return resultadoImagen;
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
                    throw new RuntimeException("error en el metodo dar imagen "+e);
		}
		return respuesta;
		
	}
}
