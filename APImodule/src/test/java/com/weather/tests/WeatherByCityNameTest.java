package com.weather.tests;

import com.jayway.jsonpath.JsonPath;
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
    public static double createdPetID;
    public static String createdPetIDString;

    @Story("Get weather information of a city by its name")
    @Feature("Weather endpoint")
    @Test
    @DisplayName("Fetch weather information by city name")
    public void getweatherInfoByName()
    {
        response =
                given().log().all()
                        .queryParam("q","Bengaluru")
                        .queryParam("appid","7fe67bf08c80ded756e598d6f8fedaea")
                .get("/weather");
        response.prettyPrint();

        String responseString = response.asString();

        createdPetID = JsonPath.read(responseString,"$.main.temp");
        createdPetIDString = "/"+ String.valueOf(createdPetID);

        System.out.println("Temp value: "+createdPetID);

//        validatableResponse =
//                response
//                        .then()
//                        .statusCode(200);
    }
}