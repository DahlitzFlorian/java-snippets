/**
 * This class was made to demonstrate the usage of Strings
 * in switch-statements. Keep in mind, that this is only
 * available for Java SE 7 and greater.
 * 
 * @author Florian Dahlitz
 */
public class StringSwitch {

    public static void main(String[] args) {
        String sports = "handball";

        switch (sports) {
            case "football":
                System.out.println("Ah, do you like football?");
                break;
            case "handball":
                System.out.println("My favorite sports is handball, too!");
                break;
            case "basketball":
                System.out.println("Nah, basketball is not my cup of tea...");
                break;
            default:
                System.out.println("I don't know that kind of sports. You'd like to tell me more?");
                break;
        }
    }
}