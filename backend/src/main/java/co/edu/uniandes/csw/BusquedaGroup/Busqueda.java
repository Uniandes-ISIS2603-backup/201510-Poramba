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
    private JSONObject darJSON(String direc) throws IOException {
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
