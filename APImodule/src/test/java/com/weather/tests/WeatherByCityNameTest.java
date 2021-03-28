package com.weather.tests;

import DataModel.TemperaturePoJo;
import com.jayway.jsonpath.JsonPath;
import cucumber.api.java.en.Then;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

import static io.restassured.RestAssured.*;

public class WeatherByCityNameTest extends TestBase
{
    WeatherByCityNameTest()
    {
        super.TestBase();
    }
    public static double temperatureFromAPI;

    @Story("Get weather information of a city by its name")
    @Feature("Weather endpoint")
    //@Test
    @DisplayName("Fetch weather information by city name")
    public TemperaturePoJo getweatherInfoByName()
    {
        response =
                given().log().all()
                        .queryParam("q","Bengaluru")
                        .queryParam("appid","7fe67bf08c80ded756e598d6f8fedaea")
                        .get("/weather");
        response.prettyPrint();

        String responseString = response.asString();

        temperatureFromAPI = JsonPath.read(responseString,"$.main.temp");

        System.out.println("Temp value: "+temperatureFromAPI);
        // weatherObjectFromAPI.setTemperature(temperatureFromAPI);
        weatherObjectFromAPI = objCreater.temperatureObjCreator(temperatureFromAPI);


//        validatableResponse =
//                response
//                        .then()
//                        .statusCode(200);
        return weatherObjectFromAPI;
    }

    @Test
    public void testTempratureObject()
    {
        System.out.println(getweatherInfoByName());
    }

}
