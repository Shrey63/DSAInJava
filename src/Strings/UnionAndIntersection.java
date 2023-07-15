package Strings;

import java.util.*;
public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1={20,10,40,40,50,60};
        int[] arr2={50,10,40,90,70};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(IntersectionNumbers(arr1,arr2)));
        System.out.println(Arrays.toString(UnionNumbers(arr1,arr2)));
    }

    private static int[] UnionNumbers(int[] arr1, int[] arr2) {
        HashSet<Integer> h = new HashSet();
        Iterator<Integer> iterator = h.iterator();
        int min = arr1.length < arr2.length ? arr1.length : arr2.length;
        for (int i = 0; i < min; i++) {
            h.add(arr1[i]);
            h.add(arr2[i]);
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
        if (arr1.length > min) {
            for (int i = min; i < arr1.length; i++)
                h.add(arr1[i]);

        } else if (arr2.length > min){
            for (int i = min; i < arr2.length; i++) {
                h.add(arr2[i]);
            }

        }
        int[] a = h.stream().mapToInt(Integer::intValue).toArray();
        return a;
//        return h.size();  if told to return number of elements in union
    }

    public static int[] IntersectionNumbers (int[] a1,int[] a2) {
        Vector<Integer> v=new Vector<>();
        int i=0,j=0,k=0;
        while(i<a1.length && j<a2.length)
        {
           if(a1[i]<a2[j])
                i++;
            else if(a1[i]>a2[j])
                j++;
            else
            {
               v.add(a1[i]);
               k++;
               i++;
               j++;
           }
        }
        int[] a = v.stream().mapToInt(Integer::intValue).toArray();
        return a;
    }
//    public static int[] UnionNumbers (int[] a1,int[] a2) {
//
//    }
}
