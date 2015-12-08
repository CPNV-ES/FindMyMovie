/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configs;

import java.util.Properties;

/**
 *
 * @author Emmanuel.BARCHICHAT
 */
public class Config {
    
    public final static String PROPERTIES_PATH = System.getProperty("user.dir")+"\\src\\findmymovie\\properties.properties";
    
    private static String weburl;
    private static String extensions;
    
    
    
    private Config(){
        try {
            Properties properties = PropertyLoader.load(Config.PROPERTIES_PATH);
            weburl = properties.getProperty("webserviceurl");
            extensions = properties.getProperty("extensionfilms");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }        
    }
    
    public final static Config load(){
        if(null == instance){
            if (null == instance) {
                instance = new Config();
            }
        }
        return instance;
    }

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
