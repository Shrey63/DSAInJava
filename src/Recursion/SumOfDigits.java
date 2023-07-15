package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
    int num=345;
        System.out.println(sod(num));
    }
    public static int sod(int num)
    {
        if(num==0)
            return 0;
        return num%10+sod(num/10);
    }
}
