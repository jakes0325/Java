/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import datos.IDAO;
import datos.MarcasDAO;
import java.util.ArrayList;

/**
 *
 * @author Arq.Miguel
 */
public class MarcasControl implements IDAO{

    @Override
    public ArrayList listar() {
     return new MarcasDAO().listar();
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
