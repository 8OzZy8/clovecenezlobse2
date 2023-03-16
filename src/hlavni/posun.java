package hlavni;
import javax.swing.*;
public class posun {
    public static void smazani(int hledanypole,JLabel p1, JLabel p2, JLabel p3, JLabel p4, JLabel p5, JLabel p6, JLabel p7, JLabel p8, JLabel p9, JLabel p10, JLabel p11, JLabel p12, JLabel p13, JLabel p14, JLabel p15, JLabel p16, JLabel p17, JLabel p18, JLabel p19, JLabel p20, JLabel p21, JLabel p22, JLabel p23, JLabel p24, JLabel p25, JLabel p26, JLabel p27, JLabel p28, JLabel p29, JLabel p30, JLabel p31, JLabel p32, JLabel p33, JLabel p34, JLabel p35, JLabel p36, JLabel p37, JLabel p38, JLabel p39, JLabel p40){
        switch(hledanypole){

            case 0:
                p1.setIcon(new ImageIcon("src/images/cervenyhome.png"));
                break;

            case 1:
                p2.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 2:
                p3.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 3:
                p4.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 4:
                p5.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 5:
                p6.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 6:
                p7.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 7:
                p8.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 8:
                p9.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 9:
                p10.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 10:
                p11.setIcon(new ImageIcon("src/images/zelenyhome.png"));
                break;

            case 11:
                p12.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 12:
                p13.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 13:
                p14.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 14:
                p15.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 15:
                p16.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 16:
                p17.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 17:
                p18.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 18:
                p19.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 19:
                p20.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 20:
                p21.setIcon(new ImageIcon("src/images/modryhome.png"));
                break;

            case 21:
                p22.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 22:
                p23.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 23:
                p24.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 24:
                p25.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 25:
                p26.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 26:
                p27.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 27:
                p28.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 28:
                p29.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 29:
                p30.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 30:
                p31.setIcon(new ImageIcon("src/images/zlutyhome.png"));
                break;

            case 31:
                p32.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 32:
                p33.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 33:
                p34.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 34:
                p35.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 35:
                p36.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 36:
                p37.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 37:
                p38.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 38:
                p39.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

            case 39:
                p40.setIcon(new ImageIcon("src/images/prazdnypolicko.png"));
                break;

        }
    }
    public static void pridani(int soucet,JLabel p1, JLabel p2, JLabel p3, JLabel p4, JLabel p5, JLabel p6, JLabel p7, JLabel p8, JLabel p9, JLabel p10, JLabel p11, JLabel p12, JLabel p13, JLabel p14, JLabel p15, JLabel p16, JLabel p17, JLabel p18, JLabel p19, JLabel p20, JLabel p21, JLabel p22, JLabel p23, JLabel p24, JLabel p25, JLabel p26, JLabel p27, JLabel p28, JLabel p29, JLabel p30, JLabel p31, JLabel p32, JLabel p33, JLabel p34, JLabel p35, JLabel p36, JLabel p37, JLabel p38, JLabel p39, JLabel p40){
        switch(soucet){
            case 0:
                switch(program.hrajicihrac){
                    case 0:
                        p1.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p1.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p1.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p1.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 1:
                switch(program.hrajicihrac){
                    case 0:
                        p2.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p2.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p2.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p2.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 2:
                switch(program.hrajicihrac){
                    case 0:
                        p3.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p3.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p3.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p3.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 3:
                switch(program.hrajicihrac){
                    case 0:
                        p4.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p4.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p4.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p4.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 4:
                switch(program.hrajicihrac){
                    case 0:
                        p5.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p5.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p5.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p5.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 5:
                switch(program.hrajicihrac){
                    case 0:
                        p6.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p6.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p6.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p6.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 6:
                switch(program.hrajicihrac){
                    case 0:
                        p7.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p7.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p7.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p7.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 7:
                switch(program.hrajicihrac){
                    case 0:
                        p8.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p8.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p8.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p8.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 8:
                switch(program.hrajicihrac){
                    case 0:
                        p9.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p9.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p9.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p9.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 9:
                switch(program.hrajicihrac){
                    case 0:
                        p10.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p10.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p10.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p10.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 10:
                switch(program.hrajicihrac){
                    case 0:
                        p11.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p11.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p11.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p11.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 11:
                switch(program.hrajicihrac){
                    case 0:
                        p12.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p12.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p12.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p12.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 12:
                switch(program.hrajicihrac){
                    case 0:
                        p13.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p13.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p13.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p13.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 13:
                switch(program.hrajicihrac){
                    case 0:
                        p14.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p14.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p14.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p14.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 14:
                switch(program.hrajicihrac){
                    case 0:
                        p15.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p15.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p15.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p15.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 15:
                switch(program.hrajicihrac){
                    case 0:
                        p16.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p16.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p16.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p16.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 16:
                switch(program.hrajicihrac){
                    case 0:
                        p17.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p17.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p17.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p17.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 17:
                switch(program.hrajicihrac){
                    case 0:
                        p18.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p18.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p18.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p18.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 18:
                switch(program.hrajicihrac){
                    case 0:
                        p19.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p19.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p19.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p19.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 19:
                switch(program.hrajicihrac){
                    case 0:
                        p20.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p20.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p20.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p20.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 20:
                switch(program.hrajicihrac){
                    case 0:
                        p21.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p21.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p21.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p21.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 21:
                switch(program.hrajicihrac){
                    case 0:
                        p22.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p22.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p22.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p22.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 22:
                switch(program.hrajicihrac){
                    case 0:
                        p23.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p23.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p23.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p23.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 23:
                switch(program.hrajicihrac){
                    case 0:
                        p24.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p24.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p24.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p24.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 24:
                switch(program.hrajicihrac){
                    case 0:
                        p25.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p25.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p25.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p25.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 25:
                switch(program.hrajicihrac){
                    case 0:
                        p26.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p26.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p26.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p26.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 26:
                switch(program.hrajicihrac){
                    case 0:
                        p27.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p27.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p27.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p27.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 27:
                switch(program.hrajicihrac){
                    case 0:
                        p28.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p28.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p28.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p28.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 28:
                switch(program.hrajicihrac){
                    case 0:
                        p29.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p29.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p29.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p29.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 29:
                switch(program.hrajicihrac){
                    case 0:
                        p30.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p30.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p30.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p30.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 30:
                switch(program.hrajicihrac){
                    case 0:
                        p31.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p31.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p31.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p31.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 31:
                switch(program.hrajicihrac){
                    case 0:
                        p32.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p32.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p32.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p32.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 32:
                switch(program.hrajicihrac){
                    case 0:
                        p33.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p33.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p33.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p33.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 33:
                switch(program.hrajicihrac){
                    case 0:
                        p34.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p34.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p34.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p34.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 34:
                switch(program.hrajicihrac){
                    case 0:
                        p35.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p35.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p35.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p35.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 35:
                switch(program.hrajicihrac){
                    case 0:
                        p36.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p36.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p36.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p36.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 36:
                switch(program.hrajicihrac){
                    case 0:
                        p37.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p37.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p37.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p37.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 37:
                switch(program.hrajicihrac){
                    case 0:
                        p38.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p38.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p38.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p38.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 38:
                switch(program.hrajicihrac){
                    case 0:
                        p39.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p39.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p39.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p39.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;

            case 39:
                switch(program.hrajicihrac){
                    case 0:
                        p40.setIcon(new ImageIcon("src/images/cervenypolicko.png"));
                        break;
                    case 1:
                        p40.setIcon(new ImageIcon("src/images/zelenypolicko.png"));
                        break;
                    case 2:
                        p40.setIcon(new ImageIcon("src/images/modrypolicko.png"));
                        break;
                    case 3:
                        p40.setIcon(new ImageIcon("src/images/zlutypolicko.png"));
                        break;
                }
                break;
        }
    }
    public static void posun(JLabel p1, JLabel p2, JLabel p3, JLabel p4, JLabel p5, JLabel p6, JLabel p7, JLabel p8, JLabel p9, JLabel p10, JLabel p11, JLabel p12, JLabel p13, JLabel p14, JLabel p15, JLabel p16, JLabel p17, JLabel p18, JLabel p19, JLabel p20, JLabel p21, JLabel p22, JLabel p23, JLabel p24, JLabel p25, JLabel p26, JLabel p27, JLabel p28, JLabel p29, JLabel p30, JLabel p31, JLabel p32, JLabel p33, JLabel p34, JLabel p35, JLabel p36, JLabel p37, JLabel p38, JLabel p39, JLabel p40,  JLabel cerveny1, JLabel cerveny2, JLabel cerveny3, JLabel cerveny4, JLabel zeleny1, JLabel zeleny2, JLabel zeleny3, JLabel zeleny4, JLabel modry1, JLabel modry2, JLabel modry3, JLabel modry4, JLabel zluty1,  JLabel zluty2,  JLabel zluty3, JLabel zluty4){
        int hledanypole = 0;


        for(int i = 0; i < Main.policka.length;i++){
           if(Main.policka[i] != null) {
               System.out.println("i: " + i);
               System.out.println("cisloh: " + Main.policka[i].getCislohrace());
               System.out.println("cisloF: " + Main.policka[i].getCislofigurky());
               if(Main.policka[i].getCislohrace() == program.hrajicihrac){
                if (Main.policka[i].getCislofigurky() == program.zvolenafigurka) {
                    hledanypole = i;
                    System.out.println("hledaný pole: " + hledanypole);
                }else {
                    System.out.println("zvolenafig: " + program.zvolenafigurka);
                    System.out.println("hracfig v poli: " + Main.hraci[program.hrajicihrac].getFigurkyvpoli());
                    System.out.println("nenalezeno");
                }
               }else {
                   System.out.println("nen");
               }
           }
        }
        int soucet = hledanypole+program.hozeno;
        if(soucet > 39){
            soucet = soucet-40;
            System.out.println("soucet: " + soucet);
        }
        Main.policka[hledanypole] = null;
        smazani(hledanypole,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p30,p31,p32,p33,p34,p35,p36,p37,p38,p39,p40);

        if(Main.policka[soucet] != null){
            int hracnapolicku = Main.policka[soucet].getCislohrace();
            int figurkanapolicku = Main.policka[soucet].getCislofigurky();
            spawn.vratitfigurku(hracnapolicku,figurkanapolicku, cerveny1, cerveny2, cerveny3, cerveny4, zeleny1, zeleny2, zeleny3, zeleny4, modry1, modry2, modry3, modry4, zluty1, zluty2, zluty3, zluty4);
            Main.policka[soucet] = null;
        }else {

        }
        Main.policka[soucet] = new figurka(program.hrajicihrac,program.zvolenafigurka);
        pridani(soucet,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p30,p31,p32,p33,p34,p35,p36,p37,p38,p39,p40);

    }
}
