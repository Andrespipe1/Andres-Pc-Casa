package Cajero_datos_quemados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class retiro extends JFrame{
    private JPanel panel_retiro;
    private JTextField val_retiro;
    private JButton MENUButton;
    private JButton OKButton;

    public retiro(){
        super("Ventana de login");
        setContentPane(panel_retiro);

        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cajero ventana_c = new cajero();
                ventana_c.iniciar();
                dispose();
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
