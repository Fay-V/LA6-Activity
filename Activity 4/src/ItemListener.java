import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ItemListener extends JFrame{
    private JPanel panel1;
    private JCheckBox cCheckBox;
    private JCheckBox cppCheckBox;
    private JCheckBox cSharpCheckBox;
    private JCheckBox javaCheckBox;
    private JCheckBox pythonCheckBox;
    private JComboBox proficiencyComboBox;
    private JLabel languageLabel;
    private JLabel proficiencyLabel;
    int items = 0;
    List<String> myOutput = new ArrayList<String>(5);
    String finalOut = "";
    int i = 1;
    ItemListener() {
        languageLabel.setText("My Favorite Languages: ");
        proficiencyLabel.setText("Proficiency: Easy");
        proficiencyComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = proficiencyComboBox.getSelectedIndex();
                switch (selectedIndex) {
                    case 0: proficiencyLabel.setText("Proficiency: Easy"); break;
                    case 1: proficiencyLabel.setText("Proficiency: Medium");break;
                    case 2: proficiencyLabel.setText("Proficiency: Hard");break;
                    case 3: proficiencyLabel.setText("Proficiency: Extreme");break;
                }
            }
        });

        cCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cCheckBox.isSelected()) {
                    myOutput.add("C");
                    items++;
                } else {
                    items--;
                    myOutput.remove("C");
                }
                languageLabel.setText("");
                finalOut = "";
                i = 1;
                for (String str: myOutput) {
                    finalOut += str;
                    if (i < items) {
                        finalOut += ", ";
                    }
                    i++;
                }
                languageLabel.setText("My Favorite Languages: " + finalOut);
            }


        });
        cppCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cppCheckBox.isSelected()) {
                    myOutput.add("C++");
                    items++;
                } else {
                    items--;
                    myOutput.remove("C++");
                }
                languageLabel.setText("");
                finalOut = "";i = 1;
                for (String str: myOutput) {
                    finalOut += str;
                    if (i < items) {
                        finalOut += ", ";
                    }
                    i++;
                }
                languageLabel.setText("My Favorite Languages: " + finalOut);
            }
        });
        cSharpCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cSharpCheckBox.isSelected()) {
                    myOutput.add("C#");
                    items++;
                } else {
                    items--;
                    myOutput.remove("C#");
                }
                languageLabel.setText("");
                finalOut = "";i = 1;
                for (String str: myOutput) {
                    finalOut += str;
                    if (i < items) {
                        finalOut += ", ";
                    }
                    i++;
                }
                languageLabel.setText("My Favorite Languages: " + finalOut);
            }
        });
        javaCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(javaCheckBox.isSelected()) {
                    myOutput.add("Java");
                    items++;
                } else {
                    items--;
                    myOutput.remove("Java");
                }
                languageLabel.setText("");
                finalOut = "";i = 1;
                for (String str: myOutput) {
                    finalOut += str;
                    if (i < items) {
                        finalOut += ", ";
                    }
                    i++;
                }
                languageLabel.setText("My Favorite Languages: " + finalOut);
            }
        });
        pythonCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pythonCheckBox.isSelected()) {
                    myOutput.add("Python");
                    items++;
                } else {
                    items--;
                    myOutput.remove("Python");
                }
                languageLabel.setText("");
                finalOut = "";i = 1;
                for (String str: myOutput) {
                    finalOut += str;
                    if (i < items) {
                        finalOut += ", ";
                    }
                    i++;
                }
                languageLabel.setText("My Favorite Languages: " + finalOut);
            }
        });
    }
    public static void main(String[] args) {
        ItemListener s = new ItemListener();
        s.setContentPane(s.panel1);
        s.setSize(400,300);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Item Listener");
    }
}
