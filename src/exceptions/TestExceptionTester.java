/**
 * Throws and catches the custom exception TestException
 *
 * @author Florian Dahlitz
 */
import java.util.logging.Logger;
import java.util.logging.Level;


public class TestExceptionTester {

    public static void main(String[] args) {
        Logger LOGGER = Logger.getLogger(TestExceptionTester.class.getName());
        LOGGER.log(Level.INFO, "Start Program...");

        TestExceptionTester tester = new TestExceptionTester();

        try {
            tester.throwException();
        } catch (TestException te) {
            te.printStackTrace();
        }

        LOGGER.log(Level.INFO, "Successful.");
    }

    public void throwException() throws TestException {
        throw new TestException("New custom exception");
    }
}
