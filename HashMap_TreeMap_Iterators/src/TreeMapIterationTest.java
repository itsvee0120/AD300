import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

class TreeMapIterationTest {

    @Test
    void testTemperatureRange() {
        // Create and populate the TreeMap
        TreeMap<String, Double> monthlyTemperatures = new TreeMap<>();
        monthlyTemperatures.put("January", 30.5);
        monthlyTemperatures.put("February", 32.0);
        monthlyTemperatures.put("March", 45.0);
        monthlyTemperatures.put("April", 58.5);
        monthlyTemperatures.put("May", 65.0);
        monthlyTemperatures.put("June", 75.0);

        // Use iterator to find the highest and lowest temperatures
        Iterator<Map.Entry<String, Double>> iterator = monthlyTemperatures.entrySet().iterator();

        String highestMonth = "";
        String lowestMonth = "";
        double highestTemp = Double.MIN_VALUE;
        double lowestTemp = Double.MAX_VALUE;

        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            double temp = entry.getValue();
            if (temp > highestTemp) {
                highestTemp = temp;
                highestMonth = entry.getKey();
            }
            if (temp < lowestTemp) {
                lowestTemp = temp;
                lowestMonth = entry.getKey();
            }
        }

        // Assertions to check the expected values
        assertEquals("June", highestMonth, "Highest temperature month should be June");
        assertEquals(75.0, highestTemp, "Highest temperature should be 75.0");
        assertEquals("January", lowestMonth, "Lowest temperature month should be January");
        assertEquals(30.5, lowestTemp, "Lowest temperature should be 30.5");
    }
}
