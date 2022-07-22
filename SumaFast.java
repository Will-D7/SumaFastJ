import java.util.Scanner;
public class SumaFast{
	private static int var1;
	private static int var2;
	private String str1;
	private static Scanner scan1 = new Scanner(System.in);
	private static Scanner scan2 = new Scanner(System.in);
	private static int operation1;

	public static void main(String args[]){
		System.out.println("Introduzca el primer número...");
		var1 = scan1.nextInt();
		
		System.out.println("Introduzca el segundo número...");
		var2 = scan2.nextInt();
		
		operation1 = suma(var1,var2);
		
		System.out.println("Resultado de la suma es:  "+operation1);
		System.out.println("Que tengas buen día mi rey, hechale ganas, aunque igual te irá mal xD");
	}
	public static int suma(int a, int b){
		return a+b;
	}
}
