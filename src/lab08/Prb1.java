package lab08;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Enumeration;
import java.awt.EventQueue;
import java.awt.Component;

public class Prb1 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txt1;

    private JMenuBar menuBar1;
    private JMenuBar menuBar2;
    private ButtonGroup grupDimensiune1;
    private ButtonGroup grupDimensiune2;
    private String formaSelectata = "Linie";
    private boolean isMenuBar1Active = true;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Prb1 frame = new Prb1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Prb1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 357, 179);

        menuBar1 = new JMenuBar();
        setJMenuBar(menuBar1);
        grupDimensiune1 = new ButtonGroup();
        grupDimensiune2 = new ButtonGroup();

        JMenu menu1 = new JMenu("Semnal intrare");
        menuBar1.add(menu1);

        JMenuItem dirac = new JMenuItem("Impuls Dirac");
        dirac.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt1.setText("Semnal intrare: Impuls Dirac");
            }
        });
        menu1.add(dirac);

        JMenuItem treapta = new JMenuItem("Treaptă");
        treapta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt1.setText("Semnal intrare: Treaptă");
            }
        });
        menu1.add(treapta);

        JMenuItem sinus = new JMenuItem("Sinusoidal");
        sinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt1.setText("Semnal intrare: Sinusoidal");
            }
        });
        menu1.add(sinus);

        JMenu menu2 = new JMenu("Tip sistem");
        menuBar1.add(menu2);

        JMenuItem ord1 = new JMenuItem("Ordin I");
        ord1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt1.setText("Sistem: Ordin I");
            }
        });
        menu2.add(ord1);

        JMenuItem ord2 = new JMenuItem("Ordin II");
        ord2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt1.setText("Sistem: Ordin II");
            }
        });
        menu2.add(ord2);

        menuBar2 = new JMenuBar();

        JMenu menu3 = new JMenu("Formă");
        menuBar2.add(menu3);

        JMenuItem linie = new JMenuItem("Linie");
        linie.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                formaSelectata = "Linie";
                updateOutput2();
            }
        });
        menu3.add(linie);

        JMenuItem dreptunghi = new JMenuItem("Dreptunghi");
        dreptunghi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                formaSelectata = "Dreptunghi";
                updateOutput2();
            }
        });
        menu3.add(dreptunghi);

        JMenuItem cerc = new JMenuItem("Cerc");
        cerc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                formaSelectata = "Cerc";
                updateOutput2();
            }
        });
        menu3.add(cerc);

        JMenu menu4 = new JMenu("Dimensiuni");
        menuBar2.add(menu4);

        JMenu menu5 = new JMenu("Dimensiune 1");
        menu4.add(menu5);

        JRadioButtonMenuItem rad1 = new JRadioButtonMenuItem("1");
        rad1.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { updateOutput2(); } });
        grupDimensiune1.add(rad1);
        rad1.setSelected(true);
        menu5.add(rad1);

        JRadioButtonMenuItem rad2 = new JRadioButtonMenuItem("2");
        rad2.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { updateOutput2(); } });
        grupDimensiune1.add(rad2);
        menu5.add(rad2);

        JRadioButtonMenuItem rad5 = new JRadioButtonMenuItem("5");
        rad5.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { updateOutput2(); } });
        grupDimensiune1.add(rad5);
        menu5.add(rad5);

        JMenu menu6 = new JMenu("Dimensiune 2");
        menu4.add(menu6);

        JRadioButtonMenuItem rad10 = new JRadioButtonMenuItem("10");
        rad10.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { updateOutput2(); } });
        grupDimensiune2.add(rad10);
        rad10.setSelected(true);
        menu6.add(rad10);

        JRadioButtonMenuItem rad25 = new JRadioButtonMenuItem("25");
        rad25.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { updateOutput2(); } });
        grupDimensiune2.add(rad25);
        menu6.add(rad25);

        JRadioButtonMenuItem rad50 = new JRadioButtonMenuItem("50");
        rad50.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { updateOutput2(); } });
        grupDimensiune2.add(rad50);
        menu6.add(rad50);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btn1 = new JButton("Comută Meniu");
        btn1.setBounds(198, 64, 135, 20);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comutaBaraDeMeniu();
            }
        });
        contentPane.add(btn1);

        txt1 = new JTextField();
        txt1.setEditable(false);
        txt1.setBounds(10, 65, 178, 18);
        contentPane.add(txt1);
        txt1.setColumns(10);
    }

    private void comutaBaraDeMeniu() {
        if (isMenuBar1Active) {
            setJMenuBar(menuBar2);
            updateOutput2();
        } else {
            setJMenuBar(menuBar1);
            txt1.setText("");
        }

        isMenuBar1Active = !isMenuBar1Active;

        revalidate();
        repaint();
    }

    private int getSelectedValue(ButtonGroup group) {
        for (Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return Integer.parseInt(button.getText());
            }
        }
        return 0;
    }

    private void updateOutput2() {
        int dim1 = getSelectedValue(grupDimensiune1);
        int dim2 = getSelectedValue(grupDimensiune2);
        String mesaj = "";

        if (!isMenuBar1Active) {
            switch (formaSelectata) {
                case "Linie":
                    int lungime = dim1 - dim2;
                    mesaj = "linie de lungime (" + dim1 + " - " + dim2 + ") = " + lungime;
                    break;
                case "Dreptunghi":
                    int suprafataDreptunghi = dim1 * dim2;
                    mesaj = "dreptunghi de suprafață (" + dim1 + " x " + dim2 + ") = " + suprafataDreptunghi;
                    break;
                case "Cerc":
                    int diferenta = dim2 - dim1;
                    double suprafataCerc = 3.14 * Math.pow(diferenta, 2);
                    mesaj = "cerc de suprafață 3.14 x (" + dim2 + " - " + dim1 + ")\u00B2 \u2248 " + String.format("%.2f", suprafataCerc);
                    break;
            }
            txt1.setText(mesaj);
        }
    }
}