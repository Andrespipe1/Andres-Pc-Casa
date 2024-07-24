package imagenes;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GuardarImagen {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/imagenes";
        String user="root";
        String password="";

        String rutaImagen = "C:/Users/Andres/Pictures/noti.png";
        String nombreImagen = "noti.png";

        try (Connection conexion = DriverManager.getConnection(url, user, password);
             FileInputStream fis = new FileInputStream(new File(rutaImagen))) {

            String sql = "INSERT INTO imagenes (nombre, imagen) VALUES (?, ?)";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombreImagen);
            ps.setBinaryStream(2, fis, (int) new File(rutaImagen).length());

            int filasInsertadas = ps.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Imagen guardada correctamente.");
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
