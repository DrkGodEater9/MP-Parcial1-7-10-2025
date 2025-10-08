package mp.udistrital.parcial1punto2.alerta;

public class SinAlerta implements IAlertaStrategy {
    
    @Override
    public void alertar() {
        System.out.println("Sin alertas configuradas");
    }
}