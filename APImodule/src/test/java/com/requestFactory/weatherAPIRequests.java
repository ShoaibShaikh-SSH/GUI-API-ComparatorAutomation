package com.requestFactory;


import io.restassured.response.Response;
import java.util.HashMap;
import static io.restassured.RestAssured.given;


public class weatherAPIRequests
{
    public Response getWeatherByStatus(HashMap<String,String> queryParams)
    {
        return given()
                .queryParams(queryParams)
                .get("/weather");
    }
}
