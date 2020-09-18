package learn;

public class LongestCommonPrefix {

    private LongestCommonPrefix() {
        throw new IllegalStateException("Utility class");
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (true) {
            for (int i = 0; i < strs.length; i++) {
                if ((strs[i] == null || strs[i].length() == 0)                              // 1.if current string is null or length 0, we are done.
                        || (idx >= strs[i].length())                                        // 2.if current idx is out of range for the current string, we are done
                        || (i - 1 >= 0 && strs[i].charAt(idx) != strs[i - 1].charAt(idx)))  // 3.if the char from previous string is different from curr one, we are done
                    return sb.toString();
            }
            sb.append(strs[0].charAt(idx++)); // otherwise, we append current letter into sb and update idx
        }
    }
}
