/**
 * A public interface representing a printer.
 *
 * @author Florian Dahlitz
 */
import java.io.File;

public interface Printer {

    public void printFile(File f);
    default public int getInkLevel() {
        return 0;
    }
}
