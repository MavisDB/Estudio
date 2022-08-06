package operaciones_digito;
import java.util.Scanner;

public class Operaciones {
	public static void main(String[] args) {
		int v1, v2, r, d;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("1. SUMA");
		System.out.println("2. RESTA");
		System.out.println("3. MUL");
		System.out.println("4. DIV");
		System.out.println("Digita el numero de la operacion a realizar?");
		d = sc.nextInt();
		
		if(d == 1) {
			System.out.println("*** SUMA ***");
			System.out.println("Introduce el primer valor");
			v1 = sc.nextInt();
			System.out.println("Introduce el segundo valor");
			v2 = sc.nextInt();
			r = v1 + v2;
			System.out.println("El resultado es: " + r);
		} else if (d == 2) {
			System.out.println("*** RESTA ***");
			System.out.println("Introduce el primer valor");
			v1 = sc.nextInt();
			System.out.println("Introduce el segundo valor");
			v2 = sc.nextInt();
			r = v1 - v2;
			System.out.println("El resultado es: " + r);
		} else if (d == 3) {
			System.out.println("*** MUL ***");
			System.out.println("Introduce el primer valor");
			v1 = sc.nextInt();
			System.out.println("Introduce el segundo valor");
			v2 = sc.nextInt();
			r = v1 * v2;
			System.out.println("El resultado es: " + r);
		} else if (d == 4) {
			System.out.println("*** DIV ***");
			System.out.println("Introduce el primer valor");
			v1 = sc.nextInt();
			System.out.println("Introduce el segundo valor");
			v2 = sc.nextInt();
			r = v1 / v2;
			System.out.println("El resultado es: " + r);
		}else {
			System.out.println("**** OPCION DE OPERACION NO VALIDO ****");
		}
		
	
	}
}
