package learningChallenge;

public class Pyramids {

    public static void main(String[] args) {

        System.out.println("Half pyramid using * !");
        int rows = 5;
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Half pyramid upside down using * !");
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Half pyramid using numbers !");
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("Half pyramid of Alphabets !");
        char alphabet = 'A', last = 'E';
        for (int i = 1; i <= (last - 'A' + 1); ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(alphabet + " ");
            }
            ++alphabet;

            System.out.println();
        }

        System.out.println();
        System.out.println("Full pyramid of * !");
        int k = 0;
        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int j = 1; j <= rows - i; ++j) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }
}
