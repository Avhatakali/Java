import java.util.Scanner;

public class Seven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive number:");
        int number = input.nextInt();

        int divider = number / 7;
        int printValue = 0;

        for (int n = 0; n < divider; n++){
            printValue = printValue + 7;
            System.out.println("Lucky " + printValue +"!");
        }
    }
}
