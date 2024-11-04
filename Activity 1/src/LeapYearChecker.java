import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame{
    private JButton checkYearButton;
    private JPanel panel1;
    private JTextField yearTextField;

    LeapYearChecker() {
        checkYearButton.setName("checkYearButton");
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int year = Integer.parseInt(yearTextField.getText());
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
                        JOptionPane.showMessageDialog(null, "Leap year");
                    } else {
                        JOptionPane.showMessageDialog(null, "Not a leap year");
                    }

                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Input a valid year.");
                }
            }
        });
    }
    public static void main(String[] args) {
        LeapYearChecker s = new LeapYearChecker();
        s.setContentPane(s.panel1);
        s.setSize(400,300);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Leap Year Checker");
    }
}
