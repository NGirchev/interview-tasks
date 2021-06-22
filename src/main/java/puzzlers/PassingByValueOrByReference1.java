package puzzlers;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * What will be printed?
 *
 * @author Girchev N.A.
 * Date: 21.06.2021
 */
public class PassingByValueOrByReference1 {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        System.out.println("STEP1:" + atomicInteger);
        incrementAndGet(atomicInteger);
        System.out.println("STEP2:" + atomicInteger);
        incrementAndGet2(atomicInteger);
        System.out.println("STEP3:" + atomicInteger);
    }

    private static AtomicInteger incrementAndGet(AtomicInteger atomicInteger) {
        atomicInteger.set(atomicInteger.get() + 1);
        return atomicInteger;
    }

    private static AtomicInteger incrementAndGet2(AtomicInteger atomicInteger) {
        AtomicInteger result = new AtomicInteger(atomicInteger.get());
        result.set(result.get() + 1);
        return result;
    }
}
