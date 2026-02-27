package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfg {


    Properties properties;
    String path = "C:\\Users\\617018917\\Downloads\\Maven Projects\\Cucumber-project-with-Maven\\src\\test\\java\\Utilities\\config.properties";

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
        String value = properties.getProperty("URL");
        if(value !=null){
            return value;}
        else {
            throw new RuntimeException("URL not available");
        }

    }
}