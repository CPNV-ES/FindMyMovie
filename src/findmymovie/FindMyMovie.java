package findmymovie;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import configs.Config;
import classes.Film;
import frames.SelectPathFolder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class FindMyMovie {

    private static Config conf = null;
    public static void main(String[] args) {
        loadProperties();
        // Launch the first interface to select the film folder
        SelectPathFolder selectPathFrame = new SelectPathFolder();
        selectPathFrame.setVisible(true);
    }
    
    /**
     * Load properties file and fill the Config object
     */
    private static void loadProperties(){
        conf = Config.load();
    }
    
    /**
     * Open connexion with omdbapi to get the json of this film with its informations
     * @param filmTitle
     * @return 
     */
    public static String getConnexion(String filmTitle){
        
        // Replace spaces for the url
        String uri = conf.getWeburl()+filmTitle.trim().replace(" ","%20");
        System.out.println(uri);
        String json="";
        try {
            // Open connexion http with the webserver
            URL url = new URL(uri);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : "+ conn.getResponseCode());
            }
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            
            // Fill json
            json = br.readLine();
            conn.disconnect();

        } catch (MalformedURLException e) {
            System.out.println("Error while connecting to the webservice.");
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return json;
        
    }

    /**
     * Extract the list of the movie titles
     * @param fileName
     * @return 
     */
    public static String extractFilmTitle(String fileName){
        
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
    
    public static Film generateFilm (String json, String title) {
        Film film = new Film(title);
        try {
            JSONObject jsonObject = (JSONObject)new JSONParser().parse(json);
            film.setActors(Arrays.asList(jsonObject.get("Actors").toString().split(", ")));
            film.setReleaseYear(Integer.parseInt(jsonObject.get("Year").toString()));
            film.setRealisator((jsonObject.get("Writer").toString()));
            film.setTypes(Arrays.asList(jsonObject.get("Genre").toString().split(", ")));
            film.setRuntime(jsonObject.get("Runtime").toString());
            film.setDescription(jsonObject.get("Plot").toString());
            film.setImage(jsonObject.get("Poster").toString());
        } catch(Exception e){
            System.out.println("Error while converting json");
            return null;
        }
        return film;
    }
    
}
