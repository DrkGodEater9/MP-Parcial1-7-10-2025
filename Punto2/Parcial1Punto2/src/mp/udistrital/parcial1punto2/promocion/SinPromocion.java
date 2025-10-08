package mp.udistrital.parcial1punto2.promocion;

public class SinPromocion implements IPromocionStrategy {
    
    @Override
    public void informarPromocion() {
        System.out.println("No recibe promociones");
    }
}