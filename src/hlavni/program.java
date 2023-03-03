package hlavni;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class program {

    public JPanel panel1;
    private JButton button1;
    private JPanel prvni;
    private JPanel druhy;
    private JPanel pole1;
    public JLabel p1;
    public JLabel p2;
    private JLabel p3;
    private JLabel p4;
    private JLabel p5;
    private JButton dalsihracButton;
    public JButton hoditButton;
    private JButton konecButton;
    private JLabel p6;
    private JLabel p7;
    private JLabel p8;
    private JLabel p9;
    private JLabel p10;
    private JLabel p11;
    private JLabel p12;
    private JLabel p13;
    private JLabel p14;
    private JLabel p15;
    private JLabel p16;
    private JLabel p17;
    private JLabel p18;
    private JLabel p19;
    private JLabel p20;
    private JLabel p21;
    private JLabel p22;
    private JLabel p23;
    private JLabel p24;
    private JLabel p25;
    private JLabel p26;
    private JLabel p27;
    private JLabel p28;
    private JLabel p29;
    private JLabel p30;
    private JLabel p31;
    private JLabel p32;
    private JLabel p33;
    private JLabel p34;
    private JLabel p35;
    private JLabel p36;
    private JLabel p37;
    private JLabel p38;
    private JLabel p39;
    private JLabel p40;
    private JPanel cerveny;
    private JPanel zluty;
    private JPanel zeleny;
    private JPanel modry;
    private JPanel cervenyp1;
    private JLabel cerveny2;
    private JLabel cerveny3;
    private JLabel cerveny4;
    private JLabel pkostka;
    private JPanel hoditpanel2;
    public JPanel hoditpanel;
    private JLabel cerveny1;
    private JLabel zluty1;
    private JLabel zluty2;
    private JLabel zluty3;
    private JLabel zluty4;
    private JLabel zeleny1;
    private JLabel zeleny2;
    private JLabel zeleny3;
    private JLabel zeleny4;
    private JLabel modry1;
    private JLabel modry2;
    private JLabel modry3;
    private JLabel modry4;
    public static int hozeno;

    public program() {

        button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            prvni.setVisible(false);
            druhy.setVisible(true);

        }
    });

        hoditButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        konecButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                druhy.setVisible(false);
                prvni.setVisible(true);

            }
        });
    }

}

