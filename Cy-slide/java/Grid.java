import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static sun.util.locale.LocaleUtils.isEmpty;

public class Grid {
    private int lengthSide;
    private Square[][] arrayGrid;

    public Grid(ReadLevelGridCSV valueArray){
        //Initialisation with level information in valueArray
        this.lengthSide = valueArray.getLengthSide();
        arrayGrid = new Square[lengthSide][lengthSide];
        for(int i=0;i<lengthSide;i++){
            for(int j=0;j<lengthSide;j++){
                arrayGrid[i][j] = new Square(valueArray.getTokenValue(i, j));
            }
        }
    }
    public int getLengthSide() {
        return lengthSide;
    }

    public void randomGrid(){
        for(int i=0;i<10*lengthSide;i++){
            int x1 = (int) (Math.random() * (lengthSide));
            int y1 = (int) (Math.random() * (lengthSide));
            int x2 = (int) (Math.random() * (lengthSide));
            int y2 = (int) (Math.random() * (lengthSide));

            int tmp = arrayGrid[x1][y1].token.getValue();
            //add case where -1
            arrayGrid[x1][y1].token.setValue(arrayGrid[x2][y2].token.getValue());
            arrayGrid[x2][y2].token.setValue(tmp);
        }
    }
    public void displayGrid(){
        for(int i=0;i<lengthSide;i++){
            for(int j=0;j<lengthSide;j++){
                System.out.print((arrayGrid[i][j]).token.getValue()+" ");
            }
            System.out.println();
        }

    }
}
