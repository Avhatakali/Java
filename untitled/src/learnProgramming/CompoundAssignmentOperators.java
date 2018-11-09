package learnProgramming;
import javax.swing.*;

public class CompoundAssignmentOperators {

    public static void main(String[] args) {
        int x = 2;
        int z = 3;

        x = x * z; // simple assignment
        x *= z;     // shorter form,  x = x * z;

        // x = 2 * 3 -> 6
        //x = 6;
        // 6 * 3 -> 18
        System.out.println("x = " + x);

    }
}
