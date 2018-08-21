/**
 * Demonstrates different features, such as using predicates in
 * the return statement of methods
 *
 * @author Florian Dahlitz
 */
package lambda;

import javafx.scene.paint.Color;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class PlanetPredicates {

    public static Predicate<Planet> hasMoonsMoreThan(Integer moons) {
        return p -> p.getNumberOfMoons() > moons;
    }

    public static Predicate<Planet> hasAColor() {
        return p -> p.getPrimaryColor() != Color.BLACK;
    }

    public static List<Planet> filterPlanets(List<Planet> planetList,
                                            Predicate<Planet> predicate) {
        return planetList.stream().filter(predicate).collect(Collectors.<Planet>toList());
    }

    public static StringBuilder listFilteredPlanets(List<Planet> planetList,
                                                    Predicate<Planet> predicate) {
        StringBuilder planets = new StringBuilder();
        planetList.stream().filter(planet -> predicate.test(planet)).forEach(
            planet -> {
                planets.append(planet).append(" ");
            }
        );

        return planets;
    }
}
