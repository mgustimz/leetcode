package learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {

    @Test
    void testOne() {
        boolean result = PalindromeNumber.isPalindrome(121);
        assertTrue(result);
    }

    @Test
    void testTwo() {
        boolean result = PalindromeNumber.isPalindrome(-121);
        assertFalse(result,
                "From left to right, it reads -121. " +
                        "From right to left, it becomes 121-. " +
                        "Therefore it is not a palindrome.");
    }

    @Test
    void testThree() {
        boolean result = PalindromeNumber.isPalindrome(10);
        assertFalse(result, "Reads 01 from right to left. Therefore it is not a palindrome.");
    }

    @Test
    void testFour() {
        boolean result = PalindromeNumber.isPalindrome(2147483647);
        assertFalse(result);
    }

    @Test
    void testFive() {
        boolean result = PalindromeNumber.isPalindromeBest(121);
        assertTrue(result);
    }

    @Test
    void testSix() {
        boolean result = PalindromeNumber.isPalindromeBest(-121);
        assertFalse(result,
                "From left to right, it reads -121. " +
                        "From right to left, it becomes 121-. " +
                        "Therefore it is not a palindrome.");
    }

    @Test
    void testSeven() {
        boolean result = PalindromeNumber.isPalindromeBest(10);
        assertFalse(result, "Reads 01 from right to left. Therefore it is not a palindrome.");
    }

    @Test
    void testEight() {
        boolean result = PalindromeNumber.isPalindromeBest(2147483647);
        assertFalse(result);
    }

}
