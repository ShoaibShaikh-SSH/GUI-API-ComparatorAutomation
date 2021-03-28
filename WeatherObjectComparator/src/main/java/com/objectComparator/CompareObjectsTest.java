package com.objectComparator;


import DataModel.TemperaturePoJo;
import com.maventest.CreatedobjectProviderTest;
//import org.junit.jupiter.api.Test;

public class CompareObjectsTest extends CreatedobjectProviderTest
{
   public CreatedobjectProviderTest tempObjectFromAPI = new CreatedobjectProviderTest();

    public TemperaturePoJo TempPoJo = new TemperaturePoJo();
    // @Test
    public void compareWeatherObjects(TemperaturePoJo objectAPI,TemperaturePoJo objectUI)
    {
       System.out.println("Comparison of object: "+objectAPI+" with another object: "+objectUI);
        System.out.println("Comparison of object: "+objectAPI+" with another object: "+objectUI);
    }

   //@Test
   public void comparisonTest()
   {
       compareWeatherObjects(tempObjectFromAPI.getweatherInfoByName(),tempObjectFromAPI.getweatherInfoByName());
   }
}
