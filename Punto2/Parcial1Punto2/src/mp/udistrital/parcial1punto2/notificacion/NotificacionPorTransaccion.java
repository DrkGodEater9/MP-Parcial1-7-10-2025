package mp.udistrital.parcial1punto2.notificacion;

public class NotificacionPorTransaccion implements INotificacionStrategy {
    
    @Override
    public void notificar() {
        System.out.println("Notificacion por cada transaccion");
    }
}