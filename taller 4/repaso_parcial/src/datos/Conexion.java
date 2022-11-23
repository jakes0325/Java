/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;


import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Arq.Miguel
 */
public class Conexion {
    private String bd = "repaso";
    private String url = "jdbc:postgresql://localhost:5432/"+bd;
    private String user = "postgres";
    private String pass = "postgres";
    private String driver = "org.postgresql.Driver";
    
    public Connection conectar (){
        try {
            Connection link = null;
            Class.forName(driver);
            link = (Connection) DriverManager.getConnection(url, user, pass);
            return link;
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"conexion"+ ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"conexion"+ ex.getMessage());
        }
        
        return null;
    }
}
