package academy.learnProgramming;

public class PrimitivesCharAndBoolean {
    public static void main(String[] args) {

        char ch = 'a';
        char ch1 = '1'; // not an int but a character
        char uniChar = '\u03A9'; // uppercase greek omega character
        char romanNumber = '\u216C'; // roman 50 number

        System.out.println("ch1 = " + ch1);
        System.out.println("uniChar = " + uniChar);
        System.out.println("romanNumber = " + romanNumber);

        // Boolean -> True / False
        boolean myBoolean = true;
        boolean myFalseBoolean = false;
        System.out.println("myBoolean = " + myBoolean);
        System.out.println("myFalseBoolean = " + myFalseBoolean);
    }
}
