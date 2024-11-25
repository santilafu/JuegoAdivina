import java.util.Random;

public class Main {
    static void jugar() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1; // Genera un número entre 1 y 10
        int intentos = 5;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de adivinar un número!");
        System.out.println("Tienes 5 intentos para adivinar un número entre 1 y 10.");

        while (intentos > 0 && !adivinado) {
            System.out.println("Ingresa un número del 1 al 10:");
            int num = Integer.parseInt(System.console().readLine());

            if (num == numeroAleatorio) {
                System.out.println("¡Has ganado! El número era: " + numeroAleatorio);
                adivinado = true;
            } else if (num < 1 || num > 10) {
                System.out.println("El número debe estar entre 1 y 10.");
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Incorrecto. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("¡Has perdido! El número era: " + numeroAleatorio);
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\nElige una opción:");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");

            int opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    jugar();
                    break;
                case 2:
                    System.out.println("¡Gracias por jugar!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }
}
