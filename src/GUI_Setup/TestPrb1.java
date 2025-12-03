package GUI_Setup;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestPrb1 extends JFrame {
    public TestPrb1(String s)
    {
        setTitle(s);
    }
    public static void main(String[] args) {

        System.out.println("Incepere aplicatie grafica");

        TestPrb1 gui = new TestPrb1("PIP GUI");
        System.out.println(gui.getDefaultCloseOperation()); // HIDE ON CLOSE
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println(gui.getDefaultCloseOperation());

        gui.setSize(500, 500);
        gui.setVisible(true);

        //task 2

        Container panou = gui.getContentPane();
        panou.setBackground(new Color(100, 0, 0));

        gui.setVisible(true);

        //task 3

        gui.setLayout(null);
        JButton button = new JButton("Apasa");
        button.setBounds(50, 50, 80, 30);
        gui.add(button);

        // task4
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ok");
            }
        });

        gui.setVisible(true);




    }

}