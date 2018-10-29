package learnProgramming;

import javax.swing.*;
import java.util.Scanner;

public class AdditionProgramming {
    public static void main(String[] args) {
        int A, B;
        Scanner in = new Scanner(System.in);
        JOptionPane.showInputDialog("enter integer 1 : ");
        A = in.nextInt();
        JOptionPane.showInputDialog("enter integer 2 : ");
        B = in.nextInt();
        JOptionPane.showMessageDialog(null, (A + B));

    }
}
