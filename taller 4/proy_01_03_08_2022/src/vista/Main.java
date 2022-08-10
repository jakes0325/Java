/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Personas;

/**
 *
 * @author Lab-II
 */
public class Main {
    public static void main (String[] args){
        Personas perso1 = new Personas(53, "Luis", "Gonzalez", "0973 522 222");
        
        
        String texto = "ID: " + perso1.getId()+ 
                "\nNombre: " + perso1.getNombre()+ 
                "\nApellido: " + perso1.getApellido();
        
        
        JOptionPane.showMessageDialog(null, texto);
    }
}
