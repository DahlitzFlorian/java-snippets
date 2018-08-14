/**
 * Shows the proper usage of multi-catch-clauses
 *
 * @author Florian Dahlitz
 */
import java.util.Random;


public class MultiCatchClause {

    public static void main(String[] args) {
        try {
            Random random = new Random();
            int i = random.nextInt(2);
            if (i == 0)
                throw new ArrayIndexOutOfBoundsException();
            else
                throw new NullPointerException();
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}
