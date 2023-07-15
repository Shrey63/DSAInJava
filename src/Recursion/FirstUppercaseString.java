package Recursion;

public class FirstUppercaseString {
    public static void main(String[] args) {
        System.out.println(firstUpper("shreya",6));

    }
    public static int firstUpper(String s,int l) {
        if (l == 0)
            return -1;
        if (Character.isUpperCase(s.charAt(l-1)))
            return l-1;
        return firstUpper(s,l-1);

    }
}
