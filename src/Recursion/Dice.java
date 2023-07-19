package Recursion;


import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        int c = 6;
        int d = 2;
        findways("", c);

        for (String n : findwaysList("", c)) {
            if (n.length() == d)
                System.out.println(n);
        }
    }

    private static void findways(String s, int c) {
        if (c == 0) {
            System.out.println(s);
            return;
        }
        for (int i = 1; i <= c; i++) {

            findways(s + i, c - i);
        }
    }

    private static ArrayList<String> findwaysList(String s, int c) {
        if (c == 0) {
            ArrayList<String> l = new ArrayList<String>();
            l.add(s);
            return l;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= c; i++) {

            list.addAll(findwaysList(s + i, c - i));
        }
        return list;
    }

}
