//package Backtracking;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class NQueens {
//    public static void main(String[] args) {
//        int n=4;
//        boolean[][] board=new boolean[n][n];
//        mysolveNQueens(board,0);
////        for (List<String> innerList : s) {
////            for (String str : innerList) {
////                System.out.print(str + " ");
////            }
////            System.out.println();
//    }
//    public static void  mysolveNQueens(int[][] board, int row) {
//        if(row==board.length)
//        {
//            display(board);
//            System.out.println();
//            return;
//        }
////        List<List<String>> s=new ArrayList<>();
//        for(int i=0;i<board[0].length;i++)
//        {
//            if(checkSafe(board,row,i))
//            {
//                board[row][i]=true;
//          mysolveNQueens(board,row+1);
//                board[row][i]=false;
//            }
////            else
////            mysolveNQueens(board,row);
//
//        }
//    }
//
//    private static void display(int[][] board) {
//        for(int i=0;i<board.length;i++)
//        {
//            for(int j=0;j<board[0].length;j++)
//            {
//                if(board[i][j])
//                {
//                    System.out.print(" Q");
//                }
//                else
//                {
//                    System.out.print(" X");
//                }
//
//            }
//            System.out.println();
//        }
//
//    }
//
//    public static List<String> makeans(boolean[][] board)
//    {
//        List<String> l=new ArrayList<>();
//        for(int i=0;i<board.length;i++)
//        {
//            String s="";
//            for(int j=0;j<board[0].length;j++)
//            {
//                if(board[i][j])
//                {
//                    s+='Q';
//                }
//                else
//                {
//                    s+=".";
//                }
//
//            }
//            l.add(s);
//
//        }
//        return l;
//
//    }
//    public static boolean checkSafe(boolean[][] board,int r,int c)
//    {
//        // check that colunm
//        for(int i=0;i<r;i++)
//        {
//            if(board[i][c])
//                return false;
//        }
//        //check left daigonal
//        int min=Math.min(r,c);
//        for(int i=1;i<=min;i++)
//        {
//            if(board[r-i][c-i])
//                return false;
//
//        }
//        min=Math.min(r,board[0].length-c-1);
//        //check right daigonal
//        for(int i=1;i<=min;i++)
//        {
//            if(board[r-i][c+i])
//                return false;
//
//        }
//        return true;
//    }
//}