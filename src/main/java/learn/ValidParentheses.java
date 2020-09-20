package learn;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    private ValidParentheses() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isValid(String s) {
        boolean result = false;
        Deque<Character> deque = new ArrayDeque<>();
        if (s.length() <= 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                deque.push(s.charAt(i));
            } else if ((c == ')' && !deque.isEmpty() && deque.pop() == '(')
                    || (c == '}' && !deque.isEmpty() && deque.pop() == '{')
                    || (c == ']' && !deque.isEmpty() && deque.pop() == '[')) {
                result = true;
            } else {
                return false;
            }
        }
        return (result && deque.isEmpty());
    }
}
