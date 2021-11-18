package patron_strategy;

/**
 *
 * @author migue
 */
public class PropinaMuyGrande implements IPropina{
    //Esta propina se calcula del 15% del monto
    @Override
    public double pagarpropina(double monto) {
        return monto*0.15;
    }
}
