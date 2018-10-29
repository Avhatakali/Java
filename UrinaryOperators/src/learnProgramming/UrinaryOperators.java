package learnProgramming;

public class UrinaryOperators {

    public static void main(String[] args) {
        int x = +3; // + sign is redundant
        System.out.println("x = " + x);

        double y = -x;  //nagate
        System.out.println("x = " + x + " y = " + y);

        y = -y; // -1 * y
        System.out.println("x = " + x + " y = " + y);

        boolean a = true;
        boolean b = !a;
        System.out.println("a = " + a + " b = " + b);

//        int myInt = !5; // does n't compile
//        boolean myBoolean = -true; // does n't compile
//        boolean z = !0; // does n't compile

        //increment and decrement be careful, have a higher order Than (+, -, *, /, ...)
        int myInt = 5;
        int otherInt = ++myInt;
        System.out.println("myInt = " + myInt + " otherInt = " + otherInt);

        //post increment
        int newInt = 5;
//        int newOtherInt = newInt;  //this two lines is de same as the code below
//        newInt = newInt + 1;
        int newOtherInt = newInt++;
        System.out.println("newInt = " + newInt + " newOtherInt = " + newOtherInt);

        int count = 0;
        System.out.println(count);
        System.out.println(++count); // 1
        System.out.println(count);  // 1
        System.out.println(count--); // print 1 but also set count to 0, the value changed but not used
        System.out.println(count);   // print the corrent value 0

        //exam question
        int e = 3;
        int f = ++e * 5 / e-- + --e;
        // e = 3
        // 4 * 5 / e-- + --e; -> ++e -> ++3 -> e -> 4
        //4 * 5 / 4 + --e; -> e = 3 -> e-- -> 4-- -> 3
        // 20 / 4 + 2 ; -> e = --3 -> 2
        // 5 + 2
        System.out.println("e = " + e + " f = " + f);

        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
        // h = 3, g = 6
        // 3 + --g * 3 + 2 * g++ - h-- % --g
        // h = 3, g = 5
        // 3 + 5 * 3 + 2 * g++ - h-- % --g
        // 3 + 5 * 3 + 2 * 5 - h-- % --g
        // h = 2, g = 6
        // 3 + 5 * 3 + 2 * 5 - 3 % 5
        // g = 5
        // 3 + 15 + 10 - 3
        // 18 + 10 - 3
        // 28 - 3
        // 25
        System.out.println("g = " + g + " h = " + h + " i = " + i);

    }
}
