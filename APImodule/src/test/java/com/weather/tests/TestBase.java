package com.weather.tests;

import DataCreationFromModel.TemperatureObjectCreator;
import DataModel.TemperaturePoJo;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class TestBase
{
    public static Response response;
    ValidatableResponse validatableResponse;


    public static TemperaturePoJo weatherObjectFromAPI = new TemperaturePoJo();
    public static TemperatureObjectCreator objCreater = new TemperatureObjectCreator();

    public void TestBase()
    {

        baseURI = "http://api.openweathermap.org/data/2.5";
        //port = 8080;
        //basePath = path;
    }

}
