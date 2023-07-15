package Strings;

public class SkipGivenChar {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("aShayuhaaa");
//        System.out.println(skipChar(new StringBuilder(s),'a'));
        skip(s,new StringBuilder(""),'a');
    }

    private static String skipChar(StringBuilder s, char a) {
        if(s.length()==0)
            return "";
        if(s.charAt(0)!=a)
        {
            return s.charAt(0)+skipChar(new StringBuilder(s.substring(1)),a);
        }
        else {
            return ""+skipChar(new StringBuilder(s.substring(1)),a);
        }

    }

    private static void skip(StringBuilder p,StringBuilder up, char a) {
        if(p.length()==0) {
            System.out.println(up.toString());
            return ;
        }
        if(p.charAt(0)!=(a))
        {
            skip(new StringBuilder(p.substring(1)),up.append(p.charAt(0)),a);
        }
        else {
            skip(new StringBuilder(p.substring(1)),up,a);
        }

    }

}
