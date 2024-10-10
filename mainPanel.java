import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainPanel {
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JPanel XYZ;

    public static void main(String[] args) {
        JFrame frame = new JFrame("mainPanel");
        frame.setContentPane(new mainPanel().XYZ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public mainPanel() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
