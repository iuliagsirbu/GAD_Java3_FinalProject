package Leetcode_Tests;
import Leetcode_Problems.Leetcode53;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Leetcode53_Test {
    @Test
    public void testMaxSubArrayWithPositiveNumbers() {
        int[] nums = {1, 2, 3, 4};
        int expected = 10;
        Leetcode53 leetcode = new Leetcode53();
        int actual = leetcode.maxSubArray(nums);
        assertEquals(expected, actual);
    }
    @Test
    public void testMaxSubArrayWithNegativeNumbers() {
        int[] nums = {-2, -3, -4, -1};
        int expected = -1;
        Leetcode53 leetcode = new Leetcode53();
        int actual = leetcode.maxSubArray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxSubArrayWithMixedNumbers() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        Leetcode53 leetcode = new Leetcode53();
        int actual = leetcode.maxSubArray(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxSubArrayWithAllZeros() {
        int[] nums = {0, 0, 0, 0};
        int expected = 0;
        Leetcode53 leetcode = new Leetcode53();
        int actual = leetcode.maxSubArray(nums);
        assertEquals(expected, actual);
    }
}