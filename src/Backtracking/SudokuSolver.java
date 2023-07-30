package Backtracking;

public class SudokuSolver {
        public static void main(String[] args) {
            char[][] board = new char[][]{
                    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                    {'.', '6', '.', '.', '.', '.', '2', '8', '0'},
                    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
            };
            solve(board);
            display(board);
        }

        public static void solve(char[][] board) {
            int r = -1;
            int c = -1;
            boolean isEmpty = true;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j]=='.') {
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
                return;
            }
            for (int nums = 1; nums <= 9; nums++) {
                if (isSafe(board, r, c, nums)) {
                    board[r][c] =Character.forDigit(nums,10);
                    solve(board);
                    if(!isComplete(board))
                        board[r][c] ='.';
                }


            }
        }

        private static boolean isComplete(char[][] c)
        {
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c.length; j++) {
                    if(c[i][j]=='.')
                        return false;

                }

            }
            return true;
        }
        private static boolean isSafe(char[][] board, int r, int c, int nums) {

            //check row
            for (int i = 0; i < board.length; i++) {
                if(board[r][i]==Character.forDigit(nums,10))
                    return false;
            }

            //check column
            for (int i = 0; i < board.length; i++) {
                if(board[i][c]==Character.forDigit(nums,10))
                    return false;
            }

            //check in box
            int s= (int) Math.sqrt(board.length);
            int rowstart=r-r%s;
            int colstart=c-c%s;
            for (int i = rowstart; i < rowstart+s; i++) {
                for (int j = colstart; j < colstart+s; j++) {
                    if(board[i][j]==Character.forDigit(nums,10))
                        return false;
                }
            }
            return true;
        }

        public static void display(char[][] board)
        {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
        }
}
