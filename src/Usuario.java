public class Usuario {
    private String nombre;
    private String contrasena;
    private Rol rol;

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.rol = asignarRolPorDefecto(nombre);
    }

    private Rol asignarRolPorDefecto(String nombre) {
        if ("admin".equals(nombre)) {
            return new Rol("Administrador");
        } else {
            return new Rol("Empleado");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public boolean verificarContrasena(String contrasena) {
        return this.contrasena.equals(contrasena);
    }

    public Rol getRol() {
        return rol;
    }
}