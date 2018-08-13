/**
 * This class represents a goat shelter with the ability to
 * describe themself.
 *
 * @author Florian Dahlitz
 */
public class GoatShelter implements Describable {

    private String description;
    private int height;
    private int width;
    private int length;

    public GoatShelter(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
        description = "A goat shelter that is " + height + " high, "
                        + length + " long and " + width + " wide";
    }

    public String getDescription() {
        return description;
    }
}
