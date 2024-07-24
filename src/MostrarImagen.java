package imagenes;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MostrarImagen {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/imagenes";
        String user="root";
        String password="";

        String query = "SELECT nombre, imagen FROM imagenes WHERE id = ?";
        int idImagen = 2;

        try (Connection conexion = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = conexion.prepareStatement(query)) {

            ps.setInt(1, idImagen);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Blob blob = rs.getBlob("imagen");
                byte[] data = blob.getBytes(1, (int) blob.length());

                ByteArrayInputStream bais = new ByteArrayInputStream(data);
                Image imagen = ImageIO.read(bais);

                JFrame frame = new JFrame();
                JPanel panel = new JPanel();
                JLabel label = new JLabel(new ImageIcon(imagen));
                panel.add(label);
                frame.add(panel);
                frame.setSize(400, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

