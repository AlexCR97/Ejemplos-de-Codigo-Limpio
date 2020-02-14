package main.comentarios.bueno;

public class VariablesAleatorias {
    
    /**
     * Calcula un numero aleatorio dada una semilla inicial y el numero de iteraciones
     * @param semilla El numero inicial con el que comienza el algoritmo
     * @param iteraciones La cantidad de iteraciones para calcular el numero aleatorio
     * @return Un numero aleatorio entre 0 y 1
     */
    public static double cuadradosMedios(int semilla, int iteraciones) {
        int siguienteSemilla;
        double random = 0;
        
        for (int i = 0; i < iteraciones; i++) {
            siguienteSemilla = semilla * semilla;
            
            if (siguienteSemilla == 0)
                return -1;
            
            semilla = medios(siguienteSemilla);
            
            random = semilla / 10000.0;
        }
        
        return random;
    }
    
    /**
     * Obtiene un numero formado por los 4 digitos medios del numero dado
     * @param numero El numero del cual se van a extraer los 4 digitos medios
     * @return Los 4 digitos medios del numero dado
     */
    private static int medios(int numero) {
        String numeroString = String.valueOf(numero);
        
        // En caso de no tener 4 digitos medios, agregar un cero al inicio del numero
        if (numeroString.length() % 2 != 0) {
            numeroString = "0" + String.valueOf(numero);
        }
        
        // reducir hasta que sean 4 digitos
        while (numeroString.length() != 4) {
            numeroString = numeroString.substring(1, numeroString.length() - 1);
        }
        
        return Integer.parseInt(numeroString);
    }
}
