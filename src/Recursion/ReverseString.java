package Recursion;

public class ReverseString {
    public static void main(String[] args) {
       char[] s="\"A\",\" \",\"m\",\"a\",\"n\",\",\",\" \",\"a\",\" \",\"p\",\"l\",\"a\",\"n\",\",\",\" \",\"a\",\" \",\"c\",\"a\",\"n\",\"a\",\"l\",\":\",\" \",\"P\",\"a\",\"n\",\"a\",\"m\",\"a\"".toCharArray();
        char [] ss=reverseString(s,0,s.length-1);
        System.out.println(ss);
    }
    public static char[] reverseString(char[] s,int start,int end)
    {

        if(start<(s.length/2))
        {
            char t=s[start];
            s[start]=s[end];
            s[end]=t;

            return reverseString(s,++start,--end);
        }
        else
            return s;
    }
}
