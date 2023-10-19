public class P2p7_1S22{
	public static void main(String[] args) {
		System.out.println("numero de los ingresados desde la linea de comando "+ args.length);
		for(int a=0;a<args.length;a++){
			System.out.println("el valor # "+a+ ": "+args[a]);
		}
	}
}