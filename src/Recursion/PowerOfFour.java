package Recursion;

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(40));
    }
    public static boolean isPowerOfFour(int n) {
        if (n==1)
            return true;
        if (n==0)
            return false;
        return n % 4 == 0 && isPowerOfFour(n / 4);
    }
}
