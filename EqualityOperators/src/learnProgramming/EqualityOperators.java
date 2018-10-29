package learnProgramming;

public class EqualityOperators {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        boolean c = a == b;
        boolean d = a != b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

//        boolean g = true == 0; // doesn't compile
//        boolean h = false != "test"; // doesn't compile

        // yuh cannot compare a number and a boolean, but yuh can compare different primitives

    }
}
