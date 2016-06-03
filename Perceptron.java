package neuron;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Breno Zanchetta
 */
public class Neuron {

    public static void main(String[] args){
        ArrayList<Double> x = new ArrayList<>(10);
        ArrayList<Double> w = new ArrayList<>(10);
        ArrayList<Double> y = new ArrayList<>(10);
        ArrayList<Double> b = new ArrayList<>(10);
        
        //Preenchendo o Array x com valores de entrada
        for(int i=0; i<10; i++){
            x.add((double)(i));
            System.out.println(x.get(i));
        }
        
        //Preenchendo o Array w com valores aleatorios entre 0 e 1
        for(int i=0; i<10; i++){
            w.add(Math.random());
            System.out.println(w.get(i));
        }
        
        //Preenchendo o Array de bias com valores aleatorios entre 0 e 0.2
        for(int i=0; i<10; i++){
            b.add(Math.random()*0.2);
            System.out.println(b.get(i));
        }
        
        
        double resultado = 0.0;
        double erro = 0.0;
        double desejado = 1.0;
        double alfa = 0.5;
        
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                resultado += (x.get(j) * w.get(j)) + b.get(j);
                //y.add(i, (x.get(j) * w.get(j)) + b.get(j));
            }
            System.out.println("RESULTADO: "+ resultado);
            System.out.println("Iteracao ="+ i+ " com valor calculado: "+ y.get(i));
            //Atualiza os pesos e os bias
            erro = desejado - y.get(i);
            for(int j=0; j<10; j++){
                w.add(i+1, w.get(i) + (alfa * erro * x.get(j)));
                b.add(i+1, b.get(i) + alfa * erro);
            }
        }
    }
}
