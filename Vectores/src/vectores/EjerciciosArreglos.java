package vectores;
import java.util.Scanner;
public class EjerciciosArreglos {
	public static void main(String[] args) {
		
		int longitud = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la longitud del vector");
		longitud = sc.nextInt();
		int vector[] = new int[longitud];
		for(int i = 0; i < vector.length; i++) {
			System.out.println("Ingresa el valor numero " + (i+1));
			vector[i] = sc.nextInt();
		}
		for(int i = 0; i < vector.length; i++) {
			System.out.print("[" + vector[i] + "]");
		}
		
	}
}
