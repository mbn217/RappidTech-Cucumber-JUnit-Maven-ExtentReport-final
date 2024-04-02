package com.rappidtech.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static final Logger logger = LogManager.getLogger(ConfigurationReader.class);
    private static Properties configFile;

    /**
     * This static block will get loaded first into the memory with the property file
     */
    static{
        logger.info("Loading the property file...");
        String path = "./src/test/resources/configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            configFile = new Properties();
            configFile.load(fileInputStream);
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /**
         * The first for loop uses the keySet() method to iterate over the keys of the Properties object.
         * It then retrieves the corresponding value using getProperty(keyStr) and checks
         * if there is a system property with the same key. If a system property is found,
         * it overrides the value in the Properties object. However, this loop does not directly set the system properties.
         */
        for(Object key : configFile.keySet()){
            String keyStr = (String) key ;
            String value = configFile.getProperty(keyStr);

            String systemPropertyValue = System.getProperty(keyStr);
            if(systemPropertyValue !=null && !systemPropertyValue.isEmpty()){
                configFile.setProperty(keyStr ,systemPropertyValue);
            }

        }



    }

    /**
     * This method will return the value of the key that was passed as a parameter
     * from the property file
     * @param key the key from the property file
     * @return
     */
    public static String getProperty(String key){
        logger.info("Getting the property key {"+ key +"} from the property file");
        return configFile.getProperty(key);
    }


}
