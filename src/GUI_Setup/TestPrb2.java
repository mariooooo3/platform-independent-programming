package GUI_Setup;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class TestPrb2 {

    private JFrame frame;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TestPrb2 window = new TestPrb2();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public TestPrb2() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        JTextArea txtrSalutPip = new JTextArea();
        textField = new JTextField();
        textField.setEditable(false);
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Editare");
        btnNewButton.setBounds(10, 208, 120, 23);
        frame.getContentPane().add(btnNewButton);

        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setEditable(true);
            }
        });


        JButton btnNewButton_1 = new JButton("Nr. caractere");
        btnNewButton_1.setBounds(304, 208, 120, 23);

        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setEditable(false);
                String text = textField.getText();
                int i = 0;
                for(int j = 0; j < text.length() ; j++)
                {
                    i++;
                }
                txtrSalutPip.setText(i + " caractere introduse");
            }

        });


        frame.getContentPane().add(btnNewButton_1);
        textField.setBounds(10, 163, 414, 34);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        txtrSalutPip.setEditable(false);
        txtrSalutPip.setText("Salut, PIP! ");
        txtrSalutPip.setBounds(10, 11, 414, 141);
        frame.getContentPane().add(txtrSalutPip);
    }



}