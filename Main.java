public class Main {
    public static void main(String[] args) {

        // Activity 2 = Board.java
        Board board = new Board(3, 3);
        board.set_value(0, 0, 4);
        board.set_value(0, 1, 7);
        board.set_value(2, 2, 9);
        board.print_board();
        
        // Should correctly print colum
        // board.print_row(1);

        // Should correctly print column
        // board.print_colum(2);

        // board.sum_column(1);
        // sums total of target column

        // board.sum_row(2);
        // sums target row of board and outputs result
    
        // board.sum_board();
        // sums board and outputs result


        // Activity 3 = Matrix.java
        Matrix matrix = new Matrix();
        
        //To complete
        matrix.sum_matrixes(matrix.matrix_1, matrix.matrix_2);

        //To complete
        matrix.print_matrix(matrix.sum_matrixes(matrix.matrix_1, matrix.matrix_2));


    }
}