package utulities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static  Properties properties;
    static{
        String dosyaYolu="configuration.properties";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            //fis dosya yolunu tanimladigimiz configuration.properties dosyasini okudu
            properties= new Properties();
            properties.load(fis); // fis'in okudugu bilgileri properties'e okudu


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        /*
        test method'undan yolladigimiz string key degerini alip
        Properties class'indan getProperty() method'unu kullanarak
        bu key'e ait value'u bize getirdi
        amazonUrl=https://www.amazon.com
          KEY           VALUE
         */

        return properties.getProperty(key);
    }
}
