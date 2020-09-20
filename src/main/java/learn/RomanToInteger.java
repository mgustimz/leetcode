package learn;

public class RomanToInteger {

    private RomanToInteger() {
        throw new IllegalStateException("Utility class");
    }

    public static int romanToInt(String s) {
        int result = 0;
        char[] ch = s.toUpperCase().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'I') {
                if (i + 1 < ch.length) {
                    if (ch[i + 1] == 'V' || ch[i + 1] == 'X') {
                        result -= 1;
                    } else {
                        result += 1;
                    }
                } else {
                    result += 1;
                }
            } else if (ch[i] == 'V') {
                result += 5;
            } else if (ch[i] == 'X') {
                if (i + 1 < ch.length) {
                    if (ch[i + 1] == 'L' || ch[i + 1] == 'C') {
                        result -= 10;
                    } else {
                        result += 10;
                    }
                } else {
                    result += 10;
                }
            } else if (ch[i] == 'L') {
                result += 50;
            } else if (ch[i] == 'C') {
                if (i + 1 < ch.length) {
                    if (ch[i + 1] == 'D' || ch[i + 1] == 'M') {
                        result -= 100;
                    } else {
                        result += 100;
                    }
                } else {
                    result += 100;
                }
            } else if (ch[i] == 'D') {
                result += 500;
            } else if (ch[i] == 'M') {
                result += 1000;
            }
        }
        return result;
    }
}