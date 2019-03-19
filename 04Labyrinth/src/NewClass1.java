
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

        String delim = "[  ]+";
        int row, clms;

        int[][] mons;
        BufferedReader in = new BufferedReader(new FileReader("labyrinthData.txt"));

        strin = in.readLine();
        while (strin != null) {
            list = strin.split(delim);
            row = Integer.parseInt(list[0]);
            clms = Integer.parseInt(list[1]);

            strin = in.readLine();
            String monsterNum = strin;

            mons = new int[Integer.parseInt(monsterNum)][2];

            for (int i = 0; i < mons.length; i++) {
                strin = in.readLine();
                list = strin.split(delim);
                mons[i][0] = Integer.parseInt(list[0]);
                mons[i][1] = Integer.parseInt(list[1]);
            }

            int[][] laby = new int[row][clms];

            for (int i = 0; i < mons.length; i++) {
                int r = mons[i][0] - 1;
                int c = mons[i][1] - 1;
                laby[r][c] = -1;
            }
            String maze = "";

            for (int i = 0; i < laby.length; i++) {
                for (int j = 0; j < laby[0].length; j++) {
                    if (laby[i][j] == -1) {
                        maze += "m ";
                    } else if (i == 0 && j == 0) {
                        maze += "s ";
                    } else if (i == laby.length - 1 && j == laby[0].length - 1) {
                        maze += "e ";
                    } else {
                        maze += "o ";
                    }
                }
                maze += "\n";
            }
            
            Pathfinder p = new Pathfinder(row, clms);
            
            System.out.println(p.paths(laby) + " ways of solving the following maze:");
            System.out.println(maze);
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            strin = in.readLine();
        }

    }
}
