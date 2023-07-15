package Array;

import java.util.*;

public class ArrayMinMax
    {
        public static void main(String[] args) {
            int[] a={10,30,60,50,45,65,20};
            System.out.println(findSum(a,a.length));
        }
        public static int findSum(int A[],int N)
        {
            Arrays.sort(A);
            return A[0]+A[N-1];
        }
    }

