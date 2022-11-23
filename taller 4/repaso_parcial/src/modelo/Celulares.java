
package modelo;

/**
 *
 * @author Arq.Miguel
 */
public class Celulares extends Electronicos {
    
    private Integer frecuencia;
    private String tamanho;

    public Celulares(Integer id) {
        super(id);
    }
    
    

    public Celulares(
            Integer id,
            Integer marcasId,
            String marcasdescr,
            String descripcion,
            Integer precio,
            String color,
            Integer frecuencia,
            String tamanho
    ) {
        super(id, marcasId, marcasdescr, descripcion, precio, color);
        this.frecuencia = frecuencia;
        this.tamanho = tamanho;
    }

    public Integer getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Integer frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    
    
}
