/**
 * A Tester class demonstrating the concept of polymorphism
 * using interfaces.
 *
 * @author Florian Dahlitz
 */
public class Tester {

    public static void main(String[] args) {
        new Tester();
    }

    public Tester() {
        Goat goat = new Goat("Bob");
        GoatShelter goatShelter = new GoatShelter(4, 4, 6);
        System.out.println(description(goat));
        System.out.println(description(goatShelter));
    }

    private String description(Describable d) {
        return d.getDescription();
    }
}
