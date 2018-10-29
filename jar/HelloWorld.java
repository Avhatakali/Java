import java.util.*;
import java.net.*;
import java.util.Scanner.*;
import javax.swing.*;
import java.awt.Container;

public class HelloWorld{
public static void main(String  args[])
{
JFrame f = new JFrame("Hello, World");
JLabel label = new JLabel("Hello, World");
Container cont = f.getContentPane();
cont.add(label);
f.setSize(300,100);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}