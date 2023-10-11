import java.util.Scanner;

public class P2p1_IS22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String opc;
		byte num1, num2;
		int resultado;

		System.out.println("Menu de opciones");
		System.out.println("\n S");
		System.out.println("\n R");
		System.out.println("\n M");
		System.out.println("\n D");
		System.out.println("\n Que opcion desea?");
		opc = teclado.nextLine();

		switch(opc){
		case "s":
			System.out.println("Aqui va la suma");
			System.out.println("ingresa el primer numero");
			num1 = teclado.nextByte();
			System.out.println("Ingresa el segundo numero: ");
			num2 = teclado.nextByte();
			resultado = num1 + num2;
			System.out.println("El resultado es: " + resultado);
			break;
		case "r":
			System.out.println("Aqui va la resta");
			System.out.println("ingresa el primer numero");
			num1 = teclado.nextByte();
			System.out.println("Ingresa el segundo numero: ");
			num2 = teclado.nextByte();
			resultado = num1 - num2;
			System.out.println("El resultado es: " + resultado);
			break;
		case "m":
			System.out.println("Aqui va la multiplicacion");
			System.out.println("ingresa el primer numero");
			num1 = teclado.nextByte();
			System.out.println("Ingresa el segundo numero: ");
			num2 = teclado.nextByte();
			resultado = num1 * num2;
			System.out.println("El resultado es: " + resultado);
			break;
		case "d":
			System.out.println("ingresa el primer numero");
			num1 = teclado.nextByte();
			System.out.println("Ingresa el segundo numero: ");
			num2 = teclado.nextByte();
			resultado = num1 / num2;
			System.out.println("El resultado es: " + resultado);
			System.out.println("Aqui va la division");
		default: System.out.println("No existe la opcion");
			break;

		}
	}
}