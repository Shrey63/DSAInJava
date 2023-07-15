package Array;

import java.util.*;

public class ReverseArray
{
    public static void main(String[] args) {
        int[] a={10,30,60,50,45,65,20};
//        reverseA(a,a.length-1);
        reverseA(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    //logic is simple process till half from both the end and swap the numbers
    public static void  reverseA(int A[],int N)
    {
        for (int i = 0,j=N-1; i<j; i++,j--) {
            int t=A[i];
            A[i]=A[j];
            A[j]=t;
        }

    }
    public static void  reverseA(int A[],int start,int end)
    {
        if(start>=end)
            return;

            int t=A[start];
            A[start]=A[end];
            A[end]=t;
     reverseA(A,start+1,end-1);

    }
}

