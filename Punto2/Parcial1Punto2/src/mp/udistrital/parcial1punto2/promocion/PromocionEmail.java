package mp.udistrital.parcial1punto2.promocion;

public class PromocionEmail implements IPromocionStrategy {
    
    @Override
    public void informarPromocion() {
        System.out.println("Promociones enviadas por correo electronico");
    }
}