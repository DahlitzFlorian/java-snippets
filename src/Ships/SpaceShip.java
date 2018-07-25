/**
 * This class was created to give an understanding
 * of the fundamentals of class structuring in Java.
 * 
 * @author Florian Dahlitz
 */
public class SpaceShip extends Ship implements Dockable {

    // Data Members
    public enum ShipType {
        FRIGATE, BATTLESHIP, MINELAYER, ESCORT, DEFENSE
    }

    ShipType shipType = ShipType.BATTLESHIP;

    // Constructors
    public SpaceShip() {
        System.out.println("SpaceShip was created with default ship type.");
    }

    public SpaceShip(ShipType shipType) {
        System.out.println("SpaceShip was created with specified ship type.");
        this.shipType = shipType;
    }

    // Methods
    @Override
    public void dockShip() {
        // TODO
    }

    @Override
    public String toString() {
        String shipTypeRefined = this.shipType.name().toLowerCase();
        return "The pirate ship is a " + shipTypeRefined + " ship.";
    }
}