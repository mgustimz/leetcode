package learn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

    @Test
    void testOne() {
        long result = ReverseInteger.reverse(123);
        Assertions.assertEquals(321, result);
    }

    @Test
    void testTwo() {
        long result = ReverseInteger.reverse(-123);
        Assertions.assertEquals(-321, result);
    }

    @Test
    void testThree() {
        long result = ReverseInteger.reverse(120);
        Assertions.assertEquals(21, result);
    }

    @Test
    void testFour() {
        long result = ReverseInteger.reverse(1534236469);
        Assertions.assertEquals(0, result);
    }

}
