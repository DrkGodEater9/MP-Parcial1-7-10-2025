package mp.udistrital.parcial1punto2.alerta;

public class AlertaSaldoBajo implements IAlertaStrategy {
    
    @Override
    public void alertar() {
        System.out.println("Alerta: Saldo bajo");
    }
}