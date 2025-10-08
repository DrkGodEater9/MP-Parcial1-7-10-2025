package mp.udistrital.parcial1punto1.model;

/**
 *
 * @author Estudiantes
 */
public class Curso {
    private String titulo;
    private String descripcion;
    private String categoria;
    private int duracion;
    private String instructor;
    
    public Curso(String titulo, String descripcion, String categoria, int duracion, String instructor) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.duracion = duracion;
        this.instructor = instructor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public String getInstructor() {
        return instructor;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                ", duracion=" + duracion + " horas" +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}
