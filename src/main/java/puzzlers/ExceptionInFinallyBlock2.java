package puzzlers;

/**
 * What will be printed?
 *
 * @author Girchev N.A.
 * Date: 21.06.2021
 */
public class ExceptionInFinallyBlock2 {

    public static void main(String[] args) {
        try {
            System.out.println("A");
            badMethod();
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
    }

    private static void badMethod() {
        throw new Error();
    }
}
