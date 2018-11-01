package learnProgramming;

/*
 * 2-D Arrays
 * initialize variables and scanner
 * scan an integer
 * create a 2-D array matching scanned integer
 * populate the array
 *
 * sum of array;
 * diagonal sum
 * */

import java.util.Scanner;

public class TwoDimensionArrays {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int ArrLength;

        System.out.println("Enter array size : ");
        ArrLength = scn.nextInt();

        int[][] Array = new int[ArrLength][ArrLength];

        System.out.println("Enter Values into Array");
        for (int a = 0; a < Array.length; a++) {
            for (int b = 0; b < Array[a].length; b++) {
                Array[a][b] = scn.nextInt();
            }
        }


        int sum = 0;
        int DiagonalSum = 0;

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.println("Number [" + i + "][" + j + "]= " + Array[i][j]);
                sum = sum + Array[i][j];

                // Diagonal sum
                if (i == j) {
                    DiagonalSum = DiagonalSum + Array[i][j];
                }
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("Diagonal sum = " + DiagonalSum);
    }
}
