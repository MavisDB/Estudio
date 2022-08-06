package polimorfismo;
import java.util.Scanner;

public abstract class Operaciones_ClasePadre {
	protected int v1, v2, r;
	Scanner sc = new Scanner(System.in);
	
	public void PedirDatos() {
		System.out.println("Dame el primer valor: ");
		v1 = sc.nextInt();
		System.out.println("Dame el segundo valor: ");
		v2 = sc.nextInt();
	}
	
	public abstract void Operaciones();
	
	public void MostrarResultado() {
		System.out.println("El resultado es: " + r);
	}

}
