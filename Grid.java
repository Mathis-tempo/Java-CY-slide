public class Grid {
    private int lengthSide;
    private Square[][] arrayGrid;

    public Grid(int lengthSide){
        this.lengthSide = lengthSide;
        arrayGrid = new Square[lengthSide][lengthSide];
        for(int i=0;i<lengthSide;i++){
            for(int j=0;j<lengthSide;j++){
                arrayGrid[i][j] = new Square(i, j, true, false);
            }
        }
    }

    public int getLengthSide() {
        return lengthSide;
    }
}
