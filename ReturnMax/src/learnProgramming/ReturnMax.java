package learnProgramming;

public class ReturnMax {
    //Lets look at how to invoke the method that have a return value:
//class to demonstrate how to define a method, and how to and invoke (call) a method

    public static void main(String[] args) {
        // invoke (call) method ReturnMax, passing integers in as arguments
        int myMax = returnMax(9, 14);
    }

    public static int returnMax(int n1, int n2) {
        int max;
        if (n1 > n2) {
            max = n1;
//            System.out.println(max);
        } else {
            max = n2;

            System.out.println(n1 + " and " + n2 + " Maximum value = " + max);
        }
        return max;
    }
}
