package com.maventest;

import DataModel.TemperaturePoJo;
import com.jayway.jsonpath.JsonPath;
//import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreatedobjectProviderTest extends TestBaseMain
{
   //
    public static double temperatureFromAPI;
    //@Test
    public TemperaturePoJo getweatherInfoByName()
    {
        super.TestBaseMain();
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
        System.out.println("Weather Object: "+ weatherObjectFromAPI);

//        validatableResponse =
//                response
//                        .then()
//                        .statusCode(200);
        return weatherObjectFromAPI;
    }
//    @Test
//    public void testTempratureObject()
//    {
//        System.out.println(getweatherInfoByName());
//    }
}
