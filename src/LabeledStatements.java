/**
 * Introduces labeled statements, which are very rarely used,
 * but it's good to know about them. Compile and run this
 * example to get an impression on the behaviour of them.
 * 
 * @author Florian Dahlitz
 */
public class LabeledStatements {

    public static void main(String[] args) {
        System.out.println("========== LABELED BREAK ==========");
        labeledBreak:
        while (true) {
            System.out.println("While loop 1");
            while (true) {
                System.out.println("While loop 2");
                while (true) {
                    System.out.println("While loop 3");
                    break labeledBreak;
                }
            }
        }

        System.out.println("========== LABELED CONTINUE ==========");
        // prevent infinite loop
        int i = 0;
        labeledContinue:
        while (true) {
            System.out.println("While loop 1");
            while (true) {
                System.out.println("While loop 2");
                while (true) {
                    System.out.println("While loop 3");
                    if (i == 3)
                        return;
                    i++;
                    continue labeledContinue;
                }
            }
        }
    }
}