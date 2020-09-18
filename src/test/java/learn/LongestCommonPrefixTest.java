package learn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

    @Test
    void testOne() {
        String result = LongestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        Assertions.assertEquals("fl", result);
    }

    @Test
    void testTwo() {
        String result = LongestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        Assertions.assertEquals("", result);
    }
}
