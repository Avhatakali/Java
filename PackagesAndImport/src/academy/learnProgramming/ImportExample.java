package academy.learnProgramming;
// they will merge code on exams, so rewrite the code to be sure it runs

import java.util.Random;   // package in java

public class ImportExample {
    public static void main(String[] args) {
        Random random = new Random();

        for (int num = 1; num < 10; num++) { // total number of number combination in lotto is 15_890_700
            System.out.println(" ");
            for (int i = 1; i < 7 && i > 0; i++) {
                System.out.print(" " + random.nextInt(50)); // Random integer
            }
        }
    }
}
