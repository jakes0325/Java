
package modelo;

public class Alumnos {
    private Integer id;
    private String nombre;
    private String apellido;
    private String matricula;
    private String ci;

    public Alumnos(Integer id, String nombre, String apellido, String matricula, String ci) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.ci = ci;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCi() {
        return ci;
    }
    
    public String toString() {
        return "Alumnos{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", matricula=" + matricula + ", ci=" + ci + '}';
    }
    
    
    
    
    
    
    
    
    
}
