package Recursion;
import java.util.Arrays;

public class SumTraingle {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        sumTraingle(a);
    }
    public static void sumTraingle(int[] a)
    {
        if(a.length==0)
            return;

        int[] n=new int[a.length-1];
        for(int i=1;i<a.length;i++)
        {
               n[i-1]=a[i]+a[i-1];
        }
        sumTraingle(n);
        System.out.println(Arrays.toString(a));
    }
}
