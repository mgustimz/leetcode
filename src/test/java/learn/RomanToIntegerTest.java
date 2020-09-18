package learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    @Test
    void testOne() {
        int result = RomanToInteger.romanToInt("III");
        assertEquals(3, result);
    }

    @Test
    void testTwo() {
        int result = RomanToInteger.romanToInt("IV");
        assertEquals(4, result);
    }

    @Test
    void testThree() {
        int result = RomanToInteger.romanToInt("IX");
        assertEquals(9, result);
    }

    @Test
    void testFour() {
        int result = RomanToInteger.romanToInt("LVIII");
        assertEquals(58, result);
    }

    @Test
    void testFive() {
        int result = RomanToInteger.romanToInt("MCMXCIV");
        assertEquals(1994, result);
    }
}
