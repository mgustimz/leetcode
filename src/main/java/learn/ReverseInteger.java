package learn;

public class ReverseInteger {

    private ReverseInteger() {
        throw new IllegalStateException("Utility class");
    }

    public static int reverse(int x) {
        String ans = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();
        try {
            return Integer.parseInt(ans);
        } catch (Exception e) {
            return 0;
        }
    }

}
