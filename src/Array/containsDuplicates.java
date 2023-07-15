package Array;

import java.util.*;
public class containsDuplicates {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        System.out.println(containsDuplicate(a));
    }
        public static boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set=new HashSet<>();
            for (int n : nums) {
                if(set.contains(n))
                    return true;
                set.add(n);
            }
            return false;
    }
}
