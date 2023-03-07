package hlavni;
import javax.swing.*;
public class posun {
    public static void posun(JLabel p1, JLabel p2, JLabel p3, JLabel p4, JLabel p5, JLabel p6, JLabel p7, JLabel p8, JLabel p9, JLabel p10, JLabel p11, JLabel p12, JLabel p13, JLabel p14, JLabel p15, JLabel p16, JLabel p17, JLabel p18, JLabel p19, JLabel p20, JLabel p21, JLabel p22, JLabel p23, JLabel p24, JLabel p25, JLabel p26, JLabel p27, JLabel p28, JLabel p29, JLabel p30, JLabel p31, JLabel p32, JLabel p33, JLabel p34, JLabel p35, JLabel p36, JLabel p37, JLabel p38, JLabel p39, JLabel p40,  JLabel cerveny1, JLabel cerveny2, JLabel cerveny3, JLabel cerveny4, JLabel zeleny1, JLabel zeleny2, JLabel zeleny3, JLabel zeleny4, JLabel modry1, JLabel modry2, JLabel modry3, JLabel modry4, JLabel zluty1,  JLabel zluty2,  JLabel zluty3, JLabel zluty4){
        int hledanypole = 0;
        for(int i = 0; i < Main.policka.length;i++){
           if(Main.policka[i] != null) {
               if(Main.policka[i].getCislohrace() == program.hrajicihrac){
                if (Main.policka[i].getCislofigurky() == program.zvolenafigurka) {
                    hledanypole = i;
                }
               }
           }
        }
        Main.policka[hledanypole] = null;
        // METODA VYMAZÁNÍ NA POLÍČKU HLEDANYPOLE
        int soucet = hledanypole+program.hozeno;
        if(Main.policka[soucet] != null){
            int hracnapolicku = Main.policka[soucet].getCislohrace();
            int figurkanapolicku = Main.policka[soucet].getCislofigurky();
            spawn.vratitfigurku(hracnapolicku,figurkanapolicku, cerveny1, cerveny2, cerveny3, cerveny4, zeleny1, zeleny2, zeleny3, zeleny4, modry1, modry2, modry3, modry4, zluty1, zluty2, zluty3, zluty4);
        }
        //METODA PŘIDÁNÍ FIGURKY NA POLÍČKO SOUCET

    }
}
