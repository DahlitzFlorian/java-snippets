/**
 * A class demonstrating the usage of multiple interfaces.
 *
 * @author Florian Dahlitz
 */
import java.io.File;

public class PrinterFaxCombo implements Fax, Printer {
    private Object incomingFax;
    private int inkLevel;

    public void sendFax(File f, int number) {
        dialNumber(number);
        faxFile(f);
    }

    public Object getReceivedFaxes() {
        return this.incomingFax;
    }

    public void printFile(File f) {
        sendFileToPrinter(f);
    }

    public int getInkLevel() {
        return this.inkLevel;
    }

    private boolean dialNumber(int number) {
        boolean success = true;
        /* Set success to false if it failes */
        return success;
    }

    private void faxFile(File f) {
        /* Send the fax */
    }

    private void sendFileToPrinter(File f) {
        /* Print the file */
    }

    /*
     * More methods
     */
}
