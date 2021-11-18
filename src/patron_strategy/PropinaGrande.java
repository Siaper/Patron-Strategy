package patron_strategy;

/**
 *
 * @author migue
 */
public class PropinaGrande implements IPropina{
     //Esta propina se calcula del 10% del monto
    @Override
    public double pagarpropina(double monto) {
        return monto*0.1;
    }
}
