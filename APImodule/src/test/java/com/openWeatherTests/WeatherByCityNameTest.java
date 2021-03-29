package com.openWeatherTests;

import com.openWeatherAPI.OpenWeatherAPIBase;
import com.requestFactory.weatherAPIRequests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class WeatherByCityNameTest extends OpenWeatherAPIBase
{
    WeatherByCityNameTest()
    {
        super.OpenWeatherAPIBase();
    }
    weatherAPIRequests weatherRequests = new weatherAPIRequests();

    @Story("Get weather information of a city by its name")
    @Feature("Weather endpoint")
    @Test
    @DisplayName("Fetch weather information by city name")
    public void getweatherInfoByNameTest()
    {
        HashMap<String,String> queryParams = new HashMap<>();
        queryParams.put("q","Bengaluru");
        queryParams.put("appid","7fe67bf08c80ded756e598d6f8fedaea");
        queryParams.put("units","imperial");

        response = weatherRequests.getWeatherByStatus(queryParams);
        response.prettyPrint();


//        validatableResponse =
//                response
//                        .then()
//                        .statusCode(200);
    }

}
