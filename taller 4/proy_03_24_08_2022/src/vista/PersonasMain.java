
package vista;

import controlador.PersonasControl;
import java.util.ArrayList;
import modelo.Personas;

public class PersonasMain {
    
    public static void main(String[] args) {
        
        PersonasControl personasControl = new PersonasControl();
        
        ArrayList<Personas> lista = personasControl.listar();
        
        for ( int i=0; i<lista.size(); i++){
            System.out.println(
                    lista.get(i).getNombre()+" "+lista.get(i).getApellido()      
            );
        }
        
        
        
    }
    
}
