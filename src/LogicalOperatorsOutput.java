/**
 * Shows the evaluation steps of the different logical operators.
 * 
 * @author Florian Dahlitz
 */
public class LogicalOperatorsOutput {

    public static void main(String[] args) {
        int i = 100; int j = 200;
        /**
         * Output: Value1: 299
         * 
         * Reason: Second expression is evaluated independently
         * from the outcome of the first one.
         */
        if((i == 99) & (--j == 199))
            System.out.println("Value1: " + (i + j));
        else
            System.out.println("Value2: " + (i + j));

        i = 100; j = 200;
        /**
         * Output: Value1: 300
         * 
         * Reason: Second expression is not evaluated, because the
         * first one is already false.
         */
        if((i == 99) && (--j == 199))
            System.out.println("Value1: " + (i + j));
        else
            System.out.println("Value2: " + (i + j));

        i = 100; j = 200;
        /**
         * Output: Value1: 299
         * 
         * Reason: Second expression is evaluated independently
         * from the outcome of the first one.
         */
        if((i == 100) | (--j == 200))
            System.out.println("Value1: " + (i + j));
        else
            System.out.println("Value2: " + (i + j));

        i = 100; j = 200;
        /**
         * Output: Value1: 300
         * 
         * Reason: Second expression is not evaluated, because the
         * first one is already true.
         */
        if((i == 100) || (--j == 200))
            System.out.println("Value1: " + (i + j));
        else
            System.out.println("Value2: " + (i + j));
    }
}