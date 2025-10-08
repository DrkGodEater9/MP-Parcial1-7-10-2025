package mp.udistrital.parcial1punto2.notificacion;

public class NotificacionSemanal implements INotificacionStrategy {
    
    @Override
    public void notificar() {
        System.out.println("Notificacion resumen semanal");
    }
}