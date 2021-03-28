package com.objectComparator;


import DataModel.TemperaturePoJo;
import com.maventest.CreatedobjectProviderTest;

public class CompareObjects extends CreatedobjectProviderTest
{
    public CreatedobjectProviderTest tempObjectFromAPI = new CreatedobjectProviderTest();

    public TemperaturePoJo TempPoJo = new TemperaturePoJo();

    public void compareWeatherObjects(TemperaturePoJo objectAPI,TemperaturePoJo objectUI)
    {
        System.out.println("Comparison of object: "+objectAPI+" with another object: "+objectUI);
    }
}
