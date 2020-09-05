package learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    void testOne() {
        int[] result = TwoSum.twoSum(new int[]{2, 7, 5, 11}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testTwo() {
        int[] result = TwoSum.twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void testThree() {
        int[] result = TwoSum.twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testOne1() {
        int[] result = TwoSum.twoSum2(new int[]{2, 7, 5, 11}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testTwo2() {
        int[] result = TwoSum.twoSum2(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void testThree3() {
        int[] result = TwoSum.twoSum2(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }

}
