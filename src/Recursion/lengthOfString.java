package Recursion;

public class lengthOfString {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Shreya");
        System.out.println(len(s));
    }
    public static int len(StringBuilder s)
    {
        if (s.toString().isEmpty())
            return 0;

        return len(s.replace(0,1,""))+1;


    }
}
