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
		try {
			root = parser.parse(new InputStreamReader((InputStream) request
					.getContent()));
			JSONObject jsonObject = (JSONObject) root;
			return jsonObject;
		}

		catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
