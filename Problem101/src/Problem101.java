import java.util.Scanner;

public class Problem101 {

    Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        // TODO code application logic here

        Problem101 obj = new Problem101();
        obj.print_sums();
    }


    public void print_sums() {

        System.out.print("starting integer : ");
        int firstValue = input.nextInt();
        System.out.print("last integer : ");
        int lastValue = input.nextInt();

        int sum = 0;

        for (int i = firstValue; i <= lastValue; i++) {
            for (int j = firstValue; j <= i; j++) {
                sum = sum + j;
            }
        }
        System.out.print(" " + sum);
    }
}
