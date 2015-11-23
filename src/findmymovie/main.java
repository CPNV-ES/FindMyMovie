/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findmymovie;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SelectPathFolder selectPathFrame = new SelectPathFolder();
        selectPathFrame.setVisible(true);
        
        
    }
    
    static String getConnexion(String filmTitle){
        String uri = "http://www.omdbapi.com/?t="+filmTitle.trim().replace(" ","%20");
        String json="";
        try {

		URL url = new URL(uri);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
                json = br.readLine();
		conn.disconnect();

        } catch (MalformedURLException e) {
            System.out.println("Error while connecting to the webservice.");
            System.out.println(e.getMessage());
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        return json;
        
    }

    
    static String extractFilmTitle(String fileName){
        
//        Properties properties = PropertyLoader.load("properties.properties");
//        System.out.println(properties.getProperty("extensionfilms"));
        fileName=fileName.substring(fileName.indexOf("]")+1);
        List<String> items = new ArrayList<>();
        String[] pieces = fileName.split("[\\s_.]");
        items = Arrays.asList( pieces );
        int i=0;
        for (String item : items){
            if (item.length()>=4){
                String str = item.substring(0, 4);
                if (str.equals(str.toUpperCase()) || str.matches("[0-9]{4,}")){
                    break;
                } 
            }
            i++;
        }
        fileName="";
        for (int j=0; j<i; j++){
            fileName+=" "+items.get(j);
        }
        System.out.println("Film = "+fileName.trim());
        
        return fileName;
    }
    
    static Film generateFilm (String json, String title) {
        JSONParser parser = new JSONParser();
        Film film = new Film(title);
        try {
            JSONObject jsonObject = (JSONObject)new JSONParser().parse(json);
            film.setActors(Arrays.asList(jsonObject.get("Actors").toString().split(", ")));
            film.setReleaseYear(Integer.parseInt(jsonObject.get("Year").toString()));
            film.setRealisator((jsonObject.get("Writer").toString()));
            film.setTypes(Arrays.asList(jsonObject.get("Genre").toString().split(", ")));
            film.setReleaseYear(Integer.parseInt(jsonObject.get("Year").toString()));
        } catch(Exception e){
            System.out.println("Error while converting json");
            return null;
        }
        return film;
    }
    
}
