package Strings;

public class stringSubset {
    public static void main(String[] args) {
        String s="abcdef";


        generate("",s);
    }

    private static void generate(String p,String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char c=up.charAt(0);
        generate(p+c,up.substring(1));
        generate(p,up.substring(1));

    }
}
