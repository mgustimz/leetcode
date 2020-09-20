package learn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    @Test
    void testOne() {
        boolean result = ValidParentheses.isValid("()");
        Assertions.assertTrue(result);
    }

    @Test
    void testTwo() {
        boolean result = ValidParentheses.isValid("()[]{}");
        Assertions.assertTrue(result);
    }

    @Test
    void testThree() {
        boolean result = ValidParentheses.isValid("(]");
        Assertions.assertFalse(result);
    }

    @Test
    void testFour() {
        boolean result = ValidParentheses.isValid("([)]");
        Assertions.assertFalse(result);
    }

    @Test
    void testFive() {
        boolean result = ValidParentheses.isValid("{[]}");
        Assertions.assertTrue(result);
    }

    @Test
    void testSix() {
        boolean result = ValidParentheses.isValid("]");
        Assertions.assertFalse(result);
    }

    @Test
    void testSeven() {
        boolean result = ValidParentheses.isValid("({{{{}}}))");
        Assertions.assertFalse(result);
    }

    @Test
    void testEight() {
        boolean result = ValidParentheses.isValid("[");
        Assertions.assertFalse(result);
    }

    @Test
    void testNine() {
        boolean result = ValidParentheses.isValid("((");
        Assertions.assertFalse(result);
    }

    @Test
    void testTen() {
        boolean result = ValidParentheses.isValid("(){}}{");
        Assertions.assertFalse(result);
    }

    @Test
    void testEleven() {
        boolean result = ValidParentheses.isValid("([]){");
        Assertions.assertFalse(result);
    }
}
