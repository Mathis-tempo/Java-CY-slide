import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLevelGridCSV {
    private int[][] arrayTokenValue;
    private int lengthSide;

    public ReadLevelGridCSV(String file, int level){

        String line;
        String delimiter = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                int i = 0;

                for(int c=1;c<=level;c++) {
                    line = br.readLine();
                    if(c == level) {

                        String[] row = line.split(delimiter);

                        // Read each row of csv
                        int j = 0;
                        boolean flag = false;
                        for (String data : row) {
                            if (flag != false) {
                                //  System.out.print(data + " ");
                                arrayTokenValue[i][j] = Integer.parseInt(data);
                                //System.out.println(Integer.parseInt(data));
                                if (j==lengthSide-1){
                                    j = 0;
                                    i++;
                                }else {
                                    j++;
                                }

                            } else {
                                flag = true;
                                lengthSide = Integer.parseInt(data);
                                arrayTokenValue = new int[lengthSide][lengthSide];
                            }
                        }

                    }
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int getLengthSide(){
        return this.lengthSide;
    }
    public int getTokenValue(int x, int y){
        return this.arrayTokenValue[x][y];
    }
}