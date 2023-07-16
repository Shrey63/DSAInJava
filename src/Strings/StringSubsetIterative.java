package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringSubsetIterative {
    public static void main(String[] args) {
        int[] i={1,2,3};

        ArrayList<ArrayList<Integer>> a=generateIt(i);
        for (ArrayList<Integer> m: a)
        {
            System.out.println(m.toString());
        }
        int [] j={2,1,2};
    Arrays.sort(j);
    ArrayList<ArrayList<Integer>> b=generateIt(j);
    for (ArrayList<Integer> m: b)
    {
        System.out.println(m.toString());
    }


    }

    private static ArrayList<ArrayList<Integer>> generateIt(int[] arr) {
        ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
        outer.add(new ArrayList<>());
        for(int nums: arr)
        {
            int n=outer.size();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> internal=new ArrayList<>(outer.get(i));
            internal.add(nums);

            outer.add(internal);

        }
        }
        return outer;
    }
    private static ArrayList<ArrayList<Integer>> generateItWithDuplicates(int[] arr) {
        ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
        outer.add(new ArrayList<>());
        for(int nums: arr)
        {
            int n=outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(nums);
                if(!outer.contains(internal))
                    outer.add(internal);

            }
        }
        return outer;
    }

}
