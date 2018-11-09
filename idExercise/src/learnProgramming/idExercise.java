package learnProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class idExercise {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter id numbers : ");
        int num = scn.nextInt();

        String number = String.valueOf(num);

        for (int index = 0; index < number.length(); index++) {
            int j = Character.digit(number.charAt(index), 10);
            System.out.println("Identity " + j);
        }

        String str = Integer.toString(num);
        int[] digits = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            digits[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        System.out.println("digits : " + Arrays.toString(digits));
    }
}
