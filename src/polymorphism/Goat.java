/**
 * This class represents a goat with the ability to describe
 * themself.
 *
 * @author Florian Dahlitz
 */
public class Goat implements Describable {

    private String description;

    public Goat(String name) {
        description = "A goat named " + name;
    }

    public String getDescription() {
        return description;
    }
}
