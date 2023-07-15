package Array;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] a={30,40,50,10,20};
        int i=findmax(a);
        int sum=30;
        if(i!=-1)
        {
            int max=i;
            int min=i+1;
            while(a[max]+a[min]!=sum)
            {
                if(a[max]+a[min]<sum)
                    min=(min+1)%a.length;
                else
                    if(max==0)
                        max=a.length-1;
                    else
                    max=(max-1)%a.length;

            }
            System.out.println(a[max]);
            System.out.println(a[min]);
        }
//        else
//        {
//
//        }
    }
    public static int findmax(int[] a)
    {
        int mid,start=0;
        int end=a.length-1;
        while(start<=end)
        {
               mid=start+(end-start)/2;
               if(a[mid]>a[mid+1])
                   return mid;
               else if(a[mid-1]>a[mid])
            return mid-1;
               else if(a[start]>a[mid])
                   end=mid-1;
                   else
                       start=mid+1;


        }
        return -1;
    }
}
