import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaAcademica {
    private Usuario usuario;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public AreaAcademica(Usuario usuario) {
        this.usuario = usuario;
    }

    public void showOptions() throws IOException {
        System.out.println("Bienvenido al área académica, " + usuario.getNombre());
        System.out.println("Selecciona una opción:");

        String opciones =
                """
                        1) Director
                        2) Coordinador Académico
                        3) Maestro
                        4) Prefecto
                        5) Consejero Escolar
                        6) Bibliotecario
                        7) Estudiante
                        8) Salir
                """;
        System.out.print(opciones);

        int choice = Integer.parseInt(br.readLine());
        seleccionarOpcion(choice);
    }

    private void seleccionarOpcion(int choice) throws IOException {
        switch (choice) {
            case 1:
                accesoDirector();
                break;
            case 2:
                accesoCoordinadorAcademico();
                break;
            case 3:
                accesoMaestro();
                break;
            case 4:
                accesoPrefecto();
                break;
            case 5:
                accesoConsejeroEscolar();
                break;
            case 6:
                accesoBibliotecario();
                break;
            case 7:
                accesoEstudiante();
                break;
            case 8:
                System.out.println("Saliendo del área académica...");
                break;
            default:
                System.out.println("Opción no válida. Por favor selecciona una opción entre 1 y 8.");
                showOptions();
                break;
        }
    }

    private void accesoDirector() throws IOException {
        System.out.println("Accediendo al área Director...");
        System.out.println("1) Ver informes de rendimiento");
        System.out.println("2) Gestionar presupuesto");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando informes de rendimiento...");
                break;
            case 2:
                System.out.println("Gestionando presupuesto...");
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoDirector();
                break;
        }
    }

    private void accesoCoordinadorAcademico() throws IOException {
        System.out.println("Accediendo al área Coordinador Académico...");
        System.out.println("1) Ver horario de clases");
        System.out.println("2) Asignar profesores a cursos");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando horario de clases...");
                break;
            case 2:
                System.out.println("Asignando profesores a cursos...");
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoCoordinadorAcademico();
                break;
        }
    }

    private void accesoMaestro() throws IOException {
        System.out.println("Accediendo al área Maestro...");
        System.out.println("1) Ver lista de estudiantes");
        System.out.println("2) Calificar tareas");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando lista de estudiantes...");
                break;
            case 2:
                System.out.println("Calificando tareas...");
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoMaestro();
                break;
        }
    }

    private void accesoPrefecto() throws IOException {
        System.out.println("Accediendo al área Prefecto...");
        System.out.println("1) Gestionar actividades extracurriculares");
        System.out.println("2) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Gestionando actividades extracurriculares...");
                break;
            case 2:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoPrefecto();
                break;
        }
    }

    private void accesoConsejeroEscolar() throws IOException {
        System.out.println("Accediendo al área Consejero Escolar...");
        System.out.println("1) Ver historial académico de estudiantes");
        System.out.println("2) Asesorar a estudiantes");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando historial académico de estudiantes...");
                break;
            case 2:
                System.out.println("Asesorando a estudiantes...");
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoConsejeroEscolar();
                break;
        }
    }

    private void accesoBibliotecario() throws IOException {
        System.out.println("Accediendo al área Bibliotecario...");
        System.out.println("1) Ver libros disponibles");
        System.out.println("2) Gestionar préstamos de libros");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando libros disponibles...");
                break;
            case 2:
                System.out.println("Gestionando préstamos de libros...");
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoBibliotecario();
                break;
        }
    }

    private void accesoEstudiante() throws IOException {
        System.out.println("Accediendo al área Estudiante...");
        System.out.println("1) Ver calificaciones");
        System.out.println("2) Inscribirse en cursos");
        System.out.println("3) Volver");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Mostrando calificaciones...");
                break;
            case 2:
                System.out.println("Inscribiéndose en cursos...");
                break;
            case 3:
                showOptions();
                break;
            default:
                System.out.println("Opción no válida.");
                accesoEstudiante();
                break;
        }
    }
}