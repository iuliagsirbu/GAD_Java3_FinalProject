package Leetcode_Tests;
import Leetcode_Problems.Leetcode1143;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Leetcode1143_Test {

    Leetcode1143 leetcode = new Leetcode1143();

    @Test
    public void testLongestCommonSubsequenceCase1() {
        String text1 = "abcde";
        String text2 = "ace";
        int expected = 3;
        int actual = leetcode.longestCommonSubsequence(text1, text2);
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestCommonSubsequenceCase2() {
        String text1 = "abc";
        String text2 = "def";
        int expected = 0;
        int actual = leetcode.longestCommonSubsequence(text1, text2);
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestCommonSubsequenceCase3() {
        String text1 = "abc";
        String text2 = "cba";
        int expected = 1;
        int actual = leetcode.longestCommonSubsequence(text1, text2);
        assertEquals(expected, actual);
    }
}
