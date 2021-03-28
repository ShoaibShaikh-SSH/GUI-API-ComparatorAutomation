package com.objectComparatorTests;

import com.objectComparator.CompareObjects;
import org.junit.jupiter.api.Test;

public class CompareObjectsTest extends CompareObjects {

    @Test
    public void objectComparisonTest() {
        compareWeatherObjects(tempObjectFromAPI.getWeatherInfoByName(), tempObjectFromAPI.getWeatherInfoByName());
    }
}
