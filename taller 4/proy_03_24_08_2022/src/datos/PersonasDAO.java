
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Personas;


public class PersonasDAO implements IDAO {
    
    Connection con = null;
    ArrayList<Personas> lista = new ArrayList<>();
    Personas personaobj = null;
    PreparedStatement ps;

    public PersonasDAO() {
        con = new Conexion()
                
    }
   
    
    /* 
    interface IDAO
    
    listar      =    select
    insertar    =    insert
    modificar   =    update
    eliminar    =    delete
    
    */

    @Override
    public ArrayList listar() {
        
        try {
            String ssql = " SELECT * FROM personas";
            ps = con.prepareStatement(ssql);
            ResultSet rs = ps.executeQuery();
            while (rs .next()) {                
                
                personaobj = new Personas( 
                        rs.getInt("id"), 
                        rs.getString("nombre"), 
                        rs.getString("apellido"), 
                        rs.getInt("edad"), 
                        rs.getString("telefono"));
                lista.add(personaobj);
                
            }
            return lista;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }

    @Override
    public void insertar( Object obj ) {
        try {
            personaobj = (Personas) obj;
            String ssql = "INSERT INTO personas "
                + "(nombre, apellido, edad, telefono) "
                + " VALUES"
                + "(?, ?, ?, ?)";
        
            ps = con.prepareStatement(ssql);
            ps.setString(1, personaobj.getNombre());
            ps.setString(2, personaobj.getApellido());
            ps.setInt(3, personaobj.getEdad());
            ps.setString(4, personaobj.getTelefono());
            ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        
        
        
    }

    @Override
    public void modificar() {
        
    }

    @Override
    public void eliminar() {
        
    }
    
    
}
