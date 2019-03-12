
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gill-p64
 */
public class NewClass1 {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        String strin;
        String list[] = null;
        String delim = "[ ;]+";

        BufferedReader fin = new BufferedReader(new FileReader("labyrinthData.txt"));

        strin = fin.readLine();

        while (strin != null) {

            int x = 0;
            int y = 0;

            list = strin.split(delim);

            x = Integer.parseInt(list[0]);
            y = Integer.parseInt(list[1]);

            int[][] data = new int[x][y];
            System.out.println("MAZE: ");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print(data[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");

            strin = fin.readLine();

            String monsterNum = strin;

            System.out.println("# of Monster: " + monsterNum);

            strin = fin.readLine();
//
//            int xMon = 0;
//            int yMon = 0;
//
//            list = strin.split(delim);
//
//            xMon = Integer.parseInt(list[0]);
//            yMon = Integer.parseInt(list[1]);
//
//            data[xMon][yMon] = 1;
//            System.out.println("MAZE: ");
//            
//            while (strin != null) {
//                for (int i = 0; i < x; i++) {
//                    for (int j = 0; j < y; j++) {
//                        System.out.print(data[i][j] + " ");
//                    }
//                    System.out.println("");
//                }
//                System.out.println("");
//
//                strin = fin.readLine();
//            }

//            int xMon = 0;
//            int yMon = 0;
//
//            list = strin.split(delim);
//
//            xMon = Integer.parseInt(list[0]);
//            yMon = Integer.parseInt(list[1]);
//
            //int[][] dataMon = new int[xMon][yMon];
//
//            for (int i = 0; i < xMon; i++) {
//                for (int j = 0; j < yMon; j++) {
//                    System.out.print(dataMon[i][j] + " ");
//                }
//                System.out.println("");
//            }
//            System.out.println("");
        }
    }
}
