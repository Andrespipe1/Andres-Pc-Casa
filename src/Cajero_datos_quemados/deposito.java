package Cajero_datos_quemados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deposito extends JFrame {
    private JTextField val_deposito;
    private JPanel panel_deposito;
    private JButton MENUButton;
    private JButton OKButton;

    public deposito(){
        super("VER SALDO");
        setContentPane(panel_deposito);
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cajero ventana_c = new cajero();
                ventana_c.iniciar();
                dispose();
            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double saldo=2000.53;


            }
        });
    }

    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
