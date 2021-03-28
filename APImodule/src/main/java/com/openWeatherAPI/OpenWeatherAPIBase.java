package com.openWeatherAPI;

import DataCreationFromModel.TemperatureObjectCreator;
import DataModel.TemperaturePoJo;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;

public class OpenWeatherAPIBase
{
    public static Response response;

    public static TemperaturePoJo weatherObjectFromAPI = new TemperaturePoJo();
    public static TemperatureObjectCreator objCreater = new TemperatureObjectCreator();

    public void OpenWeatherAPIBase()
    {

        baseURI = "http://api.openweathermap.org/data/2.5";
        //port = 8080;
        //basePath = path;
    }

}
