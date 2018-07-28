/**
 * Includes a class illustrating the usage of the enhanced for-loop
 * using fishes as an example.
 * 
 * @author Florian Dahlitz
 */
import java.util.ArrayList;


public class LegalFishSizes {

    public static void main(String[] args) {
        ArrayList<Double> fishLengthList = new ArrayList<>();
        fishLengthList.add(10.0);
        fishLengthList.add(15.5);
        fishLengthList.add(18.0);
        fishLengthList.add(29.5);
        fishLengthList.add(45.5);

        double requiredLength = 28.0;

        for (Double fishLength : fishLengthList) {
            if (fishLength >= requiredLength) {
                System.out.println(fishLength);
            }
        }
    }
}