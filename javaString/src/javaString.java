import java.util.*;
import java.util.Scanner;

public class javaString {
    public static void main(String[] args) {
        System.out.println("string lesson");

        String original, reverse = "";
        int id;
        Scanner input = new Scanner(System.in);

        System.out.println("enter a string to reverse ");
        original = input.nextLine();

        int length = original.length();

        String str = "";

        for(int d = 0; d < 10; d++ ){
            str += d + " ";
        }

        for(int i = length-1; i >= 0; i--){
            reverse = reverse + original.charAt(i);
        }
        System.out.println(original + " Reverse of entered string is :" + reverse);
        System.out.println(str);
        System.out.println(length);
    }

}
