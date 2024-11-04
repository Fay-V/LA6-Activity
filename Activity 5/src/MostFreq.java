import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.HashMap;
import java.util.Map;


public class MostFreq extends JFrame {
    private JLabel frequentCharLabel;
    private JPanel panel1;
    private JTextArea textArea;
    String theMessage;
    MostFreq() {
        textArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                theMessage = textArea.getText();
                findChar(theMessage);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                theMessage = textArea.getText();
                findChar(theMessage);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                theMessage = textArea.getText();
                findChar(theMessage);
            }

            private void findChar(String theMessage) {
                Map<Character, Integer> charCount = new HashMap<>();

                for (char c : theMessage.toCharArray()) {
                    if (c != ' ' && c != '\n') {
                        c = Character.toLowerCase(c);
                        charCount.put(c, charCount.getOrDefault(c, 0) + 1);
                    }
                }

                char mostFrequent = '\0';
                int maxCount = 0;

                for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                    if (entry.getValue() > maxCount) {
                        maxCount = entry.getValue();
                        mostFrequent = entry.getKey();
                    }
                }

                if (mostFrequent != '\0') {
                    frequentCharLabel.setText("The most frequent character is: " + mostFrequent);
                } else {
                    frequentCharLabel.setText("The most frequent character is: ");
                }
            }
        });
    }
    public static void main(String[] args) {
        MostFreq s = new MostFreq();
        s.setContentPane(s.panel1);
        s.setSize(400,300);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Most Frequent Char");
    }
}
