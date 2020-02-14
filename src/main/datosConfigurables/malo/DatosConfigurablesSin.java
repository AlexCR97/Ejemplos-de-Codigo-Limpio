package main.datosConfigurables.malo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class DatosConfigurablesSin {
    
    public List<Integer> generarNumerosAleatoriosEnRango() {
        List<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            int random = ThreadLocalRandom.current().nextInt(1, 10) + 1;
            numeros.add(random);
        }
        
        return numeros;
    }
    
}
