package learnProgramming;

public class CompoundAssignmentOperators {

    public static void main(String[] args) {
        int x = 2;
        int z = 3;

        x = x * z; // simple assignment
        x *= z; // the shorter form of  x = x * z

        // x = 2 * 3 -> x = 6
        // x -> 6 * 3 -> x = 18

        System.out.println("x = " + x );

        // without explixit cast
        long  a = 10;
        int b = 4;
        // b = b * a;  // does n't compile
        // b = (int)(b * a);

        b *= a; //short form of b = (int)(b * a);
        System.out.println("b = " + b);

        //exams Question
        long c = 4;
        long d = (c = 2); // shorter form of c = 2; then d = c;
        System.out.println("c = " + c + " d = " + d);

        long e = 3;
        long f = 2; // they might initialize it to confuse, f does n't need to be initialize
        long h = 1;

        long i = e + 3 * (f = 3) - (h -= 2);
        // f = 3;
        // e + 3 * 3 - (-1) -> h = 1 - 2 -> -1
        // e + 3 * 3 + 1
        // 3 + 9 + 1
        // 13

        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("h = " + h);
        System.out.println("i = " + i);

    }
}
