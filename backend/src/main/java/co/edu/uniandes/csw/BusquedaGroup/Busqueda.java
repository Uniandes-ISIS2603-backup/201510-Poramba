/*
 * Paquete de clase busqueda
 */
package co.edu.uniandes.csw.BusquedaGroup;
import  org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
/**
 *Clase en la que se realiza la utilizacion del appi 
 * para busuqedas
 */
public class Busqueda 
{
    /**
     * cLAVES NECESARIAS PARA EL USO DE FOURSQUARE, LAS DOS SON NECESARIAS
     */
    public final static  String ID_cliente = "RX0HQUY3SIQ4ZH1HGIUMTQFFO344YVHCVD4UUCX2UUXNCXDE";
    public final static String ID_SECRET = "AQUBPLCCPU4W2AXWJNEZVUBQ1D2JVGO1EZ5PW1KE0ARCIS4D";
    
    /**
     * eSTAS SON LAS PARTES BASICAS DEL URL PARA GENERAR LA INFO CORRESPONDIENTE A UNA CONSULTA EL
     * &QUERY ES QUE SE QUIERE BUSCAR
     */
    public final static String  BASE_URL = "https://api.foursquare.com/v2/venues/search?client_id=RX0HQUY3SIQ4ZH1HGIUMTQFFO344YVHCVD4UUCX2UUXNCXDE&client_secret=AQUBPLCCPU4W2AXWJNEZVUBQ1D2JVGO1EZ5PW1KE0ARCIS4D&query=";
    public final static String FINAL_URL_BASICO = "&v=20140806&m=foursquare";
    public final static String CIUDAD = "&near=";
    
     /**
     * pARTES BASICAS DEL URL DE LA IMAGEN (FOTOS), inicio, tamanio y final
     * la estructura basica es
     * BASE:IMAGEN + SIZE +  FINAL_IMAGEN
     */
    public final static String BASE_IMAGEN = "https://api.foursquare.com/v2/venues/";
    public final static String FINAL_IMAGEN  = "/photos?v=20140319&client_id=RX0HQUY3SIQ4ZH1HGIUMTQFFO344YVHCVD4UUCX2UUXNCXDE&client_secret=AQUBPLCCPU4W2AXWJNEZVUBQ1D2JVGO1EZ5PW1KE0ARCIS4D&limit=500";
    public final static String TAMANIO  = "original";
    /**
     * Metodo que da un Objeto JSOn al realizar una consulta de busqueda cn el api FOurSquare
     * @param direc url que es la que encargada de generar la arespuesta en JSOn 
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

		catch (org.json.simple.parser.ParseException e) 
                {
			e.printStackTrace();
		}
		return null;
    }
    
    public String darImagen(String ID)
	{
		String url="https://api.foursquare.com/v2/venues/"+ID+"/photos?v=20140319&client_id=RX0HQUY3SIQ4ZH1HGIUMTQFFO344YVHCVD4UUCX2UUXNCXDE&client_secret=AQUBPLCCPU4W2AXWJNEZVUBQ1D2JVGO1EZ5PW1KE0ARCIS4D&limit=500";
		try {
			//System.out.println(url);
			JSONObject imagenes=darJSON(url);
			//System.out.println("Este es el objeto "+ imagenes);
			JSONObject response= (JSONObject) imagenes.get("response");
			//System.out.println("Este es el response "+ response);
			JSONObject photos= (JSONObject) response.get("photos");
			//System.out.println("Este es el photos "+ photos);
			JSONArray items=  (JSONArray) photos.get("items");
		//System.out.println("Este es le itemdss" + items);
			Iterator<JSONObject> iterator = items.iterator();
			while (iterator.hasNext() ) 
			{
				JSONObject meme = iterator.next();
//				JSONObject source = (JSONObject) meme.get("source");
//				System.out.println("Este es el source "+source );
				String prefijo = (String) meme.get("prefix");
				String sufijo = (String) meme.get("suffix");
				System.out.println( prefijo +"original" +sufijo);

				//System.out.println("Estos son los venues"+meme);
			}
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
		
	}
}
