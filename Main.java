package neuron;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Neuron neuronio1 = new Neuron();
        neuronio1.treinaNeuronio();
        neuronio1.leEntrada();
    }
    
}
