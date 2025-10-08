package mp.udistrital.parcial1punto1.observer;

import mp.udistrital.parcial1punto1.model.Curso;
import mp.udistrital.parcial1punto1.subject.Publicador;

/**
 *
 * @author Estudiantes
 */
public class Webmaster implements Suscriptor {
    private String nombre;
    private String identificacion;
    private Curso cursoActual;
    private Publicador edco;
    
    public Webmaster(String nombre, String identificacion, Publicador edco) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edco = edco;
    }
    
    @Override
    public void actualizar(Curso curso) {
        this.cursoActual = curso;
    }
    
    public void darseDeBaja() {
        edco.removerSuscriptor(this);
        System.out.println("Webmaster " + nombre + " se ha dado de baja de EDCO.");
    }
    
    public void suscribirse() {
        edco.registrarSuscriptor(this);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getIdentificacion() {
        return identificacion;
    }
    
    public Curso getCursoActual() {
        return cursoActual;
    }
}