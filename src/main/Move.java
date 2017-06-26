/**
 * This class describes a move on the game board.
 */
public class Move {
    int row;
    int column;
    int player;

    public Move(int row, int column, int player) {
        this.row = row;
        this.column = column;
        this.player = player;
    }
}
