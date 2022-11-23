
package modelo;


public abstract class Electronicos {
    private Integer id;
    private Integer marcasId;
    private String marcasdescr;
    private String descripcion;
    private Integer precio;
    private String color;

    public Electronicos(Integer id) {
        this.id = id;
    }

    public Electronicos(Integer id, Integer marcasId, 
            String marcasdescr, String descripcion, 
            Integer precio, String color) {
        this.id = id;
        this.marcasId = marcasId;
        this.marcasdescr = marcasdescr;
        this.descripcion = descripcion;
        this.precio = precio;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMarcasId() {
        return marcasId;
    }

    public void setMarcasId(Integer marcasId) {
        this.marcasId = marcasId;
    }

    public String getMarcasdescr() {
        return marcasdescr;
    }

    public void setMarcasdescr(String marcasdescr) {
        this.marcasdescr = marcasdescr;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
}
