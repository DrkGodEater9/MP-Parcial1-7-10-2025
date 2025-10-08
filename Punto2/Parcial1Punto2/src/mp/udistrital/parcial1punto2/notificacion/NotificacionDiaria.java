package mp.udistrital.parcial1punto2.notificacion;

public class NotificacionDiaria implements INotificacionStrategy {
    
    @Override
    public void notificar() {
        System.out.println("Notificacion resumen diario");
    }
}