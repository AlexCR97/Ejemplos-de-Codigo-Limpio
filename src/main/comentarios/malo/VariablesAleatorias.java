package main.comentarios.malo;

public class VariablesAleatorias {
    
    public static double cuadradosMedios(int semilla, int iteraciones) {
        int siguienteSemilla;
        double random = 0;
        
        // hacemos cada una de las iteraciones
        for (int i = 0; i < iteraciones; i++) {
            
            // elevamos al cuadrado la semilla y la asignamos a la siguiente semilla
            siguienteSemilla = semilla * semilla;
            
            // si el cuadrado es igual a 0, entonces salir del metodo
            if (siguienteSemilla == 0)
                return -1;
            
            // obtenemos los 4 medios de la semila actual
            semilla = medios(siguienteSemilla);
            
            // generamos el primer numero aleatorio
            random = semilla / 10000.0;
        }
        
        // finalmente, retornamos el numero aleatorio.
        return random;
    }
    
    private static int medios(int numero) {
        
        // convertimos el numero a un string
        String numeroString = String.valueOf(numero);
        
        // En caso de no tener 4 digitos medios, agregar un cero al inicio del numero
        if (numeroString.length() % 2 != 0) {
            numeroString = "0" + String.valueOf(numero);
        }
        
        // reducir hasta que sean 4 digitos
        while (numeroString.length() != 4) {
            numeroString = numeroString.substring(1, numeroString.length() - 1);
        }
        
        // finalmente, retornamos los digitos medios convirtiendolos en int
        return Integer.parseInt(numeroString);
    }
}
