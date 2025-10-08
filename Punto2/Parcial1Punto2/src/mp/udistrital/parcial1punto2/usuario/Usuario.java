package mp.udistrital.parcial1punto2.usuario;
import mp.udistrital.parcial1punto2.notificacion.INotificacionStrategy;

public abstract class Usuario {
    private INotificacionStrategy notificacion;
    
    public Usuario(){}
    
    public abstract void mostrarInfo();
    
    public void realizarTransaccion(){
        System.out.println("Transaccion realizada");
    }
}