package hlavni;

import javax.swing.*;

public class hrajici {
    public static void hrajici(JLabel labelhrac){
        program.hrajicihrac++;
        if(program.hrajicihrac >= 4){
            program.hrajicihrac = 0;
        }
        switch(program.hrajicihrac){
            case 0:
                labelhrac.setText("Hraje červený hráč");
            break;
            case 1:
                labelhrac.setText("Hraje zelený hráč");
                break;
            case 2:
                labelhrac.setText("Hraje modrý hráč");
                break;
            case 3:
                labelhrac.setText("Hraje žlutý hráč");
                break;

        }

    }
}
