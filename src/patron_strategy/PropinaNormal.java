package patron_strategy;

/**
 *
 * @author migue
 */
public class PropinaNormal implements IPropina {
    //Esta propina se calcula del 5% del monto
    @Override
    public double pagarpropina(double monto) {
        return monto*0.05;
    }

    
}
