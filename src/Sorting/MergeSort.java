package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int[] a= {10,20,30,40};
        int[] b={35,60,70,89,20,25,30};

        System.out.println(Arrays.toString(mergeSort(b)));
    }
    public static int[] mergeSort(int[] a)
    {
        if(a.length==1)
            return a;
        int mid=a.length/2;
//        int[] l=;
//        int[] r=;
        return merge(mergeSort(Arrays.copyOfRange(a,0,mid)),mergeSort(Arrays.copyOfRange(a,mid,a.length)));

    }
    public static int[] merge(int[] a, int[] b)
    {
        int[] c=new int[a.length+b.length];
        int i=0, j=0,k=0;
        while(i<a.length && j<b.length)
        {
            c[k++]=a[i]<b[j]?a[i++]:b[j++];
        }
        if(i==a.length) {
            while (j < b.length)
                c[k++] = b[j++];
        }
        else {
            while (i < a.length)
                c[k++] = a[i++];
        }
        return c;
    }
}
