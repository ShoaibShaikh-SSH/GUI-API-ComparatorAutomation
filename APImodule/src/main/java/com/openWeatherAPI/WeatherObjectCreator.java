package com.openWeatherAPI;

import DataModel.WeatherPoJo;
import com.jayway.jsonpath.JsonPath;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class WeatherObjectCreator extends APIBase
{
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

        weatherObjectFromAPI = objCreater.temperatureObjCreator(temperatureFromAPI);

        return weatherObjectFromAPI;
    }
}
