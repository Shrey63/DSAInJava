package Recursion;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] a={10,20,30};
        System.out.println(max(a,a.length));
        System.out.println(min(a,a.length));
    }
    public static int max(int[] a,int l) {
        if (l == 1) {
            return a[0];
        }
        return Math.max(a[l-1],max(a,l-1 ));
    }
    public static int min(int[] a,int l)
    {
     if(l==1)
         return a[0];
     return Math.min(a[l-1],min(a,l-1));
    }
}
