import DataModel.TemperaturePoJo;
import com.maventest.CreatedobjectProviderTest;
import com.objectComparator.CompareObjects;
import org.junit.jupiter.api.Test;

public class CompareObjectsTest extends CompareObjects
{

   @Test
   public void objectComparisonTest()
   {
       compareWeatherObjects(tempObjectFromAPI.getweatherInfoByName(),tempObjectFromAPI.getweatherInfoByName());
   }
}
