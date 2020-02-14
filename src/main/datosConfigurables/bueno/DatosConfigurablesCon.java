package main.datosConfigurables.bueno;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class DatosConfigurablesCon {
    
    private int cantidadNumeros = 10;
    private int rangoMinimo = 1;
    private int rangoMaximo = 10;
    
    public List<Integer> generarNumerosAleatoriosEnRango() {
        List<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; i < cantidadNumeros; i++) {
            int random = ThreadLocalRandom.current().nextInt(rangoMinimo, rangoMaximo) + 1;
            numeros.add(random);
        }
        
        return numeros;
    }
    
}
