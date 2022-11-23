/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import datos.CelularesDAO;
import datos.IDAO;
import java.util.ArrayList;

/**
 *
 * @author Arq.Miguel
 */
public class CelularesControl implements IDAO{

    @Override
    public ArrayList listar() {
     return new CelularesDAO().listar();
    }

    @Override
    public void insertar(Object obj) {
        new CelularesDAO().insertar(obj);
    }

    @Override
    public void modificar(Object obj) {
        new CelularesDAO().modificar(obj);
    }

    @Override
    public void eliminar(Object obj) {
        new CelularesDAO().eliminar(obj);
    }
    
}
