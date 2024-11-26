import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Personalizar {
    private List<String> actividades;

    public Personalizar() {
        actividades = new ArrayList<>();
    }

    public void añadirActividad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la actividad que deseas añadir:");
        String actividad = scanner.nextLine();
        actividades.add(actividad);
        System.out.println("Actividad añadida con éxito.");
    }

    public void showPersonalizarOptions() {
        System.out.println("Actividades personalizadas:");
        for (String actividad : actividades) {
            System.out.println("- " + actividad);
        }
    }
}
