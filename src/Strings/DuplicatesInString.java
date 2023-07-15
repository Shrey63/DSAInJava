package Strings;

import com.sun.org.apache.bcel.internal.generic.INEG;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInString {
    public static void main(String[] args) {
    String s="abccdeff";
    findduplicates(s);
    }
    public static void findduplicates(String s)
    {
        HashMap<String,Integer> m=new HashMap<>();
        char[] st=s.toCharArray();
        for(char ch:st)
        {
            if(m.containsKey(ch+""))
            {
                m.put(ch+"",m.get(ch+"")+1);
            }
            else
            {
                m.put(ch+"",1);
            }
        }
        for(Map.Entry<String, Integer> e:m.entrySet())
        {
            if(e.getValue()>1)
            {
                System.out.println(e.getKey()+" "+e.getValue());
            }
        }



    }

}
