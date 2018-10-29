package leaarnProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UsingArrays {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));

        String[] names = new String[5];
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 10;
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number [" + i + "]= "+numbers[i]);
        }
    }
}
