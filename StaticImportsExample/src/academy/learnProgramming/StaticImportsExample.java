package academy.learnProgramming;
import static java.lang.Math.*;
import static academy.learnProgramming.Config.*;
import static java.lang.System.out; // can print by just out.println();

public class StaticImportsExample {

    public static void main(String[] args) {
        int min = min(5,7);
        double max = Math.max(2,11);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        //maths class
        System.out.println(PI);

        //Calling static config inside our main method
//        printConfig();
        System.out.println("name = " + NAME);
        System.out.println("columnCount = " + MAX_COLUMN_COUNT );
    }
}
