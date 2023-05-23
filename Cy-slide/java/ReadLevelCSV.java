import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLevelCSV {
    private int[] arrayLevel;
    private int numberOfLevels;

    public ReadLevelCSV(String file){
        String line;
        String delimiter = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                line = br.readLine();
                numberOfLevels = Integer.parseInt(line);
                arrayLevel = new int[numberOfLevels];

                for(int i=0;i<numberOfLevels;i++){
                    line = br.readLine();
                    //String[] row = line.split(delimiter);
                    arrayLevel[i] = Integer.parseInt(line);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int getLevelCompletion(int i){
        return this.arrayLevel[i];
    }
    public int getNumberOfLevels(){
        return this.numberOfLevels;
    }
    public void displayCSV(){
        for(int i=0;i<numberOfLevels;i++){
                System.out.print((arrayLevel[i])+" ");
            System.out.println();
        }
    }
}