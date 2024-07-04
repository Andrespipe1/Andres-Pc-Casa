package Cajero_datos_quemados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cajero extends JFrame{
    private JPanel panel_cajero;
    private JRadioButton verSaldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton salirRadioButton;

    public cajero() {
        super("Cajero EPN");
        setContentPane(panel_cajero);

        verSaldoRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ver_saldo saldo  = new ver_saldo();
                saldo.iniciar();
                dispose();
            }
        });
        retiroRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                retiro retiro1 = new retiro();
                retiro1.iniciar();
                dispose();
            }
        });
        depositoRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                deposito deposito1 = new deposito();
                deposito1.iniciar();
                dispose();
            }
        });

        salirRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }


    public void iniciar(){
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
