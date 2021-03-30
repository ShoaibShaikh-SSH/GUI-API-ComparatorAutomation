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

       // response = weatherRequests.getWeatherByStatus(getQueryParamMap());
        response =
                given()
                .queryParams(getQueryParamMap())
                .get("/weather");
//                given().log().all()
//                        .queryParam("q","Bengaluru")
////                        .queryParam("appid","7fe67bf08c80ded756e598d6f8fedaea")
////                        .queryParam("units","imperial")
//                        .get("/weather");
        response.prettyPrint();

        String responseString = response.asString();

        temperatureFromAPI = JsonPath.read(responseString,"$.main.temp");

        System.out.println("Temp value: "+temperatureFromAPI);
        weatherObjectFromAPI = objCreater.temperatureObjCreator(temperatureFromAPI);
        System.out.println("Weather Object: "+ weatherObjectFromAPI);

        return weatherObjectFromAPI;
    }
}
