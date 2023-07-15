package Array;

import java.util.*;

public class DistributeChocolate
{
    public static void main(String[] args) {
        int[] a={7, 3, 2, 4, 9, 12, 56};
        int m=3;
        System.out.println(minSubChocolate(a,m));
    }
    public static int minSubChocolate(int[] nums, int m)
    {
        if(nums.length==0 || m==0)
            return 0;
        if(m>nums.length)
            return 0;
        Arrays.sort(nums);
        m=m-1;

        int diff=Integer.MAX_VALUE;
        int nmin;
        for(int i=0;m<nums.length;i++,m++)
        {
            nmin=nums[m]-nums[i];
            if(nmin<diff)
                diff=nmin;
        }
        return diff;
    }
}

