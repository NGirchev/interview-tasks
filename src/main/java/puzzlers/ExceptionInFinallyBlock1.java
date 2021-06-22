package puzzlers;

/**
 * What will be printed?
 *
 * @author Girchev N.A.
 * Date: 21.06.2021
 */
public class ExceptionInFinallyBlock1 {

    public static void main(String[] args) {
        try {
            System.out.println("A");
            recursiveMethod();
            System.out.println("B");
        } catch (Exception e) {
            System.out.println("C");
        } finally {
            System.out.println("D");
            System.exit(0);
        }
    }

    private static void recursiveMethod() {
        recursiveMethod();
    }
}
