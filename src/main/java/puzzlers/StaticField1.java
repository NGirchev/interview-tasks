package puzzlers;

/**
 * @author Girchev N.A.
 * Date: 22.06.2021
 */
public class StaticField1 {

    static int i = 0;

    public static void main(String[] args) {
        if (i < 3) {
            i++;
            main(null);
        }
        System.out.println("i=" + i);
    }
}
