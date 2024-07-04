package Cajero_datos_quemados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deposito extends JFrame {
    private JTextField val_deposito;
    private JPanel panel_deposito;
    private JButton MENUButton;
    private JButton OKButton;
    private double saldo;

    public deposito(double saldoActual) {
        super("DEPÓSITO");
        this.saldo = saldoActual;
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
                try {
                    double deposito = Double.parseDouble(val_deposito.getText());
                    if (deposito > 0) {
                        saldo += deposito;
                        JOptionPane.showMessageDialog(null, "Depósito exitoso. Saldo actual: $" + saldo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese un monto válido para depositar.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido.");
                }
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
