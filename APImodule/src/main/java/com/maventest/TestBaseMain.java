package com.maventest;

import DataCreationFromModel.TemperatureObjectCreator;
import DataModel.TemperaturePoJo;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.baseURI;

public class TestBaseMain
{
    public static Response response;
    ValidatableResponse validatableResponse;


    public static TemperaturePoJo weatherObjectFromAPI = new TemperaturePoJo();
    public static TemperatureObjectCreator objCreater = new TemperatureObjectCreator();

    public void TestBaseMain()
    {

        baseURI = "http://api.openweathermap.org/data/2.5";
        //port = 8080;
        //basePath = path;
    }

}
