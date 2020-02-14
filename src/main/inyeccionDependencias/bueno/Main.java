package main.inyeccionDependencias.bueno;

import main.inyeccionDependencias.Usuario;

public class Main {
    
    private static final ServicioUsuarios servicioUsuarios = new ServicioUsuarios();
    
    public static void main(String[] args) {
        servicioUsuarios.insertUsuario(new Usuario(
                "id-random",
                "pancho@gmail.com",
                "pancho.villa"
        ));
        
        servicioUsuarios.deleteUsuario("1");
        servicioUsuarios.deleteUsuario("4");
        
        servicioUsuarios.selectAllUsuarios().forEach(usuario -> {
            System.out.println(usuario);
            System.out.println("");
        });
    }
    
}
