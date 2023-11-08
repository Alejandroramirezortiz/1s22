import java.util.Scanner;

public class P2EXAMEN_1S22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos: ");
        int n = scanner.nextInt();

        // Crear un arreglo para almacenar los valores
        double[] valores = new double[n];

        // Leer los valores desde el usuario
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        // Calcular la media
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += valores[i];
        }
        double media = suma / n;

        // Calcular la desviación media
        double sumaDiferenciasCuadrado = 0;
        for (int i = 0; i < n; i++) {
            double diferencia = valores[i] - media;
            sumaDiferenciasCuadrado += diferencia * diferencia;
        }
        double desviacionMedia = Math.sqrt(sumaDiferenciasCuadrado / n);

        System.out.println("La media es: " + media);
        System.out.println("La desviación media es: " + desviacionMedia);
    }
}