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
    public void getWeatherInfoByNameTest() throws IOException
    {
        testProperties = initApiProperties();

        /*A call to Request factory method with Query param map as argument - This returns a response*/
        response = weatherRequests.getWeatherByStatus(getQueryParamMap());

        validatableResponse =
                response
                        .then()
                        .assertThat()
                        .statusCode(200);

        /*Assertion on city ID
        * ExpectedIDforGivenCity (from properties) Vs Actual ID extracted from response*/
        Assertions.assertEquals(testProperties.getProperty("ExpectedIDforGivenCity"), JsonPath.read(response.asString(), "$.id").toString());
    }

}
