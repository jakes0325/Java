
package datos;

import java.sql.Connection;
import java.util.ArrayList;
import modelo.Marcas;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
public class MarcasDAO implements IDAO{
    
    Connection con;
    ArrayList<Marcas> lista = new ArrayList<>();
    Marcas marcasObj;
    PreparedStatement ps;

    public MarcasDAO() {
        con = new Conexion().conectar();
    }

    @Override
    public ArrayList listar() {
        try {
            String ssql = "SELECT * FROM  marcas ORDER BY nombre";
            ps = con.prepareStatement(ssql);
            ResultSet rs  = ps.executeQuery();
            while(rs.next()){
                marcasObj = new Marcas(rs.getInt("id"), rs.getString("nombre"));
                lista.add(marcasObj);
            }
            return lista;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "marcasdao"+ex.getMessage());
        }
        return null;
    }

    @Override
    public void insertar(Object obj) {
        
    }

    @Override
    public void modificar(Object obj) {
        
    }

    @Override
    public void eliminar(Object obj) {
       
    }
    
    
    
    
}
