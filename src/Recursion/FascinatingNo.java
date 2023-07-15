package Recursion;

public class FascinatingNo {
    public static void main(String[] args) {
        int n=783;
        System.out.println(isFascinating(n));
    }
    public static boolean isFascinating(int n) {
        int x=2*n;
        int y=3*n;
        StringBuilder s= new StringBuilder(n+"");
        s.append(x+"");
        s.append(y+"");
        int j=0;
        if(!s.toString().contains("0"))
        {
            for(int i=1;i<=9;i++)
            {
                if(s.toString().contains(i+""))
                    j++;
            }
        }
        else
            return false;
        if(j==9 && s.toString().length()==9)
            return true;
        else
            return false;
    }
}
