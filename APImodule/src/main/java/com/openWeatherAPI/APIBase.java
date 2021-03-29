package com.openWeatherAPI;

import DataCreationFromModel.WeatherObjectCreator;
import DataModel.WeatherPoJo;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.baseURI;

public class APIBase
{
    public static Response response;
    public static ValidatableResponse validatableResponse;

    public static WeatherPoJo weatherObjectFromAPI = new WeatherPoJo();
    public static WeatherObjectCreator objCreater = new WeatherObjectCreator();


    public void APIBase()
    {
        baseURI = "http://api.openweathermap.org/data/2.5";
    }
    public Properties initApiProperties() throws IOException
    {
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("src/test/java/com/resources/api.properties");
        prop.load(fis);
        return prop;
    }

}
