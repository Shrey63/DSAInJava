package Patterns;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pattern 1");
        pattern1(5);
        System.out.println("Pattern 2");
        pattern2(5);
        System.out.println("Pattern 3");
        pattern3(5);
        System.out.println("Pattern 4");
        pattern4(5);
        System.out.println("Pattern 5");
        pattern5(5);
        System.out.println("Pattern 6");
        pattern6(10);
        System.out.println("Pattern 7");
        pattern7(4);
    }

    public static void pattern7(int n) {
        int o=n;
        n*=2;
        for (int i = 0; i<=n; i++) {
            for (int j = 0; j <=n; j++) {
                System.out.print(o-Math.min( Math.min(i,j), Math.min(n-i, n-j))+" ");
            }
            System.out.println();
        }


    }
    public static void pattern6(int n) {
        for (int i = 1; i <= 2*(n-1); i++) {

            int sp=i<=n?n-i:i-n;
            for (int j = 1; j <= sp; j++)
                System.out.print("  ");
            if(i<=n) {
                for (int j = i; j >= 1; j--)
                    System.out.print(j + " ");

                for (int k = 2; k <= i; k++)
                    System.out.print(k + " ");

                System.out.println();
            }
            else {
                for (int j =2*n-i; j >= 1; j--)
                    System.out.print(j + " ");

                for (int k = 2; k <=2*n-i; k++)
                    System.out.print(k + " ");

                System.out.println();
            }
        }
    }
    public static void pattern1(int n) {
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

        for (int row = 1; row <=n; row++) {
            for(int col=1;col<=row;col++)
                System.out.print("* ");
            System.out.println();
        }

    }

    public static void pattern5(int n)
    {
//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *
        for (int i = 1; i <=2*n-1; i++) {

            int num=i<=n?i:2*n-i;
            int sp=i<=n?n-i:i-n;
//            System.out.println(num);
//            System.out.println(sp);
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=num; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    public static void pattern4(int n) {

//        for (int row = 1; row <n; row++) {
//            for(int col=1;col<=row;col++)
//                System.out.print("* ");
//            System.out.println();
//        }
//        for (int row = n; row >=0; row--) {
//            for(int col=1;col<=row;col++)
//                System.out.print("* ");
//            System.out.println();
//        }


        for(int i=1;i<=2*n-1;i++)
        {
            int c;
            if(i>n)
                c=n-(i-(n+1)+1);
            else
                c=i;
            for (int j = 1; j <=c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n) {

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

        for (int row = 1; row <=n; row++) {
            for(int col=1;col<=row;col++)
                System.out.print(col+" ");
            System.out.println();
        }

    }

    public static void pattern2(int n) {
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
        for (int row = n; row >=0 ; row--) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}