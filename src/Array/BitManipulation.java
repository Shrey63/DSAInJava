package Array;

/*package whatever //do not write package name here */
public class BitManipulation{
    public static void main(String[] args) {

        int a=60;
        int b=95;
        int s=b-a+1;
        int[] bit=new int[b-a+1];
// Arrays.fill(bit,0);
        for(int i=a;i<=b;i++)
        {
            if(i%b==0 || i%a==0 )
                bit[i-a]=1;
        }
        for(int i=a;i<=b;i++)
        {
            if(bit[i-a]==1)
                System.out.println(i);
        }
    }

}
