package Recursion;

import com.sun.org.apache.bcel.internal.generic.RET;

public class ProductOfTwoNums {
    public static void main(String[] args) {
        System.out.println(product(2,5));
    }
    public static int product(int num,int n)
    {
        if(n==1)
            return num;
        if (num<n)
            return product(n,num);
        return n*product(num,n-1);
    }
}
