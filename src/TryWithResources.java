/**
 * Illustrates the usage of a try-with-resources-statement
 *
 * The resource is given as an argument of the try-block
 * and is automatically closed at the end of the block or
 * if the block terminates before (exception thrown).
 *
 * @author Florian Dahlitz
 */
import java.util.Scanner;
import java.util.InputMismatchException;


public class TryWithResources {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Number of apples: ");
            int apples = sc.nextInt();
            System.out.print("Number of oranges: ");
            int oranges = sc.nextInt();
            System.out.println("Pieces of Fruit: " + (apples + oranges));
        } catch (InputMismatchException ime) {
            ime.printStackTrace();
        }
    }
}
