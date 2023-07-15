package Recursion;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(40));
    }
    public static boolean isPowerOfThree(int n) {
        if(n==3 || n==1)
            return true;
        if(n==0)
            return false;
        return n%3==0? isPowerOfThree(n/3):false;
    }
}
