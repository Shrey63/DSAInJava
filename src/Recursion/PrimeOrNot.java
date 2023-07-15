package Recursion;

public class PrimeOrNot {
    public static void main(String[] args) {
        if(checkprime(1,2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean checkprime(int n, int start)
    {

        if(n==start)
            return true;
        if(n%start==0)
            return false;
        if(n<2)
            return true;
        return checkprime(n,++start);
    }
}
