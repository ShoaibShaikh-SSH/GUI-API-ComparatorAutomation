package com.openWeatherAPI;

import DataModel.WeatherPoJo;
import com.jayway.jsonpath.JsonPath;

import static io.restassured.RestAssured.given;

public class WeatherObjectCreator extends APIBase
{
    public static double temperatureFromAPI;
    public WeatherPoJo getWeatherInfoByName()
    {
        super.APIBase();
        response =
                given().log().all()
                        .queryParam("q","Bengaluru")
                        .queryParam("appid","7fe67bf08c80ded756e598d6f8fedaea")
                        .queryParam("units","imperial")
                        .get("/weather");
        response.prettyPrint();

        String responseString = response.asString();

        temperatureFromAPI = JsonPath.read(responseString,"$.main.temp");

        System.out.println("Temp value: "+temperatureFromAPI);
        weatherObjectFromAPI = objCreater.temperatureObjCreator(temperatureFromAPI);
        System.out.println("Weather Object: "+ weatherObjectFromAPI);

        return weatherObjectFromAPI;
    }
}
