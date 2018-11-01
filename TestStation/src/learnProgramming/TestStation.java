package learnProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestStation {

    public static void main(String[] args) {

        int Scores[][] = new int[3][3];

        Scores[0][0] = 1;
        Scores[0][1] = 2;
        Scores[1][0] = 3;
        Scores[2][2] = 4;

        for (int i = 0; i < Scores.length; i++) {
            for (int j = 0; j < Scores[i].length; j++) {
                System.out.println("Number [" + i + "][" + j + "]= " + Scores[i][j]);
            }
        }
    }
}
