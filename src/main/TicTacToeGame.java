public class TicTacToeGame {
    private int[][] board;

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    // default game size of 3
    public TicTacToeGame() {
        this(3);
    }

    public TicTacToeGame(int boardSize) {
        this.board = new int[boardSize][boardSize];
    }

    /**
     * A method to check the rows of the board for a winning game condition.  Returns true if the move was a winning move, false otherwise.
     *
     * @param move The move made in the current turn
     */
    public boolean checkRows(Move move) {
        int winCounter = 0;
        int i = move.row;
        for (int j = 0; j < board.length; j++) {
            if (board[i][j] == move.player) {
                winCounter++;
                if (winCounter == board.length) System.out.println("Player" + move.player + " won.");
                continue;
            } else {
                break;
            }

        }
        return true;
    }

    /**
     * A method to check the columns of the board for a winning game condition.  Returns true if the move was a winning move, false otherwise.
     * @param move The move made in the current turn
     */
    public boolean checkColumns(Move move) {
        // implement this method
        return true;
    }

    /**
     * A method to check the diagonals of the board for a winning game condition.  Returns true if the move was a winning move, false otherwise.
     * @param move The move made in the current turn
     */
    public boolean checkDiagonals(Move move) {
        return true;
    }

    /**
     * This method will be called every time a move is made, to determine if the game should be over.  Returns true if someone has won, false otherwise.
     */
    public boolean checkWin(Move move) {
        return checkRows(move) || checkColumns(move) || checkDiagonals(move);
    }
}
