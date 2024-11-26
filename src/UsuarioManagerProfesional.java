import java.io.*;
import java.util.*;

public class UsuarioManagerProfesional {
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Agregado aquí
    private Map<String, String> usuarios;
    private List<Empleado> empleados;
    private String usuarioActual;

    public UsuarioManagerProfesional() {
        usuarios = new HashMap<>();
        empleados = new ArrayList<>();
        cargarDatos();
    }

    public void mostrarMenuPorRol(String rol) throws IOException {
        switch (rol) {
            case "CEO":
                menuCEO();
                break;
            case "Gerente":
                menuGerente();
                break;
            case "Coordinador":
                menuCoordinador();
                break;
            case "Empleado":
                menuEmpleado();
                break;
            case "Contador":
            case "Recursos Humanos":
            case "Diseñador":
                menuRolBase(rol);
                break;
            default:
                System.out.println("Rol desconocido. Acceso denegado.");
        }
    }

    private void menuCEO() throws IOException {
        System.out.println("Menú de CEO:");
        System.out.println("1) Asignar tareas a cualquier empleado");
        System.out.println("2) Ver todas las tareas asignadas");
        System.out.println("3) Ver reportes");
        System.out.println("4) Salir");

        int opcion = Integer.parseInt(br.readLine());

        switch (opcion) {
            case 1:
                System.out.print("Introduce el nombre del empleado: ");
                String empleadoNombre = br.readLine().trim();
                System.out.print("Introduce la tarea a asignar: ");
                String tarea = br.readLine().trim();
                System.out.println("Tarea '" + tarea + "' asignada a " + empleadoNombre + " con éxito.");
                break;

            case 2:
                System.out.println("Mostrando todas las tareas asignadas a los empleados...");
                // Implementar lógica para mostrar tareas de todos
                break;

            case 3:
                System.out.println("Mostrando reportes generales...");
                break;

            case 4:
                System.out.println("Saliendo del menú de CEO...");
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
    private void menuGerente() throws IOException {
        System.out.println("Menú de Gerente:");
        System.out.println("1) Asignar tareas a subordinados");
        System.out.println("2) Ver tareas de subordinados");
        System.out.println("3) Ver reportes específicos");
        System.out.println("4) Salir");

        int opcion = Integer.parseInt(br.readLine());

        switch (opcion) {
            case 1:
                System.out.print("Introduce el nombre del subordinado: ");
                String subordinadoNombre = br.readLine().trim();
                System.out.print("Introduce la tarea a asignar: ");
                String tarea = br.readLine().trim();
                System.out.println("Tarea '" + tarea + "' asignada a " + subordinadoNombre + " con éxito.");
                break;

            case 2:
                System.out.println("Mostrando tareas asignadas a los subordinados...");
                // Implementar lógica para mostrar tareas asignadas a subordinados
                break;

            case 3:
                System.out.println("Mostrando reportes específicos de su departamento...");
                break;

            case 4:
                System.out.println("Saliendo del menú de Gerente...");
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
    private void menuCoordinador() throws IOException {
        System.out.println("Menú de Coordinador:");
        System.out.println("1) Asignar tareas a su equipo");
        System.out.println("2) Ver tareas de su equipo");
        System.out.println("3) Salir");

        int opcion = Integer.parseInt(br.readLine());

        switch (opcion) {
            case 1:
                System.out.print("Introduce el nombre del integrante del equipo: ");
                String equipoNombre = br.readLine().trim();
                System.out.print("Introduce la tarea a asignar: ");
                String tarea = br.readLine().trim();
                System.out.println("Tarea '" + tarea + "' asignada a " + equipoNombre + " con éxito.");
                break;

            case 2:
                System.out.println("Mostrando tareas asignadas a los integrantes del equipo...");
                // Implementar lógica para mostrar tareas del equipo
                break;

            case 3:
                System.out.println("Saliendo del menú de Coordinador...");
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
    private void menuRolBase(String rol) throws IOException {
        System.out.println("Menú de " + rol + ":");
        System.out.println("1) Asignar tareas");
        System.out.println("2) Ver tareas asignadas");
        System.out.println("3) Consultar reportes internos");
        System.out.println("4) Salir");

        int opcion = Integer.parseInt(br.readLine());

        switch (opcion) {
            case 1:
                System.out.print("Introduce el nombre del subordinado: ");
                String subordinadoNombre = br.readLine().trim();
                System.out.print("Introduce la tarea a asignar: ");
                String tarea = br.readLine().trim();
                System.out.println("Tarea '" + tarea + "' asignada a " + subordinadoNombre + " con éxito.");
                break;

            case 2:
                System.out.println("Mostrando tareas asignadas...");
                // Implementar lógica para mostrar las tareas asignadas por este rol
                break;

            case 3:
                System.out.println("Consultando reportes internos...");
                // Implementar lógica para consultar reportes internos
                break;

            case 4:
                System.out.println("Saliendo del menú de " + rol + "...");
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }

    private void menuEmpleado() throws IOException {
        System.out.println("Menú de Empleado:");
        System.out.println("1) Ver mis tareas");
        System.out.println("2) Marcar tarea como realizada");
        System.out.println("3) Salir");

        int opcion = Integer.parseInt(br.readLine());

        switch (opcion) {
            case 1:
                System.out.println("Mostrando tus tareas asignadas...");
                // Implementar lógica para mostrar tareas asignadas al empleado
                break;

            case 2:
                System.out.print("Introduce el nombre de la tarea realizada: ");
                String tareaRealizada = br.readLine().trim();
                System.out.println("Tarea '" + tareaRealizada + "' marcada como realizada.");
                // Implementar lógica para marcar tarea como realizada
                break;

            case 3:
                System.out.println("Saliendo del menú de Empleado...");
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }


    public boolean verificarUsuario(String nombre, String contrasena) {
        return usuarios.containsKey(nombre) && usuarios.get(nombre).equals(contrasena);
    }

    public boolean login(String nombre, String contrasena) {
        if (verificarUsuario(nombre, contrasena)) {
            usuarioActual = nombre;
            return true;
        }
        return false;
    }

    public boolean esAdministrador() {
        return "admin".equals(usuarioActual);
    }

    public void gestionarUsuarios() {
        System.out.println("Gestión de usuarios:");
        // Aquí puedes implementar la lógica para gestionar usuarios
    }

    public void guardarDatos() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("usuarios.dat"))) {
            out.writeObject(empleados);
        } catch (IOException e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void cargarDatos() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("usuarios.dat"))) {
            usuarios = (Map<String, String>) in.readObject();
            System.out.println("Usuarios cargados exitosamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se encontraron datos previos. Iniciando con valores vacíos.");
            usuarios = new HashMap<>();
        }
    }
    public String obtenerRolActual() {
        for (Empleado empleado : empleados) {
            if (empleado.nombre.equals(usuarioActual)) {
                return empleado.getClass().getSimpleName(); // Devuelve el nombre de la clase (CEO, Gerente, etc.)
            }
        }
        return "Empleado"; // Valor por defecto
    }

    public void agregarUsuario(String nombre, String contrasena, String rol) {
    }


    static class Empleado implements Serializable {
        String nombre;

        public Empleado(String nombre) {
            this.nombre = nombre;
        }

        public void verTareasAsignadas() {
            System.out.println(nombre + " está viendo sus tareas asignadas.");
        }

        public void subirEntregables() {
            System.out.println(nombre + " está subiendo entregables.");
        }
    }

    static class CEO extends Empleado {
        public CEO(String nombre) {
            super(nombre);
        }

        public void asignarTareas() {
            System.out.println(nombre + " está asignando tareas.");
        }
    }

    static class Gerente extends Empleado {
        public Gerente(String nombre) {
            super(nombre);
        }

        public void supervisarProyectos() {
            System.out.println(nombre + " está supervisando proyectos.");
        }
    }

    static class Coordinador extends Empleado {
        public Coordinador(String nombre) {
            super(nombre);
        }

        public void gestionarCalendario() {
            System.out.println(nombre + " está gestionando el calendario.");
        }
    }

    static class Contador extends Empleado {
        public Contador(String nombre) {
            super(nombre);
        }

        public void gestionarPresupuesto() {
            System.out.println(nombre + " está gestionando el presupuesto.");
        }
    }

    static class RecursosHumanos extends Empleado {
        public RecursosHumanos(String nombre) {
            super(nombre);
        }

        public void administrarEmpleados() {
            System.out.println(nombre + " está administrando empleados.");
        }
    }

    static class Diseñador extends Empleado {
        public Diseñador(String nombre) {
            super(nombre);
        }

        public void crearDiseño() {
            System.out.println(nombre + " está creando un diseño.");
        }
    }
}