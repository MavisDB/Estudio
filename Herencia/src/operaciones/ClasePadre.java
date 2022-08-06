package operaciones;
import java.util.Scanner;

public class ClasePadre {
	protected int v1, v2, r;
	
	Scanner sc = new Scanner(System.in);
	
	public void PedirDatos() {
		System.out.print("Dame el primer valor: ");
		v1 = sc.nextInt();
		System.out.print("Dame el segundo valor: ");
		v2 = sc.nextInt();
	}
	
	public void MostrarResultado() {
		System.out.println("El resultado es: " + r);
	}
}
