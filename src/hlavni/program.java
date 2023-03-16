package hlavni;
import javax.swing.*;
import java.awt.*;
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
    private JLabel labelhrac;
    public static int hozeno;
    public static int hrajicihrac = -1;
    public static int zvolenafigurka;
    public program() {

        button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            prvni.setVisible(false);
            druhy.setVisible(true);

            hrajici.hrajici(labelhrac);
        }
    });

        hoditButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         /*       for(int i = 0; i < Main.policka.length; i++){
                    System.out.println("policko " + i  + "je");
                    if(Main.policka[i] == null) {
                        System.out.print("Prazdny");
                    }else {
                        System.out.print("plny");
                    }
                } */
                hozeno = kostka.randomkostka();
                if(hozeno == 0){
                    hozeno = 6;
                }
                System.out.println(hozeno);
                switch(hozeno){
                    case 6:

                        pkostka.setIcon(new ImageIcon("src/images/kostka/6.png"));
                    break;
                    case 1:
                        pkostka.setIcon(new ImageIcon("src/images/kostka/1.png"));
                    break;
                    case 2:
                        pkostka.setIcon(new ImageIcon("src/images/kostka/2.png"));
                        break;
                    case 3:
                        pkostka.setIcon(new ImageIcon("src/images/kostka/3.png"));
                        break;
                    case 4:
                        pkostka.setIcon(new ImageIcon("src/images/kostka/4.png"));
                        break;
                    case 5:
                        pkostka.setIcon(new ImageIcon("src/images/kostka/5.png"));
                        break;
                }

                if(Main.hraci[hrajicihrac].getFigurkyvpoli() == 0){
                    if(hozeno != 6){
                        System.out.println("Musí se hodit šestka pro začátek");
                        hrajici.hrajici(labelhrac);
                    }else if(hozeno == 6){
                       spawn.spawn(p1, p11, p21, p31, cerveny1, cerveny2, cerveny3, cerveny4, zeleny1, zeleny2, zeleny3, zeleny4, modry1, modry2, modry3, modry4, zluty1, zluty2, zluty3, zluty4);

                    }
                }else if(Main.hraci[hrajicihrac].getFigurkyvpoli() > 0 && Main.hraci[hrajicihrac].getFigurkyvpoli() < 5){
                    if(hozeno == 6 && Main.hraci[hrajicihrac].getFigurkyvpoli() < 4){
                        System.out.println("Vybrat spawn a posun sj inou");
                    }else if(Main.hraci[hrajicihrac].getFigurkyvpoli() > 1 && hozeno != 6 || hozeno == 6 && Main.hraci[hrajicihrac].getFigurkyvpoli() == 4) {
                        System.out.println("vyběr figurky");
                        vyberfigurky vyberfigurky = new vyberfigurky();
                        vyberfigurky.pack();
                        vyberfigurky.setVisible(true);
                        posun.posun(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p30,p31,p32,p33,p34,p35,p36,p37,p38,p39,p40, cerveny1, cerveny2, cerveny3, cerveny4, zeleny1, zeleny2, zeleny3, zeleny4, modry1, modry2, modry3, modry4, zluty1, zluty2, zluty3, zluty4);
                    }else if(Main.hraci[hrajicihrac].getFigurkyvpoli() == 1 && hozeno < 6){
                        zvolenafigurka = 0;

                        System.out.println("tady");
                        posun.posun(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p30,p31,p32,p33,p34,p35,p36,p37,p38,p39,p40, cerveny1, cerveny2, cerveny3, cerveny4, zeleny1, zeleny2, zeleny3, zeleny4, modry1, modry2, modry3, modry4, zluty1, zluty2, zluty3, zluty4);

                    }


                }




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

