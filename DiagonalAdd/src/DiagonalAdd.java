import java.util.Arrays;
import java.util.Scanner;

public class DiagonalAdd {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int ArrLength;
        int Element = 0;

        System.out.println("Enter the side length:");
        ArrLength = scn.nextInt();

        int[][] Array = new int[ArrLength][ArrLength];

        for (int a = 0; a < Array.length; a++) {
            for (int b = 0; b < Array[a].length; b++) {
                Array[a][b] = Element;
                Element++;
            }
        }

        int DiagonalSum = 0;

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {

                // Diagonal sum
                if (i == j) {
                    DiagonalSum = DiagonalSum + Array[i][j];
                }
            }
        }
        System.out.println("The array created is:\n" + Arrays.deepToString(Array));
        System.out.println("The sum of the diagonal is:\n" + DiagonalSum);
    }
}
