package modelo;
public class Personas {
    Integer id;
    String nombre;
    String apellido;
    String telefono;
    //Personas persona = new Personas();
    public Personas(
            Integer id,
            String nombre,
            String apellido,
            String telefono){    
        this.id = id;
        this.nombre= nombre;
        this.apellido = apellido;
        this.telefono= telefono;
        
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    } 
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setTelefono (String telefono){
        this.telefono=telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }  
}
