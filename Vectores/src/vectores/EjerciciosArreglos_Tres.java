package vectores;
import java.util.Scanner;
public class EjerciciosArreglos_Tres {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int filas = 0, col = 0, contador = 1;
		System.out.println("Cuantas filas deseas?");
		filas = sc.nextInt();
		System.out.println("Cuantas columnas deseas?");
		col = sc.nextInt();
		int matriz[][] = new int[filas][col];
		for(int j=0; j<filas; j++) {
			for(int i=0; i<col; i++) {
				matriz[j][i] = contador;
				contador++;
				System.out.print("[" + matriz[j][i] + "]");
			}
			System.out.println("");
		}
	}
}
