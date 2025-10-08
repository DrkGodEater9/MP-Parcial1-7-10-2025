package mp.udistrital.parcial1punto1.subject;

import mp.udistrital.parcial1punto1.observer.Suscriptor;

/**
 *
 * @author Estudiantes
 */
public interface Publicador {
    public void registrarSuscriptor(Suscriptor suscriptor);
    public void removerSuscriptor(Suscriptor suscriptor);
    public void notificarSuscriptores();
}
