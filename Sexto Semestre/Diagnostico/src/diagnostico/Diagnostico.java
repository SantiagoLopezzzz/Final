
package diagnostico;

import java.util.Scanner;

public class Diagnostico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del evento
        System.out.print("Ingrese el nombre del evento deportivo: ");
        String nombreEvento = scanner.nextLine();

        // Solicitar el número máximo de asistentes
        System.out.print("Ingrese el número máximo de asistentes al evento: ");
        int maxAsistentes = scanner.nextInt();

        int boletasPresentadas = 0;

        // Bucle para solicitar boletas a cada asistente
        while (boletasPresentadas < 0.5 * maxAsistentes) {
            System.out.print("Ingrese el nombre del asistente: ");
            String nombreAsistente = scanner.next();

            if (tieneBoleta()) {
                System.out.println(nombreAsistente + ": Boleta presentada. Ingreso permitido.");
                boletasPresentadas++;
            } else {
                System.out.println(nombreAsistente + ": Sin boleta. Ingreso denegado.");;
            }
        }

        iniciarEvento(nombreEvento);
    }

    // Método para simular si un asistente tiene o no boleta
    private static boolean tieneBoleta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Tiene boleta? (true/false): ");
        return scanner.nextBoolean();
    }

    // Método para iniciar el evento deportivo
    private static void iniciarEvento(String nombreEvento) {
        System.out.println("¡El evento deportivo '" + nombreEvento + "' ha iniciado!");
    }
}
