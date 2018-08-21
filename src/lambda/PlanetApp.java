/**
 * Class to test the other two classes
 *
 * @author Florian Dahlitz
 */
package lambda;

import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.List;
import static lambda.PlanetPredicates.*;


public class PlanetApp {

    public static void main(String[] args) {
        Planet mercury = new Planet("Mercury", Color.GRAY, 0, false);
        Planet venus = new Planet("Venus", Color.YELLOW, 0, false);
        Planet earth = new Planet("Earth", Color.BLUE, 1, false);
        Planet mars = new Planet("Mars", Color.RED, 2, false);
        Planet jupiter = new Planet("Jupiter", Color.YELLOW, 67, true);
        Planet saturn = new Planet("Saturn", Color.ORANGE, 62, true);
        Planet uranus = new Planet("Uranus", Color.TEAL, 27, true);
        Planet neptune = new Planet("Neptune", Color.BLUE, 14, true);

        List<Planet> planetList = new ArrayList<>();
        planetList.add(mercury);
        planetList.add(venus);
        planetList.add(earth);
        planetList.add(mars);
        planetList.add(jupiter);
        planetList.add(saturn);
        planetList.add(uranus);
        planetList.add(neptune);

        // SCENARIO 1 - planets with rings
        System.out.println("Has one or more rings: " + listFilteredPlanets(
            planetList, p -> p.isRinged()
        ));

        // SCENARIO 2 - planets, which are blue and have moons
        System.out.print("Blue and has moons: ");
        planetList.stream().filter(p -> p.getNumberOfMoons() > 0 &
            p.getPrimaryColor() == Color.BLUE).forEach(s -> System.out.print(s + " "));
        System.out.println();

        // SCENARIO 3 - more than twenty moons
        System.out.println("More than twenty moons: " + filterPlanets(
            planetList, hasMoonsMoreThan(20)
        ));

        // SCENARIO 4 - has color
        System.out.print("Has color: ");
        planetList.stream().filter(hasAColor()).forEach(
            s -> System.out.print(s + " ")
        );
        System.out.println();

        // SCENARIO % - planets with moons
        planetList.removeIf(p -> p.getNumberOfMoons() == 0);
        System.out.println("Planets with moons: " + planetList);
    }
}
