package learn;

public class ReverseInteger {

    public static int reverse(int x) {
        String ans = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();
        try {
            return Integer.parseInt(ans);
        } catch (Exception e) {
            return 0;
        }
    }

    private ReverseInteger() {
        throw new IllegalStateException("Utility class");
    }

}
