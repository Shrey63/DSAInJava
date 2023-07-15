package Strings;

import java.util.HashMap;

public class EquivalentNumKeypad {
    public static void main(String[] args) {
    String s="GEEKSFORGEEKS";
        System.out.println(getNum(s));
    }
    public static String getNum(String s)
    {
        StringBuilder sb=new StringBuilder();
        String[] ip={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888"
                ,"9","99","999","9999"};
        char[] ch=s.toCharArray();
        for (char c:ch)
        {
            int pos=c-'A';
            sb.append(ip[pos]);
        }

        return sb.toString();
    }

}
