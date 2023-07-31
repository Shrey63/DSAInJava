package Sorting.CountSort;


class MissingNumber {
    public int missingNumber(int[] a) {
        for(int i=0;i<a.length;)
        {
            if(a[i]>=a.length)
                i++;
            else if(a[i]!=i)
            {
                int pos=a[i];
                swap(a,i,pos);

            }
            else
                i++;
        }
        int i;
        for(i=0;i<a.length;i++)
        {
            if(a[i]!=i)
                break;
        }
        return i;
    }
    public void swap(int[] a, int f,int l)
    {
        a[f]=a[f]^a[l];
        a[l]=a[f]^a[l];
        a[f]=a[f]^a[l];
    }
}


























