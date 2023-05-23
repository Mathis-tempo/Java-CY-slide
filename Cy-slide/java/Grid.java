import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static sun.util.locale.LocaleUtils.isEmpty;

public class Grid {
    private int lengthSide;
    private Token[][] arrayGrid;

    public Grid(ReadLevelGridCSV valueArray){
        //Initialisation with level information in valueArray
        this.lengthSide = valueArray.getLengthSide();
        arrayGrid = new Token[lengthSide][lengthSide];
        for(int i=0;i<lengthSide;i++){
            for(int j=0;j<lengthSide;j++){
                arrayGrid[i][j] = new Token(valueArray.getTokenValue(i, j));
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

            int tmp = arrayGrid[x1][y1].getValue();
            //add case where -1
            arrayGrid[x1][y1].setValue(arrayGrid[x2][y2].getValue());
            arrayGrid[x2][y2].setValue(tmp);
        }
    }
    public void switchTokenValue(int x1, int y1, int x2, int y2){
        int tmp = arrayGrid[x1][y1].getValue();
        arrayGrid[x1][y1].setValue(arrayGrid[x2][y2].getValue());
        arrayGrid[x2][y2].setValue(tmp);
    }
    public void displayGrid(){
        for(int i=0;i<lengthSide;i++){
            for(int j=0;j<lengthSide;j++){
                System.out.print((arrayGrid[i][j]).getValue()+" ");
            }
            System.out.println();
        }
    }
    public void move(int x1, int y1, int x2, int y2){
        //Verify if x1, y1, x2, y2 valid
        if (arrayGrid[x1][y1].getValue() > 0){
            if ((arrayGrid[x2][y2].getValue() == 0) &&
                    ((x1 == x2) && ((y1-y2 == -1) || (y1-y2 == 1))) ||
                    ((y1 == y2) && ((x1-x2==-1) || (x1-x2==1)))){
                switchTokenValue(x1, y1, x2, y2);
            }
        }
    }
}
