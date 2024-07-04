package Cajero_datos_quemados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame{
    private JButton accederButton;
    private JPasswordField password;
    private JPanel panel_acceso;

    public login(){
        super("Ventana de login");
        setContentPane(panel_acceso);

        accederButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String contra= "123456";
                char[] contraIngresadaChars = password.getPassword();
                String contraIngresada = new String(contraIngresadaChars);
                if (contra.equals(contraIngresada))
                {
                    cajero ventana_c = new cajero();
                    ventana_c.iniciar();
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"El usuario o contraseña es incorrecto");
                    password.setText("");

                }
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
