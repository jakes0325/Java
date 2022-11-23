/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import java.sql.Connection;
import java.util.ArrayList;
import modelo.Celulares;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
/**
 *
 * @author Arq.Miguel
 */
public class CelularesDAO implements IDAO{
    Connection con;
    ArrayList<Celulares> lista= new ArrayList<>();
    Celulares celularesObj;
    PreparedStatement ps;

    public CelularesDAO() {
        con = new Conexion().conectar();
    }

    @Override
    public ArrayList listar() {
        try {
            String ssql="SELECT "
                    + "celulares.id, celulares.marcas_id, "
                    + "marcas.nombre, celulares.descripcion, "
                    + "celulares.precio, celulares.color, celulares.frecuencia, "
                    + "celulares.tamanho "
                    + "FROM celulares, marcas "
                    + "WHERE celulares.marcas_id=marcas.id "
                    + "ORDER BY descripcion";
            ps= con.prepareStatement(ssql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                celularesObj = new Celulares(
                        rs.getInt("id"), 
                        rs.getInt("marcas_id"), 
                        rs.getString("nombre"), 
                        rs.getString("descripcion"), 
                        rs.getInt("precio"), 
                        rs.getString("color"), 
                        rs.getInt("frecuencia"), 
                        rs.getString("tamanho")
                );
                lista.add(celularesObj);
            }
            return lista;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "celularesdao listar"+ ex.getMessage());
        }
       return null;
       
    }

    @Override
    public void insertar(Object obj) {
        
        try {
            celularesObj = (Celulares) obj;
            String ssql = "INSERT INTO celulares "
                    + "(marcas_id, descripcion, precio, color, frecuencia, tamanho) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(ssql);
            ps.setInt(1, celularesObj.getMarcasId());
            ps.setString(2, celularesObj.getDescripcion());
            ps.setInt(3, celularesObj.getPrecio());
            ps.setString(4, celularesObj.getColor());
            ps.setInt(5, celularesObj.getFrecuencia());
            ps.setString(6, celularesObj.getTamanho());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "se ha insertado con exito!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"celularesdao insertar"+ ex.getMessage());
        }
      
    }

    @Override
    public void modificar(Object obj) {
       
        try {
            celularesObj = (Celulares) obj;
            String ssql = "UPDATE celulares SET "
                    + "marcas_id=?, descripcion=?, precio=?, "
                    + "color=?, frecuencia=?, tamanho=? "
                    + "WHERE id=?";
            ps = con.prepareStatement(ssql);
            ps.setInt(1, celularesObj.getMarcasId());
            ps.setString(2, celularesObj.getDescripcion());
            ps.setInt(3, celularesObj.getPrecio());
            ps.setString(4, celularesObj.getColor());
            ps.setInt(5, celularesObj.getFrecuencia());
            ps.setString(6, celularesObj.getTamanho());
            ps.setInt(7, celularesObj.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "se ha modificado con exito!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "celularesdao modificar"+ex.getMessage());
        }
        
        
    }

    @Override
    public void eliminar(Object obj) {
        try {
            celularesObj = (Celulares) obj;
            String ssql = "DELETE FROM celulares WHERE id=?";
            ps = con.prepareStatement(ssql);
            ps.setInt(1, celularesObj.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "se ha eliminado con exito!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "celularesdao eliminar"+ex.getMessage());
        }
        
    }
     
    
    
}
