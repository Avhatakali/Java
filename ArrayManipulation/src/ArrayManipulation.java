import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) {

        ArrayManipulation Obj = new ArrayManipulation();
        Obj.manipulate();

    }

    public void manipulate() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter an odd integer greater than one:");
        int limit = scn.nextInt();

        if (limit % 2 == 0 || limit <= 1) {
            System.out.println("That input is not allowed.");
        } else if (limit % 2 != 0) {
            String[] stringArray = new String[limit];

            stringArray[0] = "start";
            stringArray[limit / 2] = "mid";
            stringArray[limit - 1] = "end";
            System.out.println(Arrays.toString(stringArray));
        }
    }
}
