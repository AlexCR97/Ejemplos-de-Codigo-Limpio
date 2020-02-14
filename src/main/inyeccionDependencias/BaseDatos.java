package main.inyeccionDependencias;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {
    
    public static final List<Usuario> usuarios = new ArrayList<>();
    static {
        usuarios.add(new Usuario("1", "ale@live.com", "12345"));
        usuarios.add(new Usuario("2", "uriel@live.com", "54321"));
        usuarios.add(new Usuario("3", "adriana@live.com", "abcde"));
        usuarios.add(new Usuario("4", "andres@live.com", "edcba"));
    }
    
}
