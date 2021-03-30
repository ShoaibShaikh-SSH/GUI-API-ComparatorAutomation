package DataCreationFromModel;

import DataModel.WeatherPoJo;

/*A Class that creates & returns an object of type Weather using Weather POJO*/
public class WeatherObjectCreator
{
    public static WeatherPoJo temperatureObject;

    public WeatherPoJo temperatureObjCreator(double temp)
    {
        temperatureObject = new WeatherPoJo();
        temperatureObject.setTemperature(temp);
        return temperatureObject;
    }
}
