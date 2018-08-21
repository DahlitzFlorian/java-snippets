/**
 * Class representing a planet
 *
 * @author Florian Dahlitz
 */
package lambda;

import javafx.scene.paint.Color;


public class Planet {
    private String name = "Unknown";
    private Color primaryColor = Color.WHITE;
    private Integer numberOfMoons = 0;
    private Boolean ringed = false;

    public Planet(String name, Color primaryColor, Integer numberOfMoons, Boolean ringed) {
        this.name = name;
        this.primaryColor = primaryColor;
        this.numberOfMoons = numberOfMoons;
        this.ringed = ringed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getPrimaryColor() {
        return this.primaryColor;
    }

    public void setPrimaryColor(Color primaryColor) {
        this.primaryColor = primaryColor;
    }

    public Integer getNumberOfMoons() {
        return this.numberOfMoons;
    }

    public void setNumberOfMoons(Integer numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public Boolean isRinged() {
        return this.ringed;
    }

    public void setRinged(Boolean ringed) {
        this.ringed = ringed;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
