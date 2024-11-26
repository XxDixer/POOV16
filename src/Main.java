import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Menu menu = new Menu();
            menu.iniciar();
        } catch (IOException e) {
            System.out.println("Error en la ejecución: " + e.getMessage());
        }
    }
}