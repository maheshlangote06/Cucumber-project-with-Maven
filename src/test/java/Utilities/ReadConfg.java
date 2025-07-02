package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfg {


    Properties properties;
    String path = "C:\\Users\\mahes_v3cxnvk\\IdeaProjects\\Cucumber-project-with-Maven\\Configuration\\config.properties";

    //Constructor
    public ReadConfg() {
        try {
            properties = new Properties();

            FileInputStream fis = new FileInputStream(path);
            properties.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getBaseURL() {
        String value = properties.getProperty("baseURL");
        if(value !=null){
            return value;}
        else {
            throw new RuntimeException("URL not available");
        }

    }
}