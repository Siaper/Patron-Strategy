package patron_strategy;

/**
 *
 * @author migue
 */
public class Contexto {
    
    IPropina Ipropina;
    
    //Asignacion de que estrategia usar
    public Contexto(IPropina propina){
        this.Ipropina=propina;
    }
    
    //Ejecucion de la estrategia
    public double PagarPropina(double monto){
       return Ipropina.pagarpropina(monto);
    }
}
