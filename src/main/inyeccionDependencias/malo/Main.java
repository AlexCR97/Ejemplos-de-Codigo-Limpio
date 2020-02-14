package main.inyeccionDependencias.malo;

import main.inyeccionDependencias.BaseDatos;
import main.inyeccionDependencias.Usuario;

public class Main {
    
    public static void agregarUsuario(Usuario usuario) {
        BaseDatos.usuarios.add(usuario);
    }
    
    public static void eliminarUsuario(String id) {
        BaseDatos.usuarios.removeIf(usuario -> {
            return usuario.getId().equals(id);
        });
    }
    
    public static void mostrarUsuario() {
        BaseDatos.usuarios.forEach(usuario -> {
            System.out.println(usuario);
            System.out.println("");
        });
    }
    
    public static void main(String[] args) {
        agregarUsuario(new Usuario(
                "id-random",
                "pancho@gmail.com",
                "pancho.villa"
        ));
        
        eliminarUsuario("1");
        eliminarUsuario("4");
        
        mostrarUsuario();
    }
}
