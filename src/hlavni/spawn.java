package hlavni;
import javax.swing.*;
public class spawn {
    public static void vratitfigurku(int hracnapolicku, int figurkanapolicku, JLabel cerveny1, JLabel cerveny2, JLabel cerveny3, JLabel cerveny4, JLabel zeleny1, JLabel zeleny2, JLabel zeleny3, JLabel zeleny4, JLabel modry1, JLabel modry2, JLabel modry3, JLabel modry4, JLabel zluty1,  JLabel zluty2,  JLabel zluty3, JLabel zluty4){
        Main.hraci[hracnapolicku].setFigurkyvpoli(Main.hraci[hracnapolicku].getFigurkyvpoli() - 1);
        switch(hracnapolicku){

            case 0:
                switch(figurkanapolicku){
                    case 0:
                        cerveny1.setIcon(new ImageIcon("src/images/cerveny.png"));
                    break;
                    case 1:
                        cerveny2.setIcon(new ImageIcon("src/images/cerveny.png"));
                        break;
                    case 2:
                        cerveny3.setIcon(new ImageIcon("src/images/cerveny.png"));
                        break;
                    case 3:
                        cerveny4.setIcon(new ImageIcon("src/images/cerveny.png"));
                        break;
                }
            break;
            case 1:
                switch(figurkanapolicku){
                    case 0:
                        zeleny1.setIcon(new ImageIcon("src/images/zeleny.png"));
                        break;
                    case 1:
                        zeleny2.setIcon(new ImageIcon("src/images/zeleny.png"));
                        break;
                    case 2:
                        zeleny3.setIcon(new ImageIcon("src/images/zeleny.png"));
                        break;
                    case 3:
                        zeleny4.setIcon(new ImageIcon("src/images/zeleny.png"));
                        break;
                }
                break;
            case 2:
                switch(figurkanapolicku){
                    case 0:
                        modry1.setIcon(new ImageIcon("src/images/modry.png"));
                        break;
                    case 1:
                        modry2.setIcon(new ImageIcon("src/images/modry.png"));
                        break;
                    case 2:
                        modry3.setIcon(new ImageIcon("src/images/modry.png"));
                        break;
                    case 3:
                        modry4.setIcon(new ImageIcon("src/images/modry.png"));
                        break;
                }
                break;
            case 3:
                switch(figurkanapolicku){
                    case 0:
                        zluty1.setIcon(new ImageIcon("src/images/zluty.png"));
                        break;
                    case 1:
                        zluty2.setIcon(new ImageIcon("src/images/zluty.png"));
                        break;
                    case 2:
                        zluty3.setIcon(new ImageIcon("src/images/zluty.png"));
                        break;
                    case 3:
                        zluty4.setIcon(new ImageIcon("src/images/zluty.png"));
                        break;
                }
                break;

        }
    }
        public static void spawnout(JLabel p1, JLabel p11, JLabel p21, JLabel p31, JLabel cerveny1, JLabel cerveny2, JLabel cerveny3, JLabel cerveny4, JLabel zeleny1, JLabel zeleny2, JLabel zeleny3, JLabel zeleny4, JLabel modry1, JLabel modry2, JLabel modry3, JLabel modry4, JLabel zluty1,  JLabel zluty2,  JLabel zluty3, JLabel zluty4) {
            int cislofigurky = 0;
            int cislohrace = 0;
            switch(program.hrajicihrac){
                case 0:
                    cislofigurky = Main.hraci[0].getFigurkyvpoli();
                    Main.hraci[0].setFigurkyvpoli(Main.hraci[0].getFigurkyvpoli() +1);
                    cislohrace = 0;
                    Main.policka[0] = new figurka(cislohrace,cislofigurky);
                    p1.setIcon(new ImageIcon("src/images/cervenyvcerveny.png"));
                    switch(cislofigurky){
                        case 0:
                            cerveny1.setIcon(new ImageIcon(""));
                            break;
                        case 1:
                            cerveny2.setIcon(new ImageIcon(""));
                            break;
                        case 2:
                            cerveny3.setIcon(new ImageIcon(""));
                            break;
                        case 3:
                            cerveny4.setIcon(new ImageIcon(""));
                            break;
                    }
                    break;
                case 1:
                    cislofigurky = Main.hraci[0].getFigurkyvpoli();
                    Main.hraci[0].setFigurkyvpoli(Main.hraci[0].getFigurkyvpoli() +1);
                    cislohrace = 0;
                    Main.policka[0] = new figurka(cislohrace,cislofigurky);
                    p1.setIcon(new ImageIcon("src/images/zelenyvzeleny.png"));
                    switch(cislofigurky){
                        case 0:
                            zeleny1.setIcon(new ImageIcon(""));
                            break;
                        case 1:
                            zeleny2.setIcon(new ImageIcon(""));
                            break;
                        case 2:
                            zeleny3.setIcon(new ImageIcon(""));
                            break;
                        case 3:
                            zeleny4.setIcon(new ImageIcon(""));
                            break;
                    }
                    break;

            }

        }
        public static void spawn(JLabel p1, JLabel p11, JLabel p21, JLabel p31, JLabel cerveny1, JLabel cerveny2, JLabel cerveny3, JLabel cerveny4, JLabel zeleny1, JLabel zeleny2, JLabel zeleny3, JLabel zeleny4, JLabel modry1, JLabel modry2, JLabel modry3, JLabel modry4, JLabel zluty1,  JLabel zluty2,  JLabel zluty3, JLabel zluty4){

        switch(program.hrajicihrac){

            case 0:
                if(Main.policka[0] == null){
                    spawnout(p1, p11, p21, p31, cerveny1, cerveny2, cerveny3, cerveny4, zeleny1, zeleny2, zeleny3, zeleny4, modry1, modry2, modry3, modry4, zluty1, zluty2, zluty3, zluty4);
                }else {
                    int hracnapolicku = Main.policka[0].getCislohrace();
                    int figurkanapolicku = Main.policka[0].getCislofigurky();
                    vratitfigurku(hracnapolicku,figurkanapolicku,  cerveny1, cerveny2, cerveny3, cerveny4, zeleny1, zeleny2, zeleny3, zeleny4, modry1, modry2, modry3, modry4, zluty1, zluty2, zluty3, zluty4);
                    Main.policka[0] = null;
                    spawnout(p1, p11, p21, p31, cerveny1, cerveny2, cerveny3, cerveny4, zeleny1, zeleny2, zeleny3, zeleny4, modry1, modry2, modry3, modry4, zluty1, zluty2, zluty3, zluty4);
                }
            break;


        }


    }
}
