/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

/**
 *
 * @author Emmanuel.BARCHICHAT
 */
public class PropertyLoader{
    
    /**
     * Load properties from a given file
     * @param filename
     * @return
     * @throws IOException
     * @throws FileNotFoundException 
     */
    public static Properties load(String filename) throws IOException, FileNotFoundException{
        
      Properties properties = new Properties();
      FileInputStream input = new FileInputStream(filename);
      try {
        properties.load(input);
        return properties;
      }
      finally {
         input.close();
      }  
    }
    
}