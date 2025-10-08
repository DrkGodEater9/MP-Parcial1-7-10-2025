package mp.udistrital.parcial1punto2.usuario;

import mp.udistrital.parcial1punto2.notificacion.INotificacionStrategy;
import mp.udistrital.parcial1punto2.notificacion.NotificacionPorTransaccion;
import mp.udistrital.parcial1punto2.alerta.IAlertaStrategy;
import mp.udistrital.parcial1punto2.alerta.AlertaSaldoBajo;
import mp.udistrital.parcial1punto2.promocion.IPromocionStrategy;
import mp.udistrital.parcial1punto2.promocion.PromocionSMS;

public class UsuarioPremium extends Usuario {
    
    private INotificacionStrategy notificacion = new NotificacionPorTransaccion();
    private IAlertaStrategy alerta = new AlertaSaldoBajo();
    private IPromocionStrategy promocion = new PromocionSMS();
    
    @Override
    public void mostrarInfo() {
        System.out.println("Usuario Premium");
    }
    
    public void performNotificar(){
        notificacion.notificar();
    }
    
    public void performAlertar(){
        alerta.alertar();
    }
    
    public void performPromocion(){
        promocion.informarPromocion();
    }
    
    public void setNotificacion(INotificacionStrategy notificacion){
        this.notificacion = notificacion;
    }
    
    public void setAlerta(IAlertaStrategy alerta){
        this.alerta = alerta;
    }
    
    public void setPromocion(IPromocionStrategy promocion){
        this.promocion = promocion;
    }
}