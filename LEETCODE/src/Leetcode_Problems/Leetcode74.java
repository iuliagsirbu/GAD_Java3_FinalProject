package Leetcode_Problems;

public class Leetcode74 {
        public boolean searchMatrix(int[][] matrix, int target) {
            int left = 0, right = matrix.length - 1, mid = 0;
            while(left < right)
            {
                mid = (left + right) / 2;
                if(matrix[mid][matrix[0].length - 1] == target)
                    return true;
                if(matrix[mid][matrix[0].length - 1] < target)
                {
                    left += 1;
                }
                else right -= 1;
            }
            mid = (left + right) / 2;
            if(matrix[mid][matrix[0].length-1] == target)
                return true;
            int aux = mid;
            left = 0;
            right = matrix[0].length - 1;
            while(left < right)
            {
                mid = (left + right) / 2;
                if(matrix[aux][mid] == target)
                    return true;
                if(matrix[aux][mid] < target)
                {
                    left += 1;
                }
                else right -= 1;
            }
            mid = (left + right) / 2;
            if(matrix[aux][mid] == target)
                return true;
            return false;
        }
}
