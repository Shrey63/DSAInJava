//import java.util.*;
//public class RepeatedNumbers {
//    public static void main(String[] args) {
//        int[] a={1,2,3,4,5,6,6,8};
//        System.out.println(Arrays.toString(findnum(a)));
//    }
//    public static int[] findnum(int[] a)
//    {
//        int l=a.length;
//        int s=Arrays.stream(a).sum();
//        int as=l*(l+1)/2;
//        int diff=as-s;
//        int ss=0;
//        for(int x:a)
//        ss+=x*x;
//        int summ=((l*(l+1)*(2*l+1))/6-ss)/diff;
//        int b=(diff+summ)/2;
//        int a=(summ-diff)/2;
//        return new int[]{a,b};
//
//
//    }
//}
