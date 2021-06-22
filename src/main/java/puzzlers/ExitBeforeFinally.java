package puzzlers;

/**
 * What will be printed?
 *
 * @author Girchev N.A.
 * Date: 21.06.2021
 */
public class ExitBeforeFinally {

    public static void main(String[] args) {
        try {
            System.out.println("A");
            System.exit(0);
        } finally {
            System.out.println("C");
        }
    }
}
