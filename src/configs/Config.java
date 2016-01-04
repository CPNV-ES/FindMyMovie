/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configs;

import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Emmanuel.BARCHICHAT
 */
public class Config {
    
    private static String weburl;
    // List of extensions allowed for the movie files separated by coma : xxx,yyy,zzz
    private static String extensions;
    
    
    /**
     * Initialize Config object with the properties from properties.properties
     */
    private Config(){
        try {
            
            // Load properties
            InputStream in = getClass().getResourceAsStream("properties.properties");
            Properties properties = new Properties();
            properties.load(in);
            
            weburl = properties.getProperty("webserviceurl");
            extensions = properties.getProperty("extensionfilms");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }        
    }
    
    // Define singleton of the class
    public final static Config load(){
        if (null == instance){
            instance = new Config();
        }
        return instance;
    }

    // Getters & Setters
    
    public static String getWeburl() {
        return weburl;
    }

    public static void setWeburl(String weburl) {
        Config.weburl = weburl;
    }

    public static String getExtensions() {
        return extensions;
    }

    public static void setExtensions(String extensions) {
        Config.extensions = extensions;
    }
    
    

    
    /** L'instance statique */
    private static Config instance;
    
}
