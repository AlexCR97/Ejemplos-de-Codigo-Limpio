package main.numerosMagicos.bueno;

import java.util.HashSet;
import java.util.Set;

public class ValidadorContrasena {
    
    public static final int LONGITUD_MIN = 6;
    public static final int LONGITUD_MAX = 24;
    public static final Set<Character> CARACTERES_PROHIBIDOS = new HashSet<>();
    static {
        CARACTERES_PROHIBIDOS.add('@');
        CARACTERES_PROHIBIDOS.add('#');
        CARACTERES_PROHIBIDOS.add('$');
        CARACTERES_PROHIBIDOS.add('%');
        CARACTERES_PROHIBIDOS.add('&');
    }
    
    public static boolean validar(String contrasena) {
        if (contrasena.length() < LONGITUD_MIN) {
            return false;
        }
        
        if (contrasena.length() > LONGITUD_MAX) {
            return false;
        }
        
        for (char caracter : contrasena.toCharArray()) {
            if (CARACTERES_PROHIBIDOS.contains(caracter)) {
                return false;
            }
        }
        
        return true;
    }
}
