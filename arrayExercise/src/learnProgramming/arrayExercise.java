package learnProgramming;


import java.util.Scanner;

public class arrayExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c, n,d,swap;

        String Var = null;

        System.out.print("how many number do yuh want to enter : ");
        n = input.nextInt();
        int Array [] = new int[n];

        System.out.print( "enter "+ n +" numbers : " );
        for(c = 0; c < n; c++)
            Array[c] = input.nextInt();

        for(c = 0; c < n; c++){
            System.out.println( Integer.toString(c) + " number which was entered is : " + Array[c]);
        }
    }
}
