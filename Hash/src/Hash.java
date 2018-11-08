import java.util.Scanner;

public class Hash {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int number = scn.nextInt();

        String printValues = "#";
        for (int n = 0; n < number; n++) {
            System.out.print(printValues);
        }
        System.out.println();
    }
}
