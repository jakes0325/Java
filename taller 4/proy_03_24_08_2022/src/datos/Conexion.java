
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    private String bd = "taller4_2022";
    private String url = "jdbc:postgresql://localhost:5432"+bd;
    private String user = "postgres";
    private String pass = "postgres";
    private String driver = "org.postgresql.Driver";
    
    private Connection conectar(){
        try {
            Connection link=null;
            Class.forName( driver );
            link = (Connection) DriverManager.getConnection(url, user, pass);
            return link;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }
}
