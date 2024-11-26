import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaPersonal {
    private Usuario usuario;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public AreaPersonal(Usuario usuario) {
        this.usuario = usuario;
    }

    public void showOptions() throws IOException {
        System.out.println("Bienvenido al área personal, " + usuario.getNombre());
        System.out.println("Selecciona una opción:");

        // Mostrar las opciones dependiendo del rol del usuario
        String opciones =
                """
                        1) Deportista
                        2) Viajero
                        3) Familiar
                        4) Bienestar
                        5) Entretenimiento
                        6) Estudiante Autónomo
                        7) Relaciones Personales
                        8) Salir
                """;
        System.out.print(opciones);

        int choice = Integer.parseInt(br.readLine());
        seleccionarOpcion(choice);
    }

    private void seleccionarOpcion(int choice) throws IOException {
        switch (choice) {
            case 1:
                accesoDeportista();
                break;
            case 2:
                accesoViajero();
                break;
            case 3:
                accesoFamiliar();
                break;
            case 4:
                accesoBienestar();
                break;
            case 5:
                accesoEntretenimiento();
                break;
            case 6:
                accesoEstudianteAutonomo();
                break;
            case 7:
                accesoRelacionesPersonales();
                break;
            case 8:
                System.out.println("Saliendo del área personal...");
                break;
            default:
                System.out.println("Opción no válida. Por favor selecciona una opción entre 1 y 8.");
                showOptions(); // Volver a mostrar opciones
                break;
        }
    }

    // Métodos de acceso para cada área

    private void accesoDeportista() throws IOException {
        System.out.println("Accediendo al área Deportista...");
        System.out.println("1) Ver estadísticas de rendimiento");
        System.out.println("2) Planificar entrenamientos");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando estadísticas de rendimiento...");
                break;
            case 2:
                System.out.println("Planificando entrenamientos...");
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoDeportista();
                break;
        }
    }

    private void accesoViajero() throws IOException {
        System.out.println("Accediendo al área Viajero...");
        System.out.println("1) Ver destinos favoritos");
        System.out.println("2) Planificar un viaje");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando destinos favoritos...");
                break;
            case 2:
                System.out.println("Planificando un viaje...");
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoViajero();
                break;
        }
    }

    private void accesoFamiliar() throws IOException {
        System.out.println("Accediendo al área Familiar...");
        System.out.println("1) Ver eventos familiares");
        System.out.println("2) Planificar reuniones");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando eventos familiares...");
                break;
            case 2:
                System.out.println("Planificando reuniones...");
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoFamiliar();
                break;
        }
    }

    private void accesoBienestar() throws IOException {
        System.out.println("Accediendo al área Bienestar...");
        System.out.println("1) Ver consejos de bienestar");
        System.out.println("2) Planificar actividades de relajación");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando consejos de bienestar...");
                break;
            case 2:
                System.out.println("Planificando actividades de relajación...");
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoBienestar();
                break;
        }
    }

    private void accesoEntretenimiento() throws IOException {
        System.out.println("Accediendo al área Entretenimiento...");
        System.out.println("1) Ver películas recomendadas");
        System.out.println("2) Ver series recomendadas");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando películas recomendadas...");
                break;
            case 2:
                System.out.println("Mostrando series recomendadas...");
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoEntretenimiento();
                break;
        }
    }

    private void accesoEstudianteAutonomo() throws IOException {
        System.out.println("Accediendo al área Estudiante Autónomo...");
        System.out.println("1) Ver recursos de estudio");
        System.out.println("2) Planificar sesiones de estudio");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando recursos de estudio...");
                break;
            case 2:
                System.out.println("Planificando sesiones de estudio...");
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoEstudianteAutonomo();
                break;
        }
    }

    private void accesoRelacionesPersonales() throws IOException {
        System.out.println("Accediendo al área Relaciones Personales...");
        System.out.println("1) Ver contactos");
        System.out.println("2) Planificar encuentros");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando contactos...");
                break;
            case 2:
                System.out.println("Planificando encuentros...");
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoRelacionesPersonales();
                break;
        }
    }
}