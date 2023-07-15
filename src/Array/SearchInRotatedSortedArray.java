package Array;

import java.util.function.BinaryOperator;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60};
        int s=50;
        int p=search(a);
        if(p!=-1)
        {
            int index=BinarySearch(a,true,0,p,s);
            if(index==-1)
            {
                index = BinarySearch(a, true, p + 1, a.length - 1, s);
                if(index==-1)
                    System.out.println("Not found");
                else
                    System.out.println(index);
            }
            else
                System.out.println(index);
        }
        else
        {
            int index=BinarySearch(a,true,0,a.length,s);
            System.out.println(index);
        }
    }
    public static int search(int[] a)
    {
        int start=0;
        int end=a.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (end> mid && a[mid]>a[mid+1])
                return mid;
            else if(mid>start && a[mid-1]>a[mid])
                return mid-1;
            else if(a[start]>a[mid])
                end=mid-1;
                else
                    start=mid+1;

        }
        return -1;
    }
    public static int BinarySearch(int[] a, boolean isNormal, int start, int end, int target)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(a[mid]==target)
                return mid;
            if(isNormal)
            {
                if(a[mid]<=target)
                    start=mid+1;
                    else
                        end=mid-1;
            }
            else
            {
                if(a[mid]<=target)
                    end=mid-1;
                else
                    start=mid+1;
            }

        }
        return -1;
    }
}
