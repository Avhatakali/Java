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
        do {

            System.out.println("You have " + Chance + " shots remaining");
            System.out.println("choose your square:");

            //int player = scn.nextInt();
            String[] squares = scn.next().split("");

            int row = Integer.parseInt(squares[0]);
            int cal = Integer.parseInt(squares[1]);

            System.out.println(g.fire(row, cal));
            g.printGrid();

            Chance--;

        } while (Chance < 13 && Chance != 0);

    }
}