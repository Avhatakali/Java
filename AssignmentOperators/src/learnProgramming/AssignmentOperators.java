package learnProgramming;

public class AssignmentOperators {

    public static void main(String[] args) {
//        int x = 1.0; // does not compile
//        short y = 19812345;
//        int z = 9f;
//        long t = 1923012345678910;

        //casting values
        int x = (int)1.0;
        short y = (short) 19812345;
        int z = (int) 9f;
        long t = 1923012345678910L;

        System.out.println("x = " + x);
        System.out.println("y = " + y); // there is a 'overflow'
        // overflow is when a number is too large to fit into datatype,
        // java automatically block the value to the next lowest value
        System.out.println("z = " + z);
        System.out.println("t = " + t);

        //overflow and underflow with byte (-128 to 127)
        byte myByte = 127;
        byte mySecondByte = -128;

        System.out.println("myByte = " + myByte);
        System.out.println("mySecondByte = " + mySecondByte);

//        myByte = myByte + 1;
        myByte++;
//        mySecondByte = mySecondByte - 1;
        mySecondByte--;
        System.out.println("myByte = " + myByte);
        System.out.println("mySecondByte = " + mySecondByte);

        // other casting
        short a = 10;
        short b = 20;
        short c = (short)(a * b);
        System.out.println("c = " + c);
    }
}
