package learnProgramming;

public class NumericPromotion {

    public static void main(String[] args) {
        // promotion is conventing smaller into bigger type

        int x = 5;
        double y = 10.55;
        System.out.println("x + y = " + (x + y)); // this x will be auto promoted to double

        byte b = 10;
        int c = 5;
        double d = 4.5;

        double result = b + c + d;
        System.out.println("result = " + result);

        // casting is the opposite to promoting
        // casting is converting "bigger" type to "smaller" type

        double myDouble = 5.55;
        int myInt = 4 + (int)myDouble; // we'll lose decimal place
        System.out.println("result = " + myInt);

        int anotherInt = 125;
        byte myByte = 15;
        int intResult = anotherInt + myByte;
        byte byteResult = (byte)(anotherInt + myByte);
        System.out.println("intResult = " + intResult);
        System.out.println("byteResult = " + byteResult); // overflow
    }
}
