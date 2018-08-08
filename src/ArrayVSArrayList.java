/**
 * Compares the usage of standard arrays and ArrayList
 *
 * @author Florian Dahlitz
 */
import java.util.ArrayList;


public class ArrayVSArrayList {

    public static void main(String[] args) {
        double[] temperatures = {23.4, 25.8, 22.0, 24.5, 22.3, 22.9, 20.2};
        double sum = 0.0;
        for (double temperature : temperatures)
            sum += temperature;

        System.out.println("Standard Array Average: " + (sum / temperatures.length));

        ArrayList<Double> lstTemperatures = new ArrayList<Double>();
        lstTemperatures.add(23.4);
        lstTemperatures.add(25.8);
        lstTemperatures.add(22.0);
        lstTemperatures.add(24.5);
        lstTemperatures.add(22.3);
        lstTemperatures.add(22.9);
        lstTemperatures.add(20.2);

        Double lstSum = new Double(0);
        for (Double temperature : lstTemperatures)
            lstSum += temperature;

        System.out.println("ArrayList Average: " + (lstSum / lstTemperatures.size()));
    }
}
