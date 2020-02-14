package main.numerosMagicos.bueno;

import java.util.Arrays;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List<String> contrasenas = Arrays.asList(
                "123456",
                "12&$56",
                "123"
        );
        
        contrasenas.forEach(contrasena -> {
            System.out.println(contrasena + ": " + ValidadorContrasena.validar(contrasena));
        });
    }
}
