import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JLabel lblResult;
    private JPanel panel;

    Calculator() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(tfNumber1.getText());
                    int number2 = Integer.parseInt(tfNumber2.getText());
                    int selectedIndex = cbOperations.getSelectedIndex();
                    switch (selectedIndex) {
                        case 0: number1 += number2; break;
                        case 1: number1 -= number2;break;
                        case 2: number1 *= number2;break;
                        case 3: number1 /= number2;break;
                    }

                    lblResult.setText(Integer.toString(number1));

                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Input a valid number.");
                }
            }
        });
    }

    public static void main(String[] args) {
        Calculator s = new Calculator();
        s.setContentPane(s.panel);
        s.setSize(500,300);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Simple Calculator");
    }


}
