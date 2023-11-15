import java.util.Scanner;

public class P3P2 _1S22{

	static Scanner teclado = new Scanner(System.in);

	public static void suma(){
		System.out.println("Ingresa dos numeros: ");
		System.out.println("Ingresa el primero numero: ");
		int a = teclado.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		int b = teclado.nextInt();
		int c = a+b;
		System.out.println("El resultado es: )" + c);
	}

	public static void resta(){
		System.out.println("Ingresa dos numeros: ");
		System.out.println("Ingresa el primero numero: ");
		int a = teclado.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		int b = teclado.nextInt();
		int c = a+b;
		System.out.println("El resultado es: )" + c);
	}

	public static void multiplciacion(){
		System.out.println("Ingresa dos numeros: ");
		System.out.println("Ingresa el primero numero: ");
		int a = teclado.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		int b = teclado.nextInt();
		int c = a+b;
		System.out.println("El resultado es: )" + c);
	}

	public static void division(){
		System.out.println("Ingresa dos numeros: ");
		System.out.println("Ingresa el primero numero: ");
		int a = teclado.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		int b = teclado.nextInt();
		int c = a+b;
		System.out.println("El resultado es: )" + c);

	}

	public static void menu(){
		System.out.println("Menu de opciones basico: ");
	    System.out.println("\n A) Suma");
	    System.out.println("B) Resta");
	    System.out.println("C) Multiplicacion");
	    System.out.println("D) Division");
	    System.out.println("Que opcion deseas?: ");

	}


	public static void main(String[] args) {
		String opc;
		menu();
		opc=teclado.nextLine();
		while(opc.equals("A")) suma();
		while(opc.equals("B")) resta();
		while(opc.equals("C")) multiplciacion();
		while(opc.equals("D")) division();
		while(opc.equals("E")) break;

	}
}