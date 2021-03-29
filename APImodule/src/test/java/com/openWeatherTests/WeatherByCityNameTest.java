package com.openWeatherTests;

import com.jayway.jsonpath.JsonPath;
import com.openWeatherAPI.APIBase;
import com.requestFactory.weatherAPIRequests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class WeatherByCityNameTest extends APIBase
{
    Properties testProperties = new Properties();
    WeatherByCityNameTest()
    {
        super.APIBase();
    }
    weatherAPIRequests weatherRequests = new weatherAPIRequests();

    @Story("Get weather information of a city by its name")
    @Feature("Weather endpoint")
    @Test
    @DisplayName("Fetch weather information by city name")
    public void getWeatherInfoByNameTest() throws IOException {
        testProperties = initApiProperties();

        HashMap<String,String> queryParams = new HashMap<>();
        queryParams.put(testProperties.getProperty("cityKey"),testProperties.getProperty("city"));
        queryParams.put(testProperties.getProperty("AppIdKey"),testProperties.getProperty("AppIdValue"));
        queryParams.put(testProperties.getProperty("units"),testProperties.getProperty("imperial"));

        response = weatherRequests.getWeatherByStatus(queryParams);
        response.prettyPrint();
        validatableResponse =
                response
                        .then()
                        .assertThat()
                        .statusCode(200);

        Assertions.assertEquals(testProperties.getProperty("ExpectedIDforGivenCity"), JsonPath.read(response.asString(), "$.weather[0].id").toString());

    }

}
