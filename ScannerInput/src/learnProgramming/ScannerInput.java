package learnProgramming;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//instantiate a Scanner object

        String inString;
        int inInt;
        System.out.println("Type a string ");  // prompt the user to type a string
        inString = in.next();// get string from console
        System.out.println("Type an integer "); //prompt the user to type an integer
        inInt = in.nextInt();// get integer from console

        System.out.println("String = " + inString + ", Integer " + inInt);
    }
}
