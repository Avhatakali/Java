package laernProgramming;
//In class maxFinder, we define a void method named getMax that performs a calculation,
// and then prints the result to the console. We call the maxFinder from inside the main method
public class MaxFinder {
    public static void main(String[] args) {
        getMax(5, 7);
        getMax(12, 7);
    }

    public static void getMax(int n1, int n2) {
        int max;
        if (n1 > n2)
            max = n1;
        else
            max = n2;

        System.out.println("The bigger value is: " + max);
    }
}
