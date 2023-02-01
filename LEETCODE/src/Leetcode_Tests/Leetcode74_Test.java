package Leetcode_Tests;
import Leetcode_Problems.Leetcode74;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Leetcode74_Test {
    Leetcode74 leetcode = new Leetcode74();
    @Test
    public void testCase1() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        int target = 3;
        boolean expectedResult = true;
        boolean actualResult = leetcode.searchMatrix(matrix, target);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        int target = 13;
        boolean expectedResult = false;
        boolean actualResult = leetcode.searchMatrix(matrix, target);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3() {
        int[][] matrix = {{1, 3}};
        int target = 3;
        boolean expectedResult = true;
        boolean actualResult = leetcode.searchMatrix(matrix, target);
        assertEquals(expectedResult, actualResult);
    }
}
