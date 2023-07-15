package Array;

import java.util.*;

public class MaxSubArray
{
    public static void main(String[] args) {
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }
    public static int maxSubArray(int[] nums) {

        if(nums.length==0)
            return 0;
        int c_array=nums[0];
        int m=nums[0];
        //approach is to store the max between current element and the sum of previous elements which is curr_max
        for(int i=1;i<nums.length;i++)
        {
            c_array=Math.max(nums[i],c_array+nums[i]);
            // this is max so far which shows which one is max the previous sum so far or the current sum
            m=Math.max(m,c_array);
        }
        return m;
    }
}

