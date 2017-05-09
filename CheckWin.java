
import java.util.Arrays;
/**
 * Created by Jun Hao on 5/2/2017.
 */
public class CheckWin {

    int horizontal;
    int vertical;
    int player;

    public CheckWin(int x, int y, int Player, int[][] myArray) {
        this.horizontal = x;
        this.vertical = y;
        this.player = player;
    }


    public static void CheckWin(int x, int y, int Player, int[][] myArray) {
        int winCounter = 0;

        //check row
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[x][i] == Player) {
                winCounter++;
                if (winCounter == myArray.length) System.out.println("Player" + Player + " won.");
                continue;
            } else {
                break;
            }
        }

        //check column
        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j][y] == Player) {
                winCounter++;
                if (winCounter == myArray.length) System.out.println("Player" + Player + " won.");
                continue;
            } else {
                break;
            }
        }

        //check diagonal from top left

        if(x == y){
            for(int k = 0;k<myArray.length;k++){
                if(myArray[k][k] == Player){
                    winCounter++;
                    if (winCounter == myArray.length) System.out.println("Player" + Player + " won.");
                    continue;
                } else {
                    break;
                }
            }

        }

        //check diagonal from bottom left

        if(x + y == myArray.length-1){
            for(int l = 0;l<myArray.length;l++){
                if(myArray[l][myArray.length-l-1] == Player){
                    winCounter++;
                    if (winCounter == myArray.length) System.out.println("Player" + Player + " won.");
                    continue;
                }  else {
                break;
                }
            }

        }
    }
}





