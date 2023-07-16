package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class stringSubset {
    public static void main(String[] args) {
        String s="abc";


        generate("",s);
        ArrayList<String >ans=generateSequencially("",s);
        Collections.sort(ans, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });
        System.out.println(ans.toString());

    }

    private static void generate(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char c=up.charAt(0);
        generate(p+c,up.substring(1));
        generate(p,up.substring(1));


    }


    private static ArrayList<String> generateSequencially(String p,String up) {
        if(up.isEmpty()) {
//            System.out.println(p);
            ArrayList<String> ar=new ArrayList<String>();
            ar.add(p);
            return ar;
        }
        char c=up.charAt(0);
       ArrayList<String> l=generateSequencially(p+c,up.substring(1));
        ArrayList<String> r=generateSequencially(p,up.substring(1));
        l.addAll(r);
        return l;
    }

}
