import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static String fileLevel = "src/ReadLevelGridCSV.csv";
    public static void main(String[] args){
        int level = 1;
        ReadLevelGridCSV ArrayGridCSV = new ReadLevelGridCSV(fileLevel, level);
        Grid grid = new Grid(ArrayGridCSV);
        grid.displayGrid();
        grid.randomGrid();
        System.out.println("After shuffle");
        grid.displayGrid();

    }
}
