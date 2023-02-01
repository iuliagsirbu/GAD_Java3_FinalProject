package Leetcode_Problems;
import java.util.*;
public class Leetcode198 {
        public int rob(int[] nums) {
            Vector<Integer> money = new Vector<>();
            if(nums.length > 1)
            {
                money.add(nums[0]);
                money.add(Math.max(nums[0], nums[1]));
                for(int i=2;i<nums.length;i++)
                {
                    money.add(Math.max(money.get(i-1), money.get(i-2) + nums[i]));
                }
                return money.get(nums.length - 1);
            }
            else return nums[0];
        }
}
