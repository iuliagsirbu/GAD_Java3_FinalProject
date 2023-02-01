package Leetcode_Tests;
import Leetcode_Problems.Leetcode198;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Leetcode198_Test {
    Leetcode198 leetcode = new Leetcode198();

    @Test
    public void testRob_Example1() {
        int[] nums = {1,2,3,1};
        int expected = 4;
        int actual = leetcode.rob(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testRob_Example2() {
        int[] nums = {2,7,9,3,1};
        int expected = 12;
        int actual = leetcode.rob(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testRob_SingleElement() {
        int[] nums = {5};
        int expected = 5;
        int actual = leetcode.rob(nums);
        assertEquals(expected, actual);
    }

}
