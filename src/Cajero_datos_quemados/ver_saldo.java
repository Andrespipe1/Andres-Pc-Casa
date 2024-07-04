package Cajero_datos_quemados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ver_saldo extends JFrame {
    private JPanel panel_saldo;
    private JButton menuButton;
    private JLabel saldoLabel;

    public ver_saldo(double saldoActual) {
        super("VER SALDO");
        setContentPane(panel_saldo);
        saldoLabel.setText("$ "+saldoActual);

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cajero ventana_c = new cajero();
                ventana_c.iniciar();
                dispose();
            }
        });
    }

    public void iniciar() {
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
