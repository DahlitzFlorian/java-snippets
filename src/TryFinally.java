/**
 * Demonstrates the behaviour of the try-finally-statement
 *
 * If the program compiles (newer version won't let you compile it),
 * the finally code block will be executed even though an exception
 * is thrown. This is, because the exception is not catched and the try-
 * statement didn't exit before completion.
 *
 * Expected output: Bread and
 *
 * @author Florian Dahlitz
 */
public class TryFinally {

    public static void main(String[] args) {
        System.out.print("Bread");
        try {
            throw new NumberFormatException();
        } finally {
            System.out.print(" and");
        }
        System.out.print(" butter");
    }
}
