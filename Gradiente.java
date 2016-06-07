package neuron;
import static java.lang.Math.pow;
import java.math.*;
/**
 *
 * @author nautec
 */
public class Gradiente {
    
    double x, y;
    
    public double devolveResultado(double x, double y){
        double aux = 0.0;
        aux = pow((x-2.0),2);
        aux+= pow((y-3.0),2);
        aux+= Math.sin(x) * Math.cos(y);
        return aux;
    }
    
    public double gradiente(){
        
        return 0.0;
    }
    
}
