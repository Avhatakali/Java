import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner weapon = new Scanner(System.in);

        int count = 0;
        int playOneScore = 0;
        int playTwoScore = 0;
        int totalPlayerOneScore = playOneScore + count;
        int totalPlayerTwoScore = playTwoScore + count;

        int playerOneWeapon, playerTwoWeapon;

        boolean exit = true;

        do {

            System.out.println("Player One: Choose your weapon!");
            playerOneWeapon = weapon.nextInt();
            if (playerOneWeapon >= 4) {
                if (totalPlayerOneScore > totalPlayerTwoScore) {
                    System.out.println("The winner is Player One with " + totalPlayerOneScore + " points.");
                } else if (totalPlayerTwoScore > totalPlayerOneScore) {
                    System.out.println("The winner is Player Two with " + totalPlayerTwoScore + " points.");
                } else if (totalPlayerTwoScore == totalPlayerOneScore) {
                    System.out.println("Player One and Player Two are tied with " + totalPlayerTwoScore + " points.");
                }

                System.out.println("Quitting");
                break;
            }
            System.out.println("Good choice!");

            System.out.println("Player Two: Choose your weapon!");
            playerTwoWeapon = weapon.nextInt();
            if (playerTwoWeapon >= 4) {
                if (totalPlayerOneScore > totalPlayerTwoScore) {
                    System.out.println("The winner is Player One with " + totalPlayerOneScore + " points.");
                } else if (totalPlayerOneScore < totalPlayerTwoScore) {
                    System.out.println("The winner is Player Two with " + totalPlayerTwoScore + " points.");
                } else if (totalPlayerTwoScore == totalPlayerOneScore) {
                    System.out.println("Player One and Player Two are tied with " + totalPlayerTwoScore + " points.");
                }
                System.out.println("Quitting");
                break;
            }
            System.out.println("Good choice!");

//        Input Meaning
//        1     rock
//        2     paper
//        3     scissors
//        4     quit

            // weapon choice
            String weaponPlayer1 = "";
            String weaponPlayer2 = "";
//player One Weapon
            if (playerOneWeapon == 1) {
                weaponPlayer1 = "rock";
                exit = true;
            } else if (playerOneWeapon == 2) {
                weaponPlayer1 = "paper";
                exit = true;
            } else if (playerOneWeapon == 3) {
                weaponPlayer1 = "scissors";
                exit = true;
            }


// player Two Weapon
            if (playerTwoWeapon == 1) {
                weaponPlayer2 = "rock";
                exit = true;
            } else if (playerTwoWeapon == 2) {
                weaponPlayer2 = "paper";
                exit = true;
            } else if (playerTwoWeapon == 3) {
                weaponPlayer2 = "scissors";
                exit = true;
            }

//draw
            if ((playerOneWeapon == 1) && (playerTwoWeapon == 1)) {
                System.out.println("Player One chose: " + weaponPlayer1);
                System.out.println("Player Two chose: " + weaponPlayer2);

                System.out.println("It's a draw!");
                System.out.println("The score is now: " + totalPlayerOneScore + " - " + totalPlayerTwoScore);

            } else if (playerOneWeapon == 2 && playerTwoWeapon == 2) {
                System.out.println("Player One chose: " + weaponPlayer1);
                System.out.println("Player Two chose: " + weaponPlayer2);

                System.out.println("It's a draw!");
                System.out.println("The score is now: " + totalPlayerOneScore + " - " + totalPlayerTwoScore);

            } else if ((playerOneWeapon == 3 && playerTwoWeapon == 3)) {
                System.out.println("Player One chose: " + weaponPlayer1);
                System.out.println("Player Two chose: " + weaponPlayer2);

                System.out.println("It's a draw!");
                System.out.println("The score is now: " + totalPlayerOneScore + " - " + totalPlayerTwoScore);

//paper wins -> rock vs paper
            } else if ((playerOneWeapon == 1) && (playerTwoWeapon == 2)) {
                totalPlayerTwoScore++;
                System.out.println("Player One chose: " + weaponPlayer1);
                System.out.println("Player Two chose: " + weaponPlayer2);

                System.out.println("Player Two Wins!");
                System.out.println("The score is now: " + totalPlayerOneScore + " - " + totalPlayerTwoScore);

            } else if (playerOneWeapon == 2 && playerTwoWeapon == 1) {
                totalPlayerOneScore++;
                System.out.println("Player One chose: " + weaponPlayer1);
                System.out.println("Player Two chose: " + weaponPlayer2);

                System.out.println("Player One Wins!");
                System.out.println("The score is now: " + totalPlayerOneScore + " - " + totalPlayerTwoScore);

//rock wins -> rock vs scissors
            } else if ((playerOneWeapon == 1 && playerTwoWeapon == 3)) {
                totalPlayerOneScore++;
                System.out.println("Player One chose: " + weaponPlayer1);
                System.out.println("Player Two chose: " + weaponPlayer2);

                System.out.println("Player One Wins!");
                System.out.println("The score is now: " + totalPlayerOneScore + " - " + totalPlayerTwoScore );

            } else if ((playerOneWeapon == 3 && playerTwoWeapon == 1)) {
                totalPlayerTwoScore++;
                System.out.println("Player One chose: " + weaponPlayer1);
                System.out.println("Player Two chose: " + weaponPlayer2);

                System.out.println("Player Two Wins!");
                System.out.println("The score is now: " + totalPlayerOneScore + " - " + totalPlayerTwoScore );
            }

// Scissors wins -> scissors vs paper
            else if ((playerOneWeapon == 2 && playerTwoWeapon == 3)) {
                totalPlayerTwoScore++;
                System.out.println("Player One chose: " + weaponPlayer1);
                System.out.println("Player Two chose: " + weaponPlayer2);

                System.out.println("Player Two Wins!");
                System.out.println("The score is now: " + totalPlayerOneScore + " - " + totalPlayerTwoScore);

            } else if ((playerOneWeapon == 3 && playerTwoWeapon == 2)) {
                totalPlayerOneScore++;
                System.out.println("Player One chose: " + weaponPlayer1);
                System.out.println("Player Two chose: " + weaponPlayer2);

                System.out.println("Player One Wins!");
                System.out.println("The score is now: " + totalPlayerOneScore + " - " + totalPlayerTwoScore);
            }

        } while (exit == true);
    }
}
