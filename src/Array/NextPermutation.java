package Array;

import java.util.*;
public class NextPermutation {
    public static void main(String[] args) {
        int[] a={1,2,3};
        nextPermutation(a);

        System.out.println(Arrays.toString(a));
    }
        public static void nextPermutation(int[] a) {
            int i=a.length-2;
            while(i>=0 && a[i]>=a[i+1])
            {
                i--;
            }
            int i1=i;
            System.out.println(i1);
            i=a.length-1;
            while(a[i]<=a[i1])
                i--;
            int i2=i;
            System.out.println(i2);
            int m = a[i1];
            a[i1] = a[i2];
            a[i2] = m;

            for (int j = i1 + 1, k = a.length - 1; j <= k; ) {
                m = a[j];
                a[j] = a[k];
                a[k] = m;
                j++;
                k--;
            }


        }
}
