public class Board {
    public int[][] board;

    //Construct a board with length and height
    public Board(int board_width, int board_height)
    {
        this.board = new int[board_width][board_height];
    }

    //Sets value at a specific index in board to give value
    public void set_value(int x, int y, int value)
    {
        this.board[x][y] = value; 
    }

    // 1. To do: Prints a single row of the board according to input value
    
    /*
    public void print_row(int row)
    {

    }
     */
    // 2. To do: Prints a specific column of the board according to input value
    /*
    public void print_colum()
    {

    }
     */

    // Prints all values in board
    public void print_board()
    {
        for (int i = 0; i< board.length; i++)
        {
            for (int j = 0; j < board.length; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }
    }

    /*
     * Sums all values in a given column of board, outputs the result
        public void sum_colum(int column)
        {
        }
     */


     /*
     * Sums all values in a given row of board, outputs the result
     */

     /*
     * Sums all values in a board, outputs the result
       public void sum_board()
       {}
     */
    


}
