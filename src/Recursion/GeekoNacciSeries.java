package Recursion;

import java.util.*;
public class GeekoNacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTestCases = scanner.nextInt();


        for (int i = 0; i < numTestCases; i++) {

            int[] testCase = new int[4];
            for (int j = 0; j < 4; j++) {
                testCase[j] = scanner.nextInt();

            }

            System.out.println(fib(new int[]{testCase[0],testCase[1],testCase[2]},testCase[3]));
        }

    }

    public static int fib(int[] a,int n) {
        if(n==1)
            return a[0];
        if(n==2)
            return a[1];
        if(n==3)
            return a[2];

        return fib(a,n-1)+fib(a,n-2)+fib(a,n-3);
    }
}
