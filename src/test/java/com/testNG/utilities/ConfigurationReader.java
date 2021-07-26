package com.testNG.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {
        // proje levelinde olusturdugumuz configuration.properties dosyasinin yolu
        String path = "/Users/Abc/IdeaProjects/TestNgFramework/configuration.properties";

        try {
            // dosya okuma islemi
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            System.out.println("configuration.properties dosyasi yok veya dosya yolu yanlis.");
        }
    }

    public static String getProperty(String key) {
        // test datalarini cagirmakta kullanacagim method.
        return properties.getProperty(key);
    }

}
