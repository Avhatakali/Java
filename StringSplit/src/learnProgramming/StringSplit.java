package learnProgramming;

import java.util.Scanner;

public class StringSplit {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = scn.nextLine() ;
        String [] temp;

        String delimiter = " ";
        temp = str.split(delimiter);
        int length = str.length();
        System.out.println(str + " has " + length + " Alphabets");
        
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
