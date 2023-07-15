package Array;

//https://www.geeksforgeeks.org/find-minimum-number-of-merge-operations-to-make-an-array-palindrome/
public class MinimumMerge {
    public static void main(String[] args) {
    int[] a={11,22,33,11};
        System.out.println(minMerge(a));
    }
    public static int minMerge(int[] a)
    {
        int ans=0;
for(int i=0,j=a.length-1;i<=j;)
{
    if(a[i]==a[j])
    {
        i++;
        j--;
    }
    else if(a[i]>a[j])
    {
        a[j-1]+=a[j];
        j--;
        ans++;
    }
    else
    {
        a[i+1]+=a[i];
        i++;
        ans++;
    }

}
        return ans;
    }

}
