package Strings;

public class RotationOfString {
    public static void main(String[] args) {
        String s="ABCD";
        String s1="CDAB";
        if(s.length()!=s1.length() && (s+s).indexOf(s1)!=-1)
        {
            System.out.println("The string is not the rotation of another string");
        }
        else
        System.out.println("The string is the rotation of another string");

    }
}
