package com.openWeatherTests;

import com.openWeather.OpenWeatherAPIBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

import static io.restassured.RestAssured.*;

public class WeatherByCityNameTest extends OpenWeatherAPIBase
{
    WeatherByCityNameTest()
    {
        super.OpenWeatherAPIBase();
    }

    @Story("Get weather information of a city by its name")
    @Feature("Weather endpoint")
    @Test
    @DisplayName("Fetch weather information by city name")
    public void getweatherInfoByNameTest()
    {
        response =
                given().log().all()
                        .queryParam("q","Bengaluru")
                        .queryParam("appid","7fe67bf08c80ded756e598d6f8fedaea")
                        .get("/weather");
        response.prettyPrint();


//        validatableResponse =
//                response
//                        .then()
//                        .statusCode(200);
    }

}
