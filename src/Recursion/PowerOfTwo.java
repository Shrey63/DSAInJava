package Recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(twoPower(1));
    }
    public static boolean twoPower(int num)
    {
        if (num==2 || num==1)
            return true;
        if(num==0)
            return false;
        return num % 2 == 0 && twoPower(num / 2);

    }
}
