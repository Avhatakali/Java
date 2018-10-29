package academy.learnProgramming;
import java.lang.System;

public class WholeNumericPremitives {
    public static void main(String[] args) {
        long max = 32_123_456_789L; //underscore make it easier to read
//        long n = _2; //these isn't allowed
        long n = 2_300;

//octal numbers (0-7)
        int oct = 07;
        int firstOct = 010;  // 8 decimal
        int secondOct = 022; //18 decimal

        int sumOct = firstOct + secondOct;
        System.out.println("first = "+ firstOct + " second = " + secondOct);
        //print the sum into octal base
        System.out.println("decimal sum = " + sumOct + " octSum = " + Integer.toOctalString(sumOct));

        //Hexadecimal (0-9 and A-F)
        int firstHex = 0xf; // 15 decimal
        int secondHex = 0x1E; // 30 decimal
        int sumHex = firstHex + secondHex;
        System.out.println("first = " + firstHex + " second " + secondHex);
        System.out.println("decimalSum = " + sumHex + " hexSum = " + Integer.toHexString(sumHex));

        //Binary
        int firstBin = 0b1001; // 9 decimal
        int secondBin = 0b0111; // 7 decimal
        int sumBin = firstBin + secondBin;
        System.out.println("first = " + firstBin + " second " + secondBin);
        System.out.println("decimalSum = " + sumBin + " sumBinary " + Integer.toBinaryString(sumBin));
    }
}
