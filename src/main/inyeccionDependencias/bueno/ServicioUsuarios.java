package main.inyeccionDependencias.bueno;

import java.util.List;
import main.inyeccionDependencias.BaseDatos;
import main.inyeccionDependencias.Usuario;

public class ServicioUsuarios {
    
    public List<Usuario> selectAllUsuarios() {
        return BaseDatos.usuarios;
    }
    
    public void insertUsuario(Usuario usuario) {
        BaseDatos.usuarios.add(usuario);
    }
    
    public void deleteUsuario(String id) {
        BaseDatos.usuarios.removeIf(usuario -> {
            return usuario.getId().equals(id);
        });
    }
    
}
