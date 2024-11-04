import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrder extends JFrame{
    private JPanel panel;
    private JButton btnOrder;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    FoodOrder() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hi");
                JCheckBox[] items = new JCheckBox[]{cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
                double[] prices = new double[]{100, 80, 65, 55, 50, 40};
                int i = 0;
                double sum = 0;
                for (JCheckBox r : items) {
                    if (r.isSelected()) {
                        sum += prices[i];
                    }
                    i++;
                }
                double discount = 1.00;
                JRadioButton[] discounts = new JRadioButton[]{rbNone, rb5, rb10, rb15};
                System.out.println("Hi");
                for (JRadioButton r : discounts) {
                    if (r.isSelected()) {
                        sum *= discount;

                        break;
                    }
                    discount -= 0.05;
                }

                JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", sum));


            }
        });
    }
    public static void main(String[] args) {
        FoodOrder s = new FoodOrder();
        s.setContentPane(s.panel);
        s.setSize(500,300);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Food Ordering System");
    }
}
