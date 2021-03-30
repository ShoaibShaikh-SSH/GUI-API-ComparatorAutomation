package com.openWeatherAPI;

import DataModel.WeatherPoJo;
import com.jayway.jsonpath.JsonPath;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class WeatherObjectCreator extends APIBase
{
    /*This variable would hold value of the temperature extracted from API response- the same will be utilised later for comparator*/
    public static double temperatureFromAPI;
    public WeatherPoJo getWeatherInfoByName() throws IOException
    {
        super.APIBase();

        response =
                given()
                .queryParams(getQueryParamMap())
                .get("/weather");

        String responseString = response.asString();

        temperatureFromAPI = JsonPath.read(responseString,"$.main.temp");

        /*Using the extracted temperature value, an Object of Type Weather (With attribute temperature) will be created*/
        weatherObjectFromAPI = objCreater.temperatureObjCreator(temperatureFromAPI);

        return weatherObjectFromAPI;
    }
}
