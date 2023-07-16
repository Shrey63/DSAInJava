package Strings;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String s = "abc";
//        permutate("", s);

        System.out.println(permutateNReturn("",s));
        System.out.println(countPermutations("",s));
    }

    private static void permutate(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        for (int i = 0; i < p.length() + 1; i++) {
            char c = up.charAt(0);
            permutate((new StringBuilder(p).insert(i, c)).toString(), up.substring(1));
        }
    }

    private static ArrayList<String> permutateNReturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> l=new ArrayList<>();
            l.add(p);
            return l;
        }
        ArrayList<String> ans=new ArrayList<>();

        for (int i = 0; i < p.length() + 1; i++) {
            char c = up.charAt(0);
            ans.addAll(permutateNReturn((new StringBuilder(p).insert(i, c)).toString(), up.substring(1)));
        }

        return ans;
    }
    private static int countPermutations(String p, String up) {
        if (up.isEmpty()) {
return 1;
        }
        ArrayList<String> ans=new ArrayList<>();
        int count=0;
        for (int i = 0; i < p.length() + 1; i++) {
            char c = up.charAt(0);
          count=count+countPermutations((new StringBuilder(p).insert(i, c)).toString(), up.substring(1));

        }
        return count;
    }

}