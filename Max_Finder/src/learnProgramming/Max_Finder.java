package learnProgramming;
// In class maxFinder, we define an int method named getMax that performs a calculation, and then returns the result to the main method.
// We call the maxFinder from inside the main method, and store its returned value inside a variable.
public class Max_Finder {
    public static void main(String[] args) {
        int max1 = getMax(5, 7);
        int max2 = getMax(12, 7);

        // Invokes getMax(), which returns an `int`, and stores it in
        int trueMax = getMax(max1,max2);
        System.out.println("The bigger value is = " + trueMax);
    }

    public static int getMax(int n1, int n2) {
        int max;
        if (n1 > n2)
            max = n1;
        else
            max = n2;

        return max;
    }
}
