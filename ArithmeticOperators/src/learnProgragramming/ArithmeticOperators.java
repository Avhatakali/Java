package learnProgragramming;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int Result = 3 - 2 + 2 * 2  + 3;
        // 3 - 2 + 4 + 3
        // 1 + 4 + 3
        // 5 + 3
        // 8
        System.out.println("Result = " + Result);

        Result = 4 / 2 + 1 - 4 * 2 + 10;
        // 2 + 1 - 8 + 10
        // -5 + 10
        // 5
        System.out.println("result = " + Result);

        //urinary operator
        int a = 4;           //a--a use then decrement
        int b = 3 - 2 * --a; // --a first decrement then use // a = a - 1
        System.out.println("a = " + a + " b = " + b);

        a = 4;
        b = 3 - 2 * a--; // use 'a' then decrement
        System.out.println("a = " + a + " b = " + b);

        long c = 2;
        long d = 4 + 3 * c++; //use then increment // c = c + 1

        System.out.println("c = " + c + " d " + d);

        Result = 10 - 3 * (2 + 1) - 4 / (1 + 3);  //BODMAS RULE
        System.out.println("result = " + Result);

        // MODULERS/REMAINDER OPERATOR
        int i = 10;
        int j = 3;

        int k = i % j;  // 10 % 3 = 10 / 3 = 3 -> 3*3 = 9 -> 10 - 9 = 1
        int e = 10 % 2;  // 10 % 2 = 10 / 2 = 5 -> 5*2 = 10 -> 10 - 10 = 0

        System.out.println("k = " + k + " e " + e);

        int f = 12;
        int g = 5;
        int h = 2;

        int m = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3;
        // 12 / 2 - 10 % 7 - 2 * 12 % 5 - 2
        // 6 - 3 - 24 % 5 - 6
        // 6 - 3 - 4 - 6
        // 3 - 4 - 6
        // - 7

        System.out.println("m = " + m);
    }
}
