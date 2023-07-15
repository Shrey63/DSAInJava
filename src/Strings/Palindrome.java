package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.next();
        if(isPalindrome(s))
        {
            System.out.println("The string is palindrome");
        }
        else {
            System.out.println("The string is not palindrome");
        }
//        System.out.println(s);
//        StringBuilder sb=new StringBuilder(s);
//        sb.reverse();
//        System.out.println(sb.toString());
//        if(s.equals(sb.toString()))
//        {
//            System.out.println("The string is palindrome");
//        }
//        else
//        {
//            System.out.println("The string is not palindrome");
//
//    }
}
    public static boolean isPalindrome(String s) {
        if(s==null && s.length()==0)
            return true;
        s = s.toLowerCase();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(s.length() - 1 - i) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    }
