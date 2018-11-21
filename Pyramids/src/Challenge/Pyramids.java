package Challenge;

public class Pyramids {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("Half pyramids of *");
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Half pyramids of *");
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        System.out.println("Program to print half pyramid using alphabets");
        char last = 'E', alphabet = 'A';
        for (int i = 1; i <= (last-'A'+1); ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(alphabet + " ");
            }
            ++alphabet;
            System.out.println();
        }
    }
}
