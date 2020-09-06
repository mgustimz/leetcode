package learn;

public class PalindromeNumber {

    private PalindromeNumber() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isPalindrome(int x) {
        StringBuilder stringX = new StringBuilder();
        stringX.append(x).reverse();
        try {
            return x >= 0 && Integer.parseInt(stringX.toString()) == x;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isPalindromeBest(int x) {
        int reversed = 0;
        int original = x;
        int digit = 0;
        while (x >= 1) {
            digit = x % 10;
            x /= 10;
            reversed = reversed*10 + digit;
        }
        return original == reversed;
    }

}
