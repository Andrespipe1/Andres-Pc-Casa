package Cajero_datos_quemados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class retiro extends JFrame {
    private JPanel panel_retiro;
    private JTextField val_retiro;
    private JButton MENUButton;
    private JButton OKButton;
    private double saldo;

    public retiro(double saldoActual) {
        super("RETIRO");
        this.saldo = saldoActual;
        setContentPane(panel_retiro);

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
                    double retiro = Double.parseDouble(val_retiro.getText());
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        JOptionPane.showMessageDialog(null, "Retiro exitoso. Saldo actual: $" + saldo);
                    } else if (retiro > saldo) {
                        JOptionPane.showMessageDialog(null, "No tiene dinero :v");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese un monto válido para retirar.");
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
