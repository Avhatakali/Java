/* This class must instantiate a Grid object and use its methods to let the player pick a game grid, 
update the game grid according to player input, print a feedback grid for the player, and check if
the player has sunk all the ships. See the Sample I/O in the assignment brief for details on what you 
you should print to the console */

import java.util.Scanner;


public class Battleship {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Pick your grid (1-4):");
        int seed = scn.nextInt();
        Grid g = new Grid(seed);

        System.out.println("The battle begins!");

        int Chance = 12;
        int shots = 0;

        WHILE:
        do {

            System.out.println("You have " + Chance + " shots remaining.");
            System.out.println("choose your square:");
            String[] squares = scn.next().split("");

            int row = Integer.parseInt(squares[0]);
            int col = Integer.parseInt(squares[1]);

            System.out.println(g.fire(row, col));
            g.printGrid();
            Chance--;
            shots++;

//            checking if the are ships available
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {

                    if (g.checkGrid(i, j)) {
                        continue WHILE;
                    }
                }
            }

            System.out.println("You won! and in only " + shots + " shots!");
            break WHILE;

        } while (Chance <= 12 && Chance != 0);

        if (Chance < 1) {
            System.out.println("You're out of ammunition! Game Over!");
        }
    }
}