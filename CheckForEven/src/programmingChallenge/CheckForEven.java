package programmingChallenge;

import java.util.Scanner;
import java.util.Arrays;


public class CheckForEven {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the limit:");
        int limit = scn.nextInt();

        if (limit % 2 != 0) {

            int first = 0;
            int middle = (limit - 1) / 2;
            int last = limit - 1;
            int printNull = 0;

            System.out.println("valid");

//            int[] stringArray = new int[limit];
            String[] stringArray = new String[limit];
            int[] intArray = new int[limit];


            for (int i = 1; i <= stringArray.length; i++) {
//                stringArray[i] = i++;
                stringArray[i - 1] = Integer.toString(i);

                if (first == 0) {
                    stringArray[0] = "first";
                }

                if (middle != (middle % 2)) {
                    stringArray[middle] = "mid";
                }

                if (last != (last % 2)) {
                    stringArray[last] = "last";
                }

            }
            System.out.println(Arrays.toString(stringArray));
            scn.close();


        } else if (limit % 2 == 0 || limit < 1) {

            System.out.println("invalid input");
        }
    }
}
