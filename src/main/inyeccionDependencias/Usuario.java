package main.inyeccionDependencias;

public class Usuario {
    
    private String id;
    private String correo;
    private String contrasena;

    public Usuario(String id, String correo, String contrasena) {
        this.id = id;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", correo=" + correo + ", contrasena=" + contrasena + '}';
    }
}
