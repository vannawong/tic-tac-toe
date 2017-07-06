import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TicTacToeGameTest {
    private TicTacToeGame underTest;

    @Before
    public void setup() {
        underTest = new TicTacToeGame();
    }

    // we will use 1 and 2 to denote players
    // because java int array default initialization is all 0s

    /**
     * This test will check that, given a winning move, checkRows will return true.
     */
    @Test
    public void checkColumnsTest1() {
        int [][] board = new int[3][3];
        board[0][0] = 1;
        board[1][0] = 1;
        board[2][0] = 1;
        // board should now look like this:
        // 1 0 0
        // 1 0 0
        // 1 0 0
        // so 0 will denote an empty spot
        // therefore, if we check row on this board, we should detect a winning condition
        underTest.setBoard(board);

        assertTrue("checkColumn should return true", underTest.checkColumns(new Move(2, 0, 1)));
    }

    @Test
    public void checkColumnsTest2() {
        int [][] board = new int[3][3];
        board[0][1] = 1;
        board[1][1] = 1;
        board[2][1] = 1;
        // board should now look like this:
        // 0 1 0
        // 0 1 0
        // 0 1 0
        // so 0 will denote an empty spot
        // therefore, if we check row on this board, we should detect a winning condition
        underTest.setBoard(board);

        assertTrue("checkColumn should return true", underTest.checkColumns(new Move(2, 1, 1)));
    }

    @Test
    public void checkColumnsTest5x5() {
        int [][] board = new int[5][5];
        board[0][0] = 1;
        board[1][0] = 1;
        board[2][0] = 1;
        board[3][0] = 1;
        board[4][0] = 1;
        // board should now look like this:
        // 1 0 0 0 0
        // 1 0 0 0 0
        // 1 0 0 0 0
        // 1 0 0 0 0
        // 1 0 0 0 0
        // so 0 will denote an empty spot
        // therefore, if we check row on this board, we should detect a winning condition
        underTest.setBoard(board);

        assertTrue("checkRows should return true", underTest.checkColumns(new Move(4, 0, 1)));
    }

    @Test
    public void checkRowsTest1() {
        int [][] board = new int[3][3];
        board[1][0] = 1;
        board[1][1] = 1;
        board[1][2] = 1;
        // board should now look like this:
        // 0 0 0
        // 1 1 1
        // 0 0 0
        // so 0 will denote an empty spot
        // therefore, if we check row on this board, we should detect a winning condition
        underTest.setBoard(board);

        assertTrue("checkRows should return true", underTest.checkRows(new Move(1, 1, 1)));
    }

    @Test
    public void checkRowsTest2() {
        int [][] board = new int[3][3];
        board[0][0] = 1;
        board[0][1] = 1;
        board[0][2] = 1;
        // board should now look like this:
        // 1 1 1
        // 0 0 0
        // 0 0 0
        // so 0 will denote an empty spot
        // therefore, if we check row on this board, we should detect a winning condition
        underTest.setBoard(board);

        assertTrue("checkRows should return true", underTest.checkRows(new Move(0, 2, 1)));
    }

    @Test
    public void checkRowsTest5x5() {
        int [][] board = new int[5][5];
        board[0][0] = 1;
        board[0][1] = 1;
        board[0][2] = 1;
        board[0][3] = 1;
        board[0][4] = 1;
        // board should now look like this:
        // 1 1 1 1 1
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0
        // so 0 will denote an empty spot
        // therefore, if we check row on this board, we should detect a winning condition
        underTest.setBoard(board);

        assertTrue("checkRows should return true", underTest.checkRows(new Move(0, 4, 1)));
    }

    //This test looks for diagonal goes from top left to bottom right
    @Test
    public void checkTopLeftDiagonalTest() {
        int [][] board = new int[3][3];
        board[0][0] = 1;
        board[1][1] = 1;
        board[2][2] = 1;
        // board should now look like this:
        // 1 0 0
        // 0 1 0
        // 0 0 1
        // so 0 will denote an empty spot
        // therefore, if we check row on this board, we should detect a winning condition
        underTest.setBoard(board);

        assertTrue("checkDiagonal should return true", underTest.checkDiagonals(new Move(2, 2, 1)));
    }


    //This test looks for diagonal from bottom left to top right
    @Test

    public void checkBottomLeftDiagonalTest() {
        int [][] board = new int[3][3];
        board[0][2] = 1;
        board[1][1] = 1;
        board[2][0] = 1;
        // board should now look like this:
        // 0 0 1
        // 0 1 0
        // 1 0 0
        // so 0 will denote an empty spot
        // therefore, if we check row on this board, we should detect a winning condition
        underTest.setBoard(board);

        assertTrue("checkDiagonal should return true", underTest.checkDiagonals(new Move(2, 0, 1)));
    }


    @Test
    public void checkTopLeftDiagonalTest5x5() {
        int [][] board = new int[5][5];
        board[0][0] = 1;
        board[1][1] = 1;
        board[2][2] = 1;
        board[3][3] = 1;
        board[4][4] = 1;
        // board should now look like this:
        // 1 0 0 0 0
        // 0 1 0 0 0
        // 0 0 1 0 0
        // 0 0 0 1 0
        // 0 0 0 0 1
        // so 0 will denote an empty spot
        // therefore, if we check row on this board, we should detect a winning condition
        underTest.setBoard(board);

        assertTrue("checkDiagonal should return true", underTest.checkDiagonals(new Move(4, 4, 1)));
    }

    @Test
    public void givenPlayerMove_andGameNotEnd_thenNeitherPlayersScoreIncreases() {
        int [][] board = new int[3][3];
        board[0][0] = 1;
        board[1][0] = 1;
        underTest.setBoard(board);
        underTest.checkColumns(new Move(1,0,1));
        assertEquals("player one score should stay", 0, underTest.getPlayerOneScore());

    }

    @Test
    public void givenPlayerMove_andGameEnd_thenPlayersScoreIncreases() {
        int [][] board = new int[3][3];
        board[0][0] = 1;
        board[1][0] = 1;
        board[2][0] = 1;
        underTest.setBoard(board);
        underTest.checkColumns(new Move(2,0,1));
        assertEquals("player one score should increase", 1, underTest.getPlayerOneScore());
    }

    // sets the given row of the given board to the player
    private void setRow(int[][] board, int rowNum, int player){
        for (int i = 0; i < board.length; i ++) {
            board[rowNum][i] = player;
        }
    }
}
