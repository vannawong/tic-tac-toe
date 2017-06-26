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
    public void givenPlayerOneWins_thenGameEndsAndPlayerOneScoreIncreased() {
        int [][] board = new int[3][3];
        board[0][0] = 1;
        board[0][1] = 1;

        // board should now look like this:
        // 1 1 1
        // 0 0 0
        // 0 0 0
        // so 0 will denote an empty spot
        // therefore, if we check row on this board, we should detect a winning condition
        underTest.setBoard(board);

        assertTrue("checkRows should return true", underTest.checkRows(new Move(0, 2, 1)));
        assertEquals("player one score should increase", 1, underTest.getPlayerOneScore());
    }

    @Test
    public void givenPlayerMove_andGameNotEnd_thenNeitherPlayersScoreIncreases() {

    }

    // sets the given row of the given board to the player
    private void setRow(int[][] board, int rowNum, int player){
        for (int i = 0; i < board.length; i ++) {
            board[rowNum][i] = player;
        }
    }
}
