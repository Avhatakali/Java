package method.learnProgramming;

public class myclass {
    //Lets look at how to invoke the Adder method:
//class to demonstrate how to define a method, and how to and invoke (call) a method
    public static void main(String[] args) {
        // invoke (call) method Adder, passing integers in as arguments
        Adder(6, 7);
        Adder(100, 6000);
        Adder(-60, 120);
    }

    // method definition, called Adder, takes two ints in its parameter list, stores in variables `a`, and `b`
    public static void Adder(int a, int b) {
        // uses the data passed to method to perform addition
        int c = a + b;
        //prints out result of addition.
        System.out.println(c);
    }
}
