import kotlin.reflect.jvm.internal.impl.util.Check;

/**
 * Created by Jun Hao on 5/2/2017.
 */
public class Rows extends CheckWin {

    public Rows(int x, int y, int Player, int[][] myArray){
        super(x, y, Player, myArray);

    }

    public static void Rows(int x, int y, int Player, int[][] myArray){
        int winCounter = 0;
        int i = x;
            for (int j = 0;j<myArray.length;j++){
                if (myArray[i][j] == Player){
                    winCounter++;
                    if (winCounter == myArray.length) System.out.println("Player" + Player + " won.");
                    continue;
                } else {
                    break;
                }

            }
        }


    public static void main(String[] args){

        int[][] myArray = new int[3][3];
        Rows(1,2,1,myArray);

    }

}
