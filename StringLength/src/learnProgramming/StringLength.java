package learnProgramming;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word;
        System.out.println("Word : ");
        word = input.next();

        int length = word.length();
        System.out.println(word + " has " + length + " Alphabets");

    }
}
