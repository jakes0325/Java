
package controlador;

import datos.IDAO;
import datos.PersonasDAO;
import java.util.ArrayList;


public class PersonasControl implements IDAO {

    @Override
    public ArrayList listar() {
        return new PersonasDAO().listar();
    }

    @Override
    public void insertar() {
        
    }

    @Override
    public void modificar() {
        
    }

    @Override
    public void eliminar() {
        
    }
    
    
    
    
}
