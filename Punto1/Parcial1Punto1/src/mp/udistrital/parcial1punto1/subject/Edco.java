package mp.udistrital.parcial1punto1.subject;

/**
 *
 * @author Estudiantes
 */
import mp.udistrital.parcial1punto1.subject.Publicador;
import java.util.ArrayList;
import java.util.List;
import mp.udistrital.parcial1punto1.model.Curso;
import mp.udistrital.parcial1punto1.observer.Suscriptor;

public class Edco implements Publicador {
    private List<Suscriptor> suscriptores = new ArrayList<Suscriptor>();
    private Curso cursoActual;
    
    @Override
    public void registrarSuscriptor(Suscriptor suscriptor) {
        suscriptores.add(suscriptor);
        System.out.println("Nuevo usuario suscrito a EDCO");
    }

    @Override
    public void removerSuscriptor(Suscriptor suscriptor) {
        suscriptores.remove(suscriptor);
        System.out.println("Un usuario se ha dado de baja de EDCO");
    }

    @Override
    public void notificarSuscriptores() {
        for (Suscriptor suscriptor : suscriptores) {
            suscriptor.actualizar(cursoActual);
        }
        mostrarNotificacionNuevoCurso();
    }
    
    public void publicarNuevoCurso(String titulo, String descripcion, String categoria, int duracion, String instructor) {
        this.cursoActual = new Curso(titulo, descripcion, categoria, duracion, instructor);
        notificarSuscriptores();
    }
    
    public void publicarNuevoCurso(Curso curso) {
        this.cursoActual = curso;
        notificarSuscriptores();
    }
    
    private void mostrarNotificacionNuevoCurso() {
        System.out.println("");
        System.out.println("-NUEVO CURSO DISPONIBLE EN EDCO -");
        System.out.println("Titulo: " + cursoActual.getTitulo());
        System.out.println("Descripcion: " + cursoActual.getDescripcion());
        System.out.println("Categoria: " + cursoActual.getCategoria());
        System.out.println("Duracion: " + cursoActual.getDuracion() + " horas");
        System.out.println("Instructor: " + cursoActual.getInstructor());
        System.out.println("Todos los usuarios suscritos han sido notificados!");
        System.out.println("");
    }
    
    public Curso getCursoActual() {
        return cursoActual;
    }
    
    public int contarSuscriptores() {
        return suscriptores.size();
    }
}
