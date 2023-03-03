package hlavni;
import javax.swing.*;
import java.util.*;
import javax.swing.JFrame;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        program p = new program();
        JFrame okno = new JFrame("Člověče nezlob se!");
        okno.setContentPane(p.panel1);
        okno.setMinimumSize(new Dimension(500,500));
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.pack();
        okno.setVisible(true);
    }
}