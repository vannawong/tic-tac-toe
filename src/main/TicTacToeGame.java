public class TicTacToeGame {
    private int[][] board;

    public int getPlayerOneScore() {
        return playerOneScore;
    }

    private int playerOneScore = 0;
    private int playerTwoScore = 0;

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

        for (int j = 0; j < board.length; j++) {
            if (board[move.row][j] == move.player) {
                winCounter++;
                if (winCounter == board.length) {
                    System.out.println("Player" + move.player + " won.");
                    return true;
                }
                continue;
            } else {
                break;
            }

        }

        return false;
    }

    /**
     * A method to check the columns of the board for a winning game condition.  Returns true if the move was a winning move, false otherwise.
     * @param move The move made in the current turn
     */
    public boolean checkColumns(Move move) {
        int winCounter = 0;

        //check column
        for (int j = 0; j < board.length; j++) {
            if (board[j][move.column] == move.player) {
                winCounter++;
                if (winCounter == board.length) {
                    System.out.println("Player" + move.player + " won.");
                    return true;
                }
                continue;
            } else {
                break;
            }
        }

        return false;
    }

    /**
     * A method to check the diagonals of the board for a winning game condition.  Returns true if the move was a winning move, false otherwise.
     * @param move The move made in the current turn
     */
    public boolean checkDiagonals(Move move) {
        int winCounter = 0;

        //check diagonal from top left
        if (move.row == move.column) {
            for(int k = 0; k < board.length; k++){
                if(board[k][k] == move.player){
                    winCounter++;
                    if (winCounter == board.length) {
                        System.out.println("Player" + move.player + " won.");
                        return true;
                    }
                    continue;
                } else {
                    break;
                }
            }

        }

        //check diagonal from bottom left
        if (move.row + move.column == board.length - 1) {
            for(int l = 0; l < board.length;l++){
                if(board[l][board.length-l-1] == move.player){
                    winCounter++;
                    if (winCounter == board.length) {
                        System.out.println("Player" + move.player + " won.");
                        return true;
                    }
                    continue;
                }  else {
                    break;
                }
            }

        }
        return false;
    }

    /**
     * This method will be called every time a move is made, to determine if the game should be over.  Returns true if someone has won, false otherwise.
     */
    public boolean checkWin(Move move) {
        return checkRows(move) || checkColumns(move) || checkDiagonals(move);
    }
}
