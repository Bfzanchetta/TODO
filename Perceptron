package neuron;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Breno Zanchetta
 */
public class Neuron {

    public static void main(String[] args) {
        List<Double> x = new ArrayList<>();
        List<Double> w = new ArrayList<>();
        List<Double> y = new ArrayList<>();
        List<Double> b = new ArrayList<>();
        
        double erro = 0.0;
        double desejado = 1.0;
        double alfa = 0.5;
        
        for(int i=0; i<1000; i++){
            for(int j=0; j<1000; j++){
                y.add(i, (x.get(j) * w.get(j)) + b.get(j));
            }
            System.out.println("Iteracao ="+ i+ " com valor calculado: "+ y.get(i));
            //Atualiza os pesos e os bias
            erro = desejado - y.get(i);
            for(int j=0; j<1000; j++){
                w.add(i+1, w.get(i) + (alfa * erro * x.get(j)));
                b.add(i+1, b.get(i) + alfa * erro);
            }
        }
    }
}
