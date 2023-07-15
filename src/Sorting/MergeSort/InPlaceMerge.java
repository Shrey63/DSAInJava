package Sorting.MergeSort;

import java.util.Arrays;

public class InPlaceMerge {
    public static void main(String[] args) {
        int[] b={4,3,2};
        mergeSort(b,0,b.length);
        System.out.println(Arrays.toString(b));
    }
    public static void mergeSort(int[] a, int s,int e)
    {
        if(e-s==1)
            return;
        int mid=(s+e)/2;
        mergeSort(a,s,mid);
        mergeSort(a,mid,e);
        merge(a,s,mid,e);
    }
    public static void merge(int[] a,int s,int m,int e)
    {
        int[] c=new int[e-s];
        int i=s, j=m,k=0;
        while(i<m && j<e)
        {
            c[k++]=a[i]<a[j]?a[i++]:a[j++];
        }
        if(i==m) {
            while (j <e)
                c[k++] = a[j++];
        }
        else {
            while (i < m)
                c[k++] = a[i++];
        }
        for(int x=0;x<c.length;x++)
        {
            a[s+x]=c[x];
        }
    }
}
