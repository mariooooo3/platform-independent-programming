package GUI_II;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class TestPrb2 extends JFrame {
    private JFrame frame;
    private JScrollBar cateta2 = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 300);
    private JScrollBar cateta1 = new JScrollBar(JScrollBar.VERTICAL, 0, 1, 0, 400);
    private int lungime1 = 0;
    private int lungime2 = 0;

    private void initialize() {
        frame = this;
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());
        cateta1.addAdjustmentListener(listener);
        cateta2.addAdjustmentListener(listener);
        frame.getContentPane().add(BorderLayout.WEST, cateta1);
        frame.getContentPane().add(BorderLayout.SOUTH, cateta2);
    }

    AdjustmentListener listener = new AdjustmentListener() {
        public void adjustmentValueChanged(AdjustmentEvent arg0) {
            JScrollBar scrollBar = (JScrollBar) arg0.getSource();
            int lungime = scrollBar.getValue();
            if (scrollBar == cateta1) {
                lungime1 = lungime;
            } else
                lungime2 = lungime;
            frame.repaint();
            if (lungime != 0) {
                System.out.println("Tg(alpha)=" + ((float) lungime1 / (float) lungime2));
            } else
                System.out.println("Tangenta este infinita");

        }
    };

    public void paint(java.awt.Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.drawLine(25, 30, 25 + lungime2, 30);
        g.drawLine(25, 30, 25, 30 + lungime1);
        g.drawLine(25, 30 + lungime1, 25 + lungime2, 30);
    }
}