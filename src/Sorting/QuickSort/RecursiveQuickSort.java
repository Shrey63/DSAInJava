package Sorting.QuickSort;

import java.util.Arrays;

public class RecursiveQuickSort {
    public static void main(String[] args) {
        int[] b={4,3,7,2,1};

        QuickSort(b,0,b.length-1);
        System.out.println(Arrays.toString(b));
    }

    public static void QuickSort(int[] a, int low,int high)
    {
    if(low>=high)
        return;
    int start=low;
    int end=high;
    int m=(start+end)/2;
    int p=a[m];
    while(start<=end) {
        while (a[start] < p) start++ ;
        while (a[end] > p) end-- ;
        if(start<=end)
        {
            int t=a[start];
            a[start++]=a[end];
            a[end--]=t;
        }
    }
    QuickSort(a,low,end);
    QuickSort(a,start,high);
    }

}
