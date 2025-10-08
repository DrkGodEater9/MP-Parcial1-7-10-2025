package mp.udistrital.parcial1punto2.control;

import mp.udistrital.parcial1punto2.notificacion.INotificacionStrategy;
import mp.udistrital.parcial1punto2.usuario.Usuario;
import mp.udistrital.parcial1punto2.usuario.UsuarioBasico;
import mp.udistrital.parcial1punto2.usuario.UsuarioPremium;
import mp.udistrital.parcial1punto2.usuario.UsuarioEmpresarial;
import mp.udistrital.parcial1punto2.notificacion.NotificacionPorTransaccion;

public class Launcher {

    public static void main(String[] args) {
        System.out.println(" - Sistema de notificaciones bancarias -");
        
        Usuario usuarioBasico = new UsuarioBasico();
        System.out.println("Usuario Basico:");
        ((UsuarioBasico) usuarioBasico).mostrarInfo();
        ((UsuarioBasico) usuarioBasico).performNotificar();
        ((UsuarioBasico) usuarioBasico).performAlertar();
        ((UsuarioBasico) usuarioBasico).performPromocion();
        
        System.out.println("");
        System.out.println("Otro usuario");
        System.out.println("");
        
        Usuario usuarioPremium = new UsuarioPremium();
        System.out.println("Usuario Premium:");
        ((UsuarioPremium) usuarioPremium).mostrarInfo();
        ((UsuarioPremium) usuarioPremium).performNotificar();
        ((UsuarioPremium) usuarioPremium).performAlertar();
        ((UsuarioPremium) usuarioPremium).performPromocion();
        
        System.out.println("");
        System.out.println("Otro usuario");
        System.out.println("");
        
        Usuario usuarioEmpresarial = new UsuarioEmpresarial();
        System.out.println("Usuario Empresarial:");
        ((UsuarioEmpresarial) usuarioEmpresarial).mostrarInfo();
        ((UsuarioEmpresarial) usuarioEmpresarial).performNotificar();
        ((UsuarioEmpresarial) usuarioEmpresarial).performAlertar();
        ((UsuarioEmpresarial) usuarioEmpresarial).performPromocion();
        
        System.out.println("");
        System.out.println("Cambiar el comportamiento dl primer usuario");
        System.out.println("");
        
        INotificacionStrategy notifTransaccion = new NotificacionPorTransaccion();
        ((UsuarioBasico) usuarioBasico).setNotificacion(notifTransaccion);
        ((UsuarioBasico) usuarioBasico).performNotificar();
    }
}