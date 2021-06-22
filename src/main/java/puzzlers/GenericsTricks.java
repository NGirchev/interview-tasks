package puzzlers;

/**
 * What will be printed?
 *
 * @author Girchev N.A.
 * Date: 21.06.2021
 */
public class GenericsTricks {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Parent[] parents = new Child[2];
        parents[0] = new Child();
        parents[1] = new Parent();
        System.out.println(parents[0]);
        System.out.println(parents[1]);
    }

    static class Parent {
        @Override
        public String toString() {
            return "P";
        }
    }

    static class Child extends Parent {
        @Override
        public String toString() {
            return "C";
        }
    }
}
