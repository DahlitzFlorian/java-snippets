/**
 * Printing all of the system properties. Created to understand
 * the Java interpreter.
 *
 * @author Florian Dahlitz
 */
import java.util.Properties;


public class PropertiesManager {

    public static void main(String[] args) {
        if(args.length == 0) { System.exit(0); }

        Properties props = System.getProperties();
        props.setProperty("new_property_2", "new_value_2");

        switch (args[0]) {
            case "-list_all":
                props.list(System.out);
                break;
            case "-list_prop":
                System.out.println(props.getProperty(args[1]));
                break;
            default:
                System.out.println("Usage: java PropertiesManager [-list_all]");
                System.out.println("       java PropertiesManager [-list_prop [property]]");
                break;
        }
    }
}
