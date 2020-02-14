package main.numerosMagicos.malo;

public class ValidadorContrasena {
    
    public static boolean validar(String contrasena) {
        if (contrasena.length() < 6) {
            return false;
        }
        
        if (contrasena.length() > 24) {
            return false;
        }
        
        for (char caracter : contrasena.toCharArray()) {
            if (caracter == '@' || caracter == '#' || caracter == '$' || caracter == '%' || caracter == '&') {
                return false;
            }
        }
        
        return true;
    }
}
