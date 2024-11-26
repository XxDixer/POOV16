import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaProfesional {
    private Usuario usuario;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public AreaProfesional(Usuario usuario) {
        this.usuario = usuario;
    }

    public void showOptions() throws IOException {
        System.out.println("Bienvenido al área profesional, " + usuario.getNombre());
        System.out.println("Selecciona una opción:");

        String opciones =
                """
                        1) CEO/Director General
                        2) Gerente
                        3) Coordinador
                        4) Contador
                        5) Recursos Humanos
                        6) Diseñador
                        7) Empleado
                        8) Salir
                """;
        System.out.print(opciones);

        int choice = Integer.parseInt(br.readLine());
        seleccionarOpcion(choice);
    }

    private void seleccionarOpcion(int choice) throws IOException {
        switch (choice) {
            case 1:
                accesoCEO();
                break;
            case 2:
                accesoGerente();
                break;
            case 3:
                accesoCoordinador();
                break;
            case 4:
                accesoContador();
                break;
            case 5:
                accesoRecursosHumanos();
                break;
            case 6:
                accesoDiseñador();
                break;
            case 7:
                accesoEmpleado();
                break;
            case 8:
                System.out.println("Saliendo del área profesional...");
                break;
            default:
                System.out.println("Opción no válida. Por favor selecciona una opción entre 1 y 8.");
                showOptions(); // Volver a mostrar opciones
                break;
        }
    }

    private void accesoCEO() throws IOException {
        System.out.println("Accediendo al área CEO/Director General...");
        System.out.println("1) Ver informes financieros");
        System.out.println("2) Planificar estrategias a largo plazo");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando informes financieros...");
                // Aquí puedes añadir lógica para mostrar informes
                break;
            case 2:
                System.out.println("Planificando estrategias a largo plazo...");
                // Aquí puedes añadir lógica para planificar estrategias
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoCEO();
                break;
        }
    }

    private void accesoGerente() throws IOException {
        System.out.println("Accediendo al área Gerente...");
        System.out.println("1) Ver rendimiento del equipo");
        System.out.println("2) Gestionar proyectos");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando rendimiento del equipo...");
                // Aquí puedes añadir lógica para mostrar rendimiento
                break;
            case 2:
                System.out.println("Gestionando proyectos...");
                // Aquí puedes añadir lógica para gestionar proyectos
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoGerente();
                break;
        }
    }

    private void accesoCoordinador() throws IOException {
        System.out.println("Accediendo al área Coordinador...");
        System.out.println("1) Organizar reuniones");
        System.out.println("2) Supervisar tareas");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Organizando reuniones...");
                // Aquí puedes añadir lógica para organizar reuniones
                break;
            case 2:
                System.out.println("Supervisando tareas...");
                // Aquí puedes añadir lógica para supervisar tareas
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoCoordinador();
                break;
        }
    }

    private void accesoContador() throws IOException {
        System.out.println("Accediendo al área Contador...");
        System.out.println("1) Ver balances contables");
        System.out.println("2) Preparar informes fiscales");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando balances contables...");
                // Aquí puedes añadir lógica para mostrar balances
                break;
            case 2:
                System.out.println("Preparando informes fiscales...");
                // Aquí puedes añadir lógica para preparar informes
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoContador();
                break;
        }
    }

    private void accesoRecursosHumanos() throws IOException {
        System.out.println("Accediendo al área Recursos Humanos...");
        System.out.println("1) Gestionar nómina");
        System.out.println("2) Realizar entrevistas");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Gestionando nómina...");
                // Aquí puedes añadir lógica para gestionar nómina
                break;
            case 2:
                System.out.println("Realizando entrevistas...");
                // Aquí puedes añadir lógica para realizar entrevistas
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoRecursosHumanos();
                break;
        }
    }

    private void accesoDiseñador() throws IOException {
        System.out.println("Accediendo al área Diseñador...");
        System.out.println("1) Ver proyectos de diseño");
        System.out.println("2) Crear nuevos diseños");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando proyectos de diseño...");
                // Aquí puedes añadir lógica para mostrar proyectos
                break;
            case 2:
                System.out.println("Creando nuevos diseños...");
                // Aquí puedes añadir lógica para crear diseños
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoDiseñador();
                break;
        }
    }

    private void accesoEmpleado() throws IOException {
        System.out.println("Accediendo al área Empleado...");
        System.out.println("1) Ver tareas asignadas");
        System.out.println("2) Reportar horas trabajadas");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando tareas asignadas...");
                // Aquí puedes añadir lógica para mostrar tareas
                break;
            case 2:
                System.out.println("Reportando horas trabajadas...");
                // Aquí puedes añadir lógica para reportar horas
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoEmpleado();
                break;
        }
    }
}