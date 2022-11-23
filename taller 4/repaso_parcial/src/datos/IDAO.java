/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author Arq.Miguel
 */
public interface IDAO {
    public ArrayList listar();
    public void insertar( Object obj );
    public void modificar( Object obj );
    public void eliminar( Object obj );
}
