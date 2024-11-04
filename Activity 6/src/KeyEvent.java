import javax.swing.*;
import java.awt.event.KeyAdapter;

public class KeyEvent extends JFrame {
    private JPanel panel;
    private JTextArea editableTextArea;
    private JTextArea nonEditableTextArea;
    KeyEvent() {
        editableTextArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                char key = e.getKeyChar();
                /*if (key == '\b') {
                    try {
                        String input = editableTextArea.getText();
                        input.toCharArray()
                    } catch (Exception e1) {
                        //dunno
                    }
                }*/
                if (key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u') {
                    key = Character.toUpperCase(key);
                }
                nonEditableTextArea.append(key + "");
            }
        });
    }
    public static void main(String[] args) {
        KeyEvent s = new KeyEvent();
        s.setContentPane(s.panel);
        s.setSize(400,300);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Item Listener");
    }
}
