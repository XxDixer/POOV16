import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GestorUsuarios {
    private static final String ARCHIVO_USUARIOS = "C:/mi_programa/usuarios.dat";
    private Map<String, String> usuarios;

    public GestorUsuarios() {
        usuarios = new HashMap<>();
        cargarUsuarios();
    }

    public void registrarUsuario(String nombreUsuario, String contrasena) {
        if (usuarios.containsKey(nombreUsuario)) {
            System.out.println("El usuario ya existe. Intenta con otro nombre.");
        } else {
            usuarios.put(nombreUsuario, contrasena);
            guardarUsuarios();
            System.out.println("Usuario " + nombreUsuario + " registrado con éxito.");
        }
    }

    public void eliminarUsuario(String nombreUsuario) {
        if (usuarios.containsKey(nombreUsuario)) {
            usuarios.remove(nombreUsuario);
            guardarUsuarios();
            System.out.println("Usuario " + nombreUsuario + " eliminado con éxito.");
        } else {
            System.out.println("El usuario no existe.");
        }
    }

    public void modificarUsuario(String nombreUsuario, String nuevaContrasena) {
        if (usuarios.containsKey(nombreUsuario)) {
            usuarios.put(nombreUsuario, nuevaContrasena);
            guardarUsuarios();
            System.out.println("Contraseña de " + nombreUsuario + " actualizada con éxito.");
        } else {
            System.out.println("El usuario no existe.");
        }
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            System.out.println("Usuarios registrados:");
            for (String usuario : usuarios.keySet()) {
                System.out.println("- " + usuario);
            }
        }
    }

    public boolean validarCredenciales(String nombreUsuario, String contrasena) {
        return usuarios.containsKey(nombreUsuario) && usuarios.get(nombreUsuario).equals(contrasena);
    }


    private void guardarUsuarios() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARCHIVO_USUARIOS))) {
            out.writeObject(usuarios);
        } catch (IOException e) {
            System.out.println("Error al guardar usuarios: " + e.getMessage());
        }
    }

    public void cargarUsuarios() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARCHIVO_USUARIOS))) {
            usuarios = (Map<String, String>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se encontraron datos previos. Iniciando con un HashMap vacío.");
        }
    }
}
