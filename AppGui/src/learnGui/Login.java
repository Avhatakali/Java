package learnGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JButton loginButton;
    private JPanel loginPanel;
    private JTextField textField1;

    public Login() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "hello there");
            }
        });
    }

    public static void main(String[] args) {
        JFrame Frame = new JFrame("App");
        Frame.setContentPane(new Login().loginPanel);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.pack();
        Frame.setVisible(true);
        Frame.setSize(400, 200);
    }
}
