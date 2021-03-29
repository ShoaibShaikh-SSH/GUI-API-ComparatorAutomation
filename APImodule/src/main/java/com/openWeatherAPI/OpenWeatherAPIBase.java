package com.openWeatherAPI;

import DataCreationFromModel.WeatherObjectCreator;
import DataModel.WeatherPoJo;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;

public class OpenWeatherAPIBase
{
    public static Response response;

    public static WeatherPoJo weatherObjectFromAPI = new WeatherPoJo();
    public static WeatherObjectCreator objCreater = new WeatherObjectCreator();

    public void OpenWeatherAPIBase()
    {

        baseURI = "http://api.openweathermap.org/data/2.5";
    }

}
