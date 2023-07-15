package Recursion;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        System.out.println(naturalSum(5));
    }

    public static int naturalSum(int n) {
        if (n == 1)
            return 1;
        return n + naturalSum(n - 1);
    }
}