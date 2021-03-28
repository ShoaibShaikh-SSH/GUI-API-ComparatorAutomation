package DataCreationFromModel;

import DataModel.TemperaturePoJo;

public class TemperatureObjectCreator
{
    public static TemperaturePoJo temperatureObject;

    public TemperaturePoJo temperatureObjCreator(double temp)
    {
        temperatureObject = new TemperaturePoJo();
        temperatureObject.setTemperature(temp);
        return temperatureObject;
    }
}
