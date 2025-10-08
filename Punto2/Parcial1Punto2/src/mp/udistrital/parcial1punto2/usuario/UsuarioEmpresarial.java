package mp.udistrital.parcial1punto2.usuario;

import mp.udistrital.parcial1punto2.notificacion.INotificacionStrategy;
import mp.udistrital.parcial1punto2.notificacion.NotificacionSemanal;
import mp.udistrital.parcial1punto2.alerta.IAlertaStrategy;
import mp.udistrital.parcial1punto2.alerta.SinAlerta;
import mp.udistrital.parcial1punto2.promocion.IPromocionStrategy;
import mp.udistrital.parcial1punto2.promocion.SinPromocion;

public class UsuarioEmpresarial extends Usuario {
    
    private INotificacionStrategy notificacion = new NotificacionSemanal();
    private IAlertaStrategy alerta = new SinAlerta();
    private IPromocionStrategy promocion = new SinPromocion();
    
    @Override
    public void mostrarInfo() {
        System.out.println("Usuario Empresarial");
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