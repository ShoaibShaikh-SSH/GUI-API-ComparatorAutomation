/* This file is supposed to act as base for all the API activities (Test cases/Request Factory/etc)*/

package com.openWeatherAPI;

import DataCreationFromModel.WeatherObjectCreator;
import DataModel.WeatherPoJo;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import static io.restassured.RestAssured.baseURI;

public class APIBase
{
    public static Response response;
    public static ValidatableResponse validatableResponse;

    /*instantiating POJO class & Object Creator (for Comparator)*/
    public static WeatherPoJo weatherObjectFromAPI = new WeatherPoJo();
    public static WeatherObjectCreator objCreater = new WeatherObjectCreator();

    /*Setting base URI through constructor*/
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

    public HashMap<String,String> getQueryParamMap() throws IOException {
        Properties testPropertiestemp = initApiProperties();
        HashMap<String,String> queryParams = new HashMap<>();
        queryParams.put(testPropertiestemp.getProperty("cityKey"),testPropertiestemp.getProperty("city"));
        queryParams.put(testPropertiestemp.getProperty("AppIdKey"),testPropertiestemp.getProperty("AppIdValue"));
        queryParams.put(testPropertiestemp.getProperty("UnitKey"),testPropertiestemp.getProperty("UnitValue"));

        return queryParams;
    }

}
