package hlavni;
import javax.swing.*;
import java.util.*;
import javax.swing.JFrame;
import java.awt.*;

class hrac {
    private int figurkyvpoli;
    private int figurkyvdomecku;

    public hrac(int figurkyvpoli, int figurkyvdomecku){
        this.figurkyvpoli = figurkyvpoli;
        this.figurkyvdomecku = figurkyvdomecku;
    }

    public int getFigurkyvpoli() {
        return figurkyvpoli;
    }

    public void setFigurkyvpoli(int figurkyvpoli) {
        this.figurkyvpoli = figurkyvpoli;
    }

    public int getFigurkyvdomecku() {
        return figurkyvdomecku;
    }

    public void setFigurkyvdomecku(int figurkyvdomecku) {
        this.figurkyvdomecku = figurkyvdomecku;
    }
}
class figurka {
    private int cislohrace;
    private int cislofigurky;
    public figurka(int cislohrace,int cislofigurky){
        this.cislohrace = cislohrace;
        this.cislofigurky = cislofigurky;
    }

    public int getCislohrace() {
        return cislohrace;
    }

    public void setCislohrace(int cislohrace) {
        this.cislohrace = cislohrace;
    }

    public int getCislofigurky() {
        return cislofigurky;
    }

    public void setCislofigurky(int cislofigurky) {
        this.cislofigurky = cislofigurky;
    }
}
public class Main {
    public static figurka[] policka = new figurka[40];
    public static hrac[] hraci = new hrac[4];
    public static void main(String[] args) {

        for(int i = 0; i < hraci.length; i++){
            int figurkavpoli = 0;
            int figurkavdomecku = 0;
            hraci[i] = new hrac(figurkavpoli,figurkavdomecku);
        }

        program p = new program();
        JFrame okno = new JFrame("Člověče nezlob se!");
        okno.setContentPane(p.panel1);
        okno.setMinimumSize(new Dimension(500,500));
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.pack();
        okno.setVisible(true);



    }
}