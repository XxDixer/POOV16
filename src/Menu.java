import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private final GestorUsuarios gestorUsuarios = new GestorUsuarios();
    private final UsuarioManagerProfesional usuarioManager = new UsuarioManagerProfesional(); // Declaración correcta de la clase

    public void iniciar() throws IOException {
        System.out.print("Nombre de usuario: ");
        String nombreUsuario = br.readLine().trim();
        System.out.print("Contraseña: ");
        String contrasena = br.readLine().trim();

        if (nombreUsuario.isEmpty() || contrasena.isEmpty()) {
            System.out.println("El nombre de usuario y la contraseña no pueden estar vacíos.");
            return;
        }

        if (usuarioManager.login(nombreUsuario, contrasena)) {
            String rolActual = usuarioManager.obtenerRolActual();
            if (usuarioManager.esAdministrador()) {
                mostrarMenuAdministrador();
            } else {
                System.out.println("Bienvenido, " + nombreUsuario + " (Rol: " + rolActual + ")");
                mostrarMenuPorRol(rolActual);
            }
        } else {
            System.out.println("Credenciales incorrectas. Acceso denegado.");
        }
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
            case "Contador":
            case "Recursos Humanos":
            case "Diseñador":
                menuRolBase(rol);
                break;
            case "Empleado":
                menuEmpleado();
                break;
            default:
                System.out.println("Rol desconocido. Acceso denegado.");
        }
    }

    private void menuCEO() throws IOException {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenú de CEO:");
            System.out.println("1) Asignar Tareas a Todos");
            System.out.println("2) Ver Reportes Globales");
            System.out.println("3) Salir");

            int opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:
                    System.out.println("Asignando tareas a todos los empleados...");
                    break;
                case 2:
                    System.out.println("Mostrando reportes globales...");
                    break;
                case 3:
                    System.out.println("Saliendo del menú de CEO...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Menú para el Gerente
    private void menuGerente() throws IOException {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenú de Gerente:");
            System.out.println("1) Supervisar Proyectos");
            System.out.println("2) Asignar Tareas a Coordinadores");
            System.out.println("3) Salir");

            int opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:
                    System.out.println("Supervisando proyectos...");
                    break;
                case 2:
                    System.out.println("Asignando tareas a coordinadores...");
                    break;
                case 3:
                    System.out.println("Saliendo del menú de Gerente...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Menú para el Coordinador
    private void menuCoordinador() throws IOException {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenú de Coordinador:");
            System.out.println("1) Gestionar Calendarios");
            System.out.println("2) Asignar Tareas a Subordinados");
            System.out.println("3) Salir");

            int opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:
                    System.out.println("Gestionando calendarios...");
                    break;
                case 2:
                    System.out.println("Asignando tareas...");
                    break;
                case 3:
                    System.out.println("Saliendo del menú de Coordinador...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private void menuRolBase(String rol) throws IOException {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenú de " + rol + ":");
            System.out.println("1) Asignar Tareas");
            System.out.println("2) Ver Progreso de Tareas");
            System.out.println("3) Salir");

            int opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:
                    System.out.println("Asignando tareas...");
                    break;
                case 2:
                    System.out.println("Viendo progreso de tareas...");
                    break;
                case 3:
                    System.out.println("Saliendo del menú de " + rol + "...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private void menuEmpleado() throws IOException {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenú de Empleado:");
            System.out.println("1) Ver Tareas Pendientes");
            System.out.println("2) Marcar Tareas Realizadas");
            System.out.println("3) Salir");

            int opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:
                    System.out.println("Viendo tareas pendientes...");
                    break;
                case 2:
                    System.out.println("Marcando tareas realizadas...");
                    break;
                case 3:
                    System.out.println("Saliendo del menú de Empleado...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public void mostrarMenuAdministrador() throws IOException {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nBienvenido al menú de administrador. Selecciona una opción:");
            System.out.println("1) Gestionar Usuarios");
            System.out.println("2) Gestionar Roles");
            System.out.println("3) Gestionar Tareas/Proyectos");
            System.out.println("4) Configuración del Sistema");
            System.out.println("5) Reportes y Auditorías");
            System.out.println("6) Salir");

            try {
                int opcion = Integer.parseInt(br.readLine());
                switch (opcion) {
                    case 1 -> gestionarUsuarios();
                    case 2 -> gestionarRoles();
                    case 3 -> gestionarTareas();
                    case 4 -> configurarSistema();
                    case 5 -> generarReportes();
                    case 6 -> {
                        System.out.println("Saliendo del menú de administrador...");
                        continuar = false;
                    }
                    default -> System.out.println("Opción no válida. Por favor selecciona una opción entre 1 y 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número válido.");
            }
        }
    }

    // Métodos para gestionar usuarios, roles, tareas y demás opciones
    private void gestionarUsuarios() throws IOException {
        System.out.println("Opciones de Gestión de Usuarios:");
        System.out.println("1) Registrar Usuario");
        System.out.println("2) Eliminar Usuario");
        System.out.println("3) Modificar Usuario");
        System.out.println("4) Ver Lista de Usuarios");

        try {
            int opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1 -> registrarUsuario();
                case 2 -> eliminarUsuario();
                case 3 -> modificarUsuario();
                case 4 -> verListaUsuarios();
                default -> System.out.println("Opción no válida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa un número válido.");
        }
    }

    // Métodos auxiliares para registrar, eliminar, modificar y listar usuarios
    private void registrarUsuario() throws IOException {
        System.out.print("Introduce el nombre del nuevo usuario: ");
        String nombre = br.readLine().trim();
        System.out.print("Introduce la contraseña: ");
        String contrasena = br.readLine().trim();
        System.out.print("Introduce el rol (CEO, Gerente, etc.): ");
        String rol = br.readLine().trim();

        usuarioManager.agregarUsuario(nombre, contrasena, rol);
    }

    private void eliminarUsuario() throws IOException {
        System.out.print("Introduce el nombre del usuario a eliminar: ");
        String nombreUsuario = br.readLine().trim();
        gestorUsuarios.eliminarUsuario(nombreUsuario);
    }

    private void modificarUsuario() throws IOException {
        System.out.print("Introduce el nombre del usuario a modificar: ");
        String nombreUsuario = br.readLine().trim();
        System.out.print("Introduce la nueva contraseña para el usuario: ");
        String nuevaContrasena = br.readLine().trim();
        gestorUsuarios.modificarUsuario(nombreUsuario, nuevaContrasena);
    }

    private void verListaUsuarios() {
        gestorUsuarios.listarUsuarios();
    }
    // Gestión de roles
    private void gestionarRoles() throws IOException {
        System.out.println("Opciones de Gestión de Roles:");
        System.out.println("1) Crear Rol");
        System.out.println("2) Asignar Rol a Usuario");
        System.out.println("3) Modificar Permisos de Rol");
        System.out.println("4) Ver Roles Existentes");

        try {
            int opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1 -> crearRol();
                case 2 -> asignarRol();
                case 3 -> modificarPermisosRol();
                case 4 -> listarRoles();
                default -> System.out.println("Opción no válida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa un número válido.");
        }
    }

    private void crearRol() throws IOException {
        System.out.print("Introduce el nombre del nuevo rol: ");
        String nombreRol = br.readLine().trim();
        // Lógica para crear un rol
        System.out.println("Rol '" + nombreRol + "' creado con éxito.");
    }

    private void asignarRol() throws IOException {
        System.out.print("Introduce el nombre del usuario al que deseas asignar un rol: ");
        String nombreUsuario = br.readLine().trim();
        System.out.print("Introduce el nombre del rol que deseas asignar: ");
        String nombreRol = br.readLine().trim();
        // Lógica para asignar el rol al usuario
        System.out.println("Rol '" + nombreRol + "' asignado a " + nombreUsuario + " con éxito.");
    }

    private void modificarPermisosRol() throws IOException {
        System.out.print("Introduce el nombre del rol a modificar: ");
        String nombreRol = br.readLine().trim();
        // Lógica para modificar permisos del rol
        System.out.println("Permisos del rol '" + nombreRol + "' actualizados con éxito.");
    }

    private void listarRoles() {
        // Lógica para listar los roles
        System.out.println("Lista de roles existentes:");
        System.out.println("- CEO");
        System.out.println("- Gerente");
        System.out.println("- Coordinador");
        System.out.println("- Contador");
        System.out.println("- Recursos Humanos");
        System.out.println("- Diseñador");
        System.out.println("- Empleado");
    }

    // Gestión de tareas
    private void gestionarTareas() throws IOException {
        System.out.println("Opciones de Gestión de Tareas:");
        System.out.println("1) Crear Tarea");
        System.out.println("2) Asignar Tarea");
        System.out.println("3) Modificar Tarea");
        System.out.println("4) Ver Lista de Tareas");

        try {
            int opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1 -> crearTarea();
                case 2 -> asignarTarea();
                case 3 -> modificarTarea();
                case 4 -> listarTareas();
                default -> System.out.println("Opción no válida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa un número válido.");
        }
    }

    private void crearTarea() throws IOException {
        System.out.print("Introduce el nombre de la nueva tarea: ");
        String nombreTarea = br.readLine().trim();
        // Lógica para crear la tarea
        System.out.println("Tarea '" + nombreTarea + "' creada con éxito.");
    }

    private void asignarTarea() throws IOException {
        System.out.print("Introduce el nombre de la tarea a asignar: ");
        String nombreTarea = br.readLine().trim();
        System.out.print("Introduce el nombre del usuario asignado: ");
        String nombreUsuario = br.readLine().trim();
        // Lógica para asignar la tarea al usuario
        System.out.println("Tarea '" + nombreTarea + "' asignada a " + nombreUsuario + " con éxito.");
    }

    private void modificarTarea() throws IOException {
        System.out.print("Introduce el nombre de la tarea a modificar: ");
        String nombreTarea = br.readLine().trim();
        System.out.print("Introduce los nuevos detalles de la tarea: ");
        String nuevosDetalles = br.readLine().trim();
        // Lógica para modificar los detalles de la tarea
        System.out.println("Tarea '" + nombreTarea + "' actualizada con éxito.");
    }

    private void listarTareas() {
        // Lógica para listar tareas
        System.out.println("Lista de tareas:");
        System.out.println("- Tarea1: En progreso");
        System.out.println("- Tarea2: Completada");
    }

    // Configuración del sistema
    private void configurarSistema() throws IOException {
        System.out.println("Opciones de Configuración del Sistema:");
        System.out.println("1) Cambiar Configuraciones Globales");
        System.out.println("2) Modificar Reglas del Sistema");

        try {
            int opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1 -> cambiarConfiguracionesGlobales();
                case 2 -> modificarReglasSistema();
                default -> System.out.println("Opción no válida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa un número válido.");
        }
    }

    private void cambiarConfiguracionesGlobales() throws IOException {
        System.out.print("Introduce la nueva configuración global: ");
        String nuevaConfig = br.readLine().trim();
        // Lógica para cambiar configuraciones globales
        System.out.println("Configuración global actualizada a: " + nuevaConfig);
    }

    private void modificarReglasSistema() throws IOException {
        System.out.print("Introduce las nuevas reglas del sistema: ");
        String nuevasReglas = br.readLine().trim();
        // Lógica para modificar las reglas
        System.out.println("Reglas del sistema actualizadas a: " + nuevasReglas);
    }

    // Generar reportes
    private void generarReportes() throws IOException {
        System.out.println("Opciones de Reportes y Auditorías:");
        System.out.println("1) Generar Reporte de Actividad");
        System.out.println("2) Exportar Informes");

        try {
            int opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1 -> generarReporteActividad();
                case 2 -> exportarInformes();
                default -> System.out.println("Opción no válida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa un número válido.");
        }
    }

    private void generarReporteActividad() {
        // Lógica para generar reporte de actividad
        System.out.println("Reporte de actividad generado con éxito.");
    }

    private void exportarInformes() {
     // Lógica para exportar informes
     System.out.println("Informes exportados con éxito.");
 }
}