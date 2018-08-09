/**
 * An interface representing a fax.
 *
 * @author Florian Dahlitz
 */
import java.io.File;

public interface Fax {

    public void sendFax(File f, int number);
    public Object getReceivedFaxes();
}
