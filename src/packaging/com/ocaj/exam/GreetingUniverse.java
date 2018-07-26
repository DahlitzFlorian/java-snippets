/**
 * This class was create to get familiar with packaging and
 * compiling/interpreting packaged classes via command-line.
 * 
 * @author Florian Dahlitz
 */
package packaging.com.ocaj.exam;

import packaging.com.ocaj.exam.planets.*;

public class GreetingUniverse {

    public static void main(String[] args) {
        System.out.println("Greetings, Universe!");
        Earth earth = new Earth();
        Venus venus = new Venus();
        Mars mars = new Mars();
    }
}