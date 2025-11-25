package lab07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class TestPrb3 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txt1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TestPrb3 frame = new TestPrb3();
                    System.out.println(frame.getDefaultCloseOperation());
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public TestPrb3() {
        setBackground(new Color(255, 128, 128));
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 269, 251);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 128, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Standard");
        lblNewLabel.setBackground(new Color(255, 128, 128));
        lblNewLabel.setBounds(10, 11, 60, 23);
        contentPane.add(lblNewLabel);

        JButton btn7 = new JButton("7");
        btn7.setBackground(new Color(255, 128, 128));
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = txt1.getText();
                txt1.setText(text + "7");
            }

        });
        btn7.setBounds(0, 76, 60, 23);
        contentPane.add(btn7);

        JButton btn8 = new JButton("8");
        btn8.setBackground(new Color(255, 128, 128));
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = txt1.getText();
                txt1.setText(text + "8");
            }
        });
        btn8.setBounds(65, 76, 60, 23);
        contentPane.add(btn8);

        JButton btn9 = new JButton("9");
        btn9.setBackground(new Color(255, 128, 128));
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = txt1.getText();
                txt1.setText(text + "9");
            }
        });
        btn9.setBounds(135, 76, 60, 23);
        contentPane.add(btn9);

        JButton btn4 = new JButton("4");
        btn4.setBackground(new Color(255, 128, 128));
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = txt1.getText();
                txt1.setText(text + "4");
            }
        });
        btn4.setBounds(0, 110, 60, 23);
        contentPane.add(btn4);

        JButton btnNewButton_4 = new JButton("5");
        btnNewButton_4.setBackground(new Color(255, 128, 128));
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = txt1.getText();
                txt1.setText(text + "5");
            }
        });
        btnNewButton_4.setBounds(65, 110, 60, 23);
        contentPane.add(btnNewButton_4);

        JButton btn6 = new JButton("6");
        btn6.setBackground(new Color(255, 128, 128));
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = txt1.getText();
                txt1.setText(text + "6");
            }
        });
        btn6.setBounds(135, 110, 60, 23);
        contentPane.add(btn6);

        JButton btnNewButton_6 = new JButton("1");
        btnNewButton_6.setBackground(new Color(255, 128, 128));
        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = txt1.getText();
                txt1.setText(text + "1");
            }
        });
        btnNewButton_6.setBounds(0, 144, 60, 23);
        contentPane.add(btnNewButton_6);

        JButton btn2 = new JButton("2");
        btn2.setBackground(new Color(255, 128, 128));
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = txt1.getText();
                txt1.setText(text + "2");
            }
        });
        btn2.setBounds(65, 144, 60, 23);
        contentPane.add(btn2);

        JButton btnNewButton_8 = new JButton("3");
        btnNewButton_8.setBackground(new Color(255, 128, 128));
        btnNewButton_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = txt1.getText();
                txt1.setText(text + "3");
            }
        });
        btnNewButton_8.setBounds(135, 144, 60, 23);
        contentPane.add(btnNewButton_8);

        JButton btn0 = new JButton("0");
        btn0.setBackground(new Color(255, 128, 128));
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = txt1.getText();
                txt1.setText(text + "0");
            }
        });
        btn0.setBounds(65, 178, 60, 23);
        contentPane.add(btn0);

        JButton btnEqual = new JButton("=");
        btnEqual.setBackground(new Color(255, 128, 128));
        btnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String expr = txt1.getText();

                    String[] numbers = expr.split("[+\\-x/]");
                    String ops = expr.replaceAll("[0-9.]", "");

                    double result = Double.parseDouble(numbers[0]);

                    for (int i = 0; i < ops.length(); i++) {
                        double next = Double.parseDouble(numbers[i + 1]);
                        char op = ops.charAt(i);

                        switch (op) {
                            case '+':
                                result += next;
                                break;
                            case '-':
                                result -= next;
                                break;
                            case 'x':
                                result *= next;
                                break;
                            case '/':
                                if (next == 0) {
                                    txt1.setText("Calcul imposibil");
                                    return;
                                } else {
                                    result /= next;
                                    break;
                                }

                        }
                    }

                    txt1.setText(String.valueOf(result));
                } catch (Exception ex) {
                    txt1.setText("Nu poate fi efectuat acest calcul");
                }
            }
        });

        btnEqual.setBounds(135, 178, 60, 23);
        contentPane.add(btnEqual);

        JButton btnAdd = new JButton("+");
        btnAdd.setBackground(new Color(255, 128, 128));
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = txt1.getText();
                txt1.setText(text + "+");
            }
        });
        btnAdd.setBounds(198, 144, 46, 23);
        contentPane.add(btnAdd);

        JButton btnX = new JButton("x");
        btnX.setBackground(new Color(255, 128, 128));
        btnX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = txt1.getText();
                txt1.setText(text + "x");
            }
        });
        btnX.setBounds(198, 178, 46, 23);
        contentPane.add(btnX);

        JButton btnDif = new JButton("-");
        btnDif.setBackground(new Color(255, 128, 128));
        btnDif.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = txt1.getText();
                txt1.setText(text + "-");
            }
        });
        btnDif.setBounds(198, 110, 46, 23);
        contentPane.add(btnDif);

        JButton btnImp = new JButton("/");
        btnImp.setBackground(new Color(255, 128, 128));
        btnImp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = txt1.getText();
                txt1.setText(text + "/");
            }
        });
        btnImp.setBounds(198, 76, 46, 23);
        contentPane.add(btnImp);

        txt1 = new JTextField();
        txt1.setBackground(new Color(255, 128, 128));
        txt1.setBounds(0, 29, 185, 20);
        contentPane.add(txt1);
        txt1.setColumns(10);

        JButton btnClear = new JButton("C");
        btnClear.setBackground(new Color(255, 128, 128));
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt1.setText("");
            }
        });
        btnClear.setBounds(198, 28, 46, 23);
        contentPane.add(btnClear);

    }
}