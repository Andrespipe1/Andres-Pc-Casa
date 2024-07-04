package Cajero_datos_quemados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cajero extends JFrame {
    private JPanel panel_cajero;
    private JRadioButton verSaldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton salirRadioButton;
    private double saldo; // Saldo actual

    public cajero() {
        super("Cajero EPN");
        saldo = 2000.53; // Saldo inicial de ejemplo
        setContentPane(panel_cajero);

        verSaldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ver_saldo saldoVentana = new ver_saldo(saldo);
                saldoVentana.iniciar();
                dispose();
            }
        });

        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retiro retiroVentana = new retiro(saldo);
                retiroVentana.iniciar();
                dispose();
            }
        });

        depositoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito depositoVentana = new deposito(saldo);
                depositoVentana.iniciar();
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

    public void iniciar() {
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
