package hlavni;

import javax.swing.*;
import java.awt.event.*;

public class vyberfigurky extends JDialog {
    public JPanel contentPane;
    private JButton figurka1Button;
    private JButton figurka2Button;
    private JButton figurka3Button;
    private JButton figurka4Button;
    private JButton buttonOK;
    private JButton buttonCancel;

    public vyberfigurky() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        if(Main.hraci[program.hrajicihrac].getFigurkyvpoli() == 1){
            figurka2Button.setVisible(false);
            figurka3Button.setVisible(false);
            figurka4Button.setVisible(false);
        }else if(Main.hraci[program.hrajicihrac].getFigurkyvpoli() == 2){

            figurka3Button.setVisible(false);
            figurka4Button.setVisible(false);
        }else if(Main.hraci[program.hrajicihrac].getFigurkyvpoli() == 3){

            figurka4Button.setVisible(false);
        }else if(Main.hraci[program.hrajicihrac].getFigurkyvpoli() == 4) {
        }

        figurka1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("figurka 1");
                program.zvolenafigurka = 0;
                dispose();
            }
        });
        figurka2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("figurka 2");
                program.zvolenafigurka = 1;
                dispose();
            }
        });
        figurka3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("figurka 3");
                program.zvolenafigurka = 2;
                dispose();
            }
        });
        figurka4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("figurka 4");
                program.zvolenafigurka = 3;
                dispose();
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        vyberfigurky dialog = new vyberfigurky();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
