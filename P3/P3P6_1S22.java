import java.util.Scanner;

public class P3P6_1S22{

public static int promedio(int[] a){
int sum=0;
for (int num : a)
sum+=num;
sum=sum/(a.length);
return sum;
}

public static int[] captura(){
Scanner teclado = new Scanner(System.in);
int[]numeros = new int[10];
for (int x=0;x<10;x++){
System.out.println("Ingresa el valor numero["+(x+1)+"]:");
numeros[x]=teclado.nextInt();
}
return numeros;
}

public static void main(String[] args) {

int[] prome = captura();
System.out.println("El promedio es "+ promedio(prome));
 }
   }