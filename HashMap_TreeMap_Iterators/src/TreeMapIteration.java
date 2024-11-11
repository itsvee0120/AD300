import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class TreeMapIteration {
    public static void main(String[] args) {
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

        // Print the highest and lowest temperatures
        System.out.println("Highest Temperature: " + highestTemp + " in " + highestMonth);
        System.out.println("Lowest Temperature: " + lowestTemp + " in " + lowestMonth);
    }
}
