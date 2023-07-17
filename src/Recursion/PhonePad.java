package Recursion;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        String s="1";
        combinationsOf("",s);
        System.out.println(combinationsList("",s).toString());
    }

    private static void combinationsOf(String p,String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int k=up.charAt(0)-'0';

        for (int i=(k-1)*3;i<k*3;i++)
            combinationsOf(p+((char)('a'+i)),up.substring(1));
    }

    private static ArrayList<String> combinationsList(String p,String up) {
        ArrayList<String> a= new ArrayList<>();
        if(up.isEmpty()) {
            a.add(p);
            return a;
        }
        int k=up.charAt(0)-'0';
        ArrayList<String> l= new ArrayList<>();
        for (int i=(k-1)*3;i<k*3;i++) {
            l.addAll(combinationsList(p + ((char) ('a' + i)), up.substring(1)));

        }
        return l;
    }
}
