package puzzlers;

import java.util.ArrayList;
import java.util.List;

/**
 * What will be printed?
 *
 * @author Girchev N.A.
 * Date: 21.06.2021
 */
public class PassingByValueOrByReference2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        System.out.println("STEP1:" + list);
        addElements(list);
        System.out.println("STEP2:" + list);
        addElements2(list);
        System.out.println("STEP3:" + list);
    }

    private static List<String> addElements(List<String> list) {
        list.add("B");
        return list;
    }

    private static List<String> addElements2(List<String> list) {
        List<String> result = new ArrayList<>(list);
        result.add("C");
        return result;
    }
}
