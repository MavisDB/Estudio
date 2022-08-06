package main;
import operaciones.ClaseHija_Res;
import operaciones.ClaseHija_Suma;

public class ClasePrincipal {
	
	public static void main(String[] args) {
	ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
	mensajeroSuma.PedirDatos();
	mensajeroSuma.Sumar();
	System.out.print("El resultado de la suma es: ");
	mensajeroSuma.MostrarResultado();
	
	ClaseHija_Res mensajeroResta = new ClaseHija_Res();
	mensajeroResta.PedirDatos();
	mensajeroResta.Restar();
	System.out.print("El resultado de la resta es: ");
	mensajeroResta.MostrarResultado();
	}
	
	
}
