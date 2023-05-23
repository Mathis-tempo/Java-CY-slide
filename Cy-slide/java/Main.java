import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static String fileLevelGrid = "src/ReadLevelGridCSV.csv";
    private static String fileLevel = "src/ReadLevelCSV.csv";

    public static void main(String[] args){
        int level = 1;
        ReadLevelGridCSV ArrayGridCSV = new ReadLevelGridCSV(fileLevelGrid, level);
        Grid grid = new Grid(ArrayGridCSV);
        grid.displayGrid();
        grid.randomGrid();
        //System.out.println("After shuffle");
        //grid.displayGrid();
        System.out.println("After switch");
        grid.move(0,0,2,2);
        grid.displayGrid();
    }
}
