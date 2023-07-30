package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] a={3,2,4,1,5};
        cyclicSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void cyclicSort(int[] a)
    {
        for(int i=0;i<a.length;)
        {
            if(a[i]!=i+1)
            {
                int pos=a[i]-1;

                // swap element
                int temp=a[i];
                a[i]=a[pos];
                a[pos]=temp;
            }
            else
                i++;
        }
        for(int i=0;i<a.length;i++) {
            if (a[i] == i + 1)
                continue;
            else
            {
                System.out.println("Still not sorted");
            }
        }
    }
}
