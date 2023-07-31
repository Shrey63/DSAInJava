package Sorting.CountSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllMissing {
        public List<Integer> findDisappearedNumbers(int[] a) {
            for(int i=0;i<a.length;)
            {
                if(a[i]!=i+1)
                {
                    int pos=a[i]-1;
                    if(a[i]!=a[pos])
                        swap(a,i,pos);
                    else
                        i++;
                }
                else
                    i++;
            }
            System.out.println(Arrays.toString(a));
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<a.length;i++)
            {
                if(a[i]!=i+1)
                    l.add(i+1);
            }
            return l;
        }
        public void swap(int[] a, int f, int l)
        {
            a[f]=a[f]^a[l];
            a[l]=a[f]^a[l];
            a[f]=a[f]^a[l];
        }

}
