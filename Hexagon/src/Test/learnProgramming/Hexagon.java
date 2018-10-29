package Test.learnProgramming;

import java.util.Scanner;

public class Hexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the hexagon's side length");
        double S = input.nextDouble();

        double LengthSquared = Math.pow(S, 2);
        double denominator = 2;
        double numerator;

        numerator = 3 * Math.sqrt(3);
        double Divider = numerator / denominator;

        double Area = Divider * LengthSquared;

        System.out.println(Area);
    }
}
