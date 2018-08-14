/**
 * Provides an example of a checked exception.
 *
 * @author Florian Dahlitz
 */
import java.io.IOException;


public class CEExample implements Runnable {

    public static void main(String[] args) throws IOException {
        Thread thrd = new Thread(new CEExample());
        thrd.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        throw new IOException("Oops");
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("Alive!");
        }
    }
}
