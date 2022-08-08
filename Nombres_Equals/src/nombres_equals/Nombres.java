package nombres_equals;
import java.util.Scanner;
public class Nombres {
	public static void main(String[] args) {
		String nom1 = "", nom2 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer nombre");
		nom1 = sc.nextLine();
		System.out.println("Ingresa el segundo nombre");
		nom2 = sc.nextLine();
		
		if(nom1.equalsIgnoreCase(nom2)) {
			System.out.println("Los nombres son iguales");
		}else {
			System.out.println("Los nombres son diferentes");
		}
	}
}
