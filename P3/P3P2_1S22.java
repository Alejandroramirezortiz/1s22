import java.util.Scanner;

public class P3P2_1S22{

    static Scanner teclado = new Scanner(System.in);

    public static void Suma() {
        System.out.println("Ingresa dos numeros: ");
        System.out.println("Ingresa el primero numero: ");
        int a = teclado.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int b = teclado.nextInt();
        int c = a + b;
        System.out.println("El resultado es: " + c);
    }

    public static void Resta() {
        System.out.println("Ingresa dos numeros: ");
        System.out.println("Ingresa el primero numero: ");
        int a = teclado.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int b = teclado.nextInt();
        int c = a - b; // Corregido para restar en lugar de sumar
        System.out.println("El resultado es: " + c);
    }

    public static void Multiplicacion() {
        System.out.println("Ingresa dos numeros: ");
        System.out.println("Ingresa el primero numero: ");
        int a = teclado.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int b = teclado.nextInt();
        int c = a * b; // Corregido para multiplicar en lugar de sumar
        System.out.println("El resultado es: " + c);
    }

    public static void Division() {
        System.out.println("Ingresa dos numeros: ");
        System.out.println("Ingresa el primero numero: ");
        int a = teclado.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int b = teclado.nextInt();
       
        if (b != 0) {
            double c = (double) a / b; // Corregido para dividir correctamente
            System.out.println("El resultado es: " + c);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }

    public static void Menu() {
        System.out.println("Menu de opciones basico: ");
        System.out.println("\n A) Suma");
        System.out.println("B) Resta");
        System.out.println("C) Multiplicacion");
        System.out.println("D) Division");
        System.out.println("E) Salir");
        System.out.println("Que opcion deseas?: ");
    }

    public static void main(String[] args) {
        String opc;

        do {
            Menu();
            opc = teclado.next(); // Utiliza next() en lugar de nextLine() para evitar problemas con el salto de línea
            switch (opc) {
                case "A":
                    Suma();
                    break;
                case "B":
                    Resta();
                    break;
                case "C":
                    Multiplicacion();
                    break;
                case "D":
                    Division();
                    break;
                case "E":
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        } while (!opc.equals("E"));
    }
}