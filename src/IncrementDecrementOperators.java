/**
 * Shows the differences between the postfix-increment operator
 * and the prefix-increment operator, as well as the equivalent
 * decrement operators.
 * 
 * @author Florian Dahlitz
 */
public class IncrementDecrementOperators {

    public static void main(String[] args) {
        int x = 10;
        int y;

        y = ++x;
        System.out.println("x: " + x + "; y: " + y);

        x = 10;
        y = x++;
        System.out.println("x: " + x + "; y: " + y);

        x = 10;
        y = --x;
        System.out.println("x: " + x + "; y: " + y);

        x = 10;
        y = x--;
        System.out.println("x: " + x + "; y: " + y);
    }
}