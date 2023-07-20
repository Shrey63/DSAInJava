package Backtracking;



public class sudoku {
    public static void main(String[] args) {
        int[][] board = new int[][]{{5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}};
        if (!solve(board))
            System.out.println("cant be solved");
        else
            display(board);

    }

    public static boolean solve(int[][] board) {
        int r = -1;
        int c = -1;
        boolean isEmpty = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    r = i;
                    c = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty)
                break;

        }
        if (isEmpty) {
            return true;
        }
        for (int nums = 1; nums <= 9; nums++) {
            if (isSafe(board, r, c, nums)) {
                board[r][c] = nums;
                if (solve(board))
                    return true;
                else
                    board[r][c] = 0;
            }

        }

        return false;
    }


    private static boolean isSafe(int[][] board, int r, int c, int nums) {

        //check row
        for (int i = 0; i < board.length; i++) {
            if(board[r][i]==nums)
                return false;
        }

        //check column
        for (int i = 0; i < board.length; i++) {
            if(board[i][c]==nums)
                return false;
        }

        //check in box
        int s= (int) Math.sqrt(board.length);
        int rowstart=r-r%s;
        int colstart=c-c%s;
        for (int i = rowstart; i < rowstart+s; i++) {
            for (int j = colstart; j < colstart+s; j++) {
                if(board[i][j]==nums)
                    return false;
            }
        }
        return true;
    }

    public static void display(int[][] board)
    {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
