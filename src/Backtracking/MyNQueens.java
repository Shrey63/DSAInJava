package Backtracking;

import java.util.ArrayList;
import java.util.List;


class MyNQueens {
    public static void main(String[] args) {
        List<List<String>> ts = new ArrayList<>();
        ts = solveNQueens(4);
        for (List<String> innerList : ts) {
            for (String str : innerList) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        List<List<String>> s=new ArrayList<>();
        s=mysolveNQueens(board,0);
        return s;
    }
    public static List<List<String>> mysolveNQueens(boolean[][] board,int row) {
        if(row==board.length)
        {
            List<List<String>> s=new ArrayList<>();
            List<String> ll=makeans(board);
            s.add(ll);
            return s;
        }
        List<List<String>> s=new ArrayList<>();
        for(int i=0;i<board[0].length;i++)
        {
            if(checkSafe(board,row,i))
            {
                board[row][i]=true;
                s.addAll(mysolveNQueens(board,row+1));
                board[row][i]=false;
            }
        }
        return s;
    }
    public static List<String> makeans(boolean[][] board)
    {
        List<String> l=new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            String s="";
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j])
                {
                    s+='Q';
                }
                else
                {
                    s+=".";
                }

            }
            l.add(s);

        }
        return l;

    }
    public static boolean checkSafe(boolean[][] board,int r,int c)
    {
        // check that colunm
        for(int i=0;i<r;i++)
        {
            if(board[i][c])
                return false;
        }
        //check left daigonal
        int min=Math.min(r,c);
        for(int i=1;i<=min;i++)
        {
            if(board[r-i][c-i])
                return false;

        }
        min=Math.min(r,board[0].length-c-1);
        //check right daigonal
        for(int i=1;i<=min;i++)
        {
            if(board[r-i][c+i])
                return false;

        }
        return true;
    }
}