package control_vacacional;
import java.util.Scanner;

public class ControlVacacional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nom = "";
		int clave = 0, antiguedad = 0;
		
		System.out.println("Bienvenido al sistema vacacional de Coca-Cola");
		System.out.println("Introduzca el nombre del trabajador");
		nom = sc.nextLine();
		System.out.println("Introduce el tiempo de servicio del trabajador");
		antiguedad = sc.nextInt();
		System.out.println("Introduce la clave de su departamento");
		clave = sc.nextInt();
		
		
		if (clave == 1) {
			if(antiguedad == 1) {
				System.out.println(nom + ", tienes derecho a  6 d�as");
				
			}else if(antiguedad >= 2 && antiguedad <=6) {
				System.out.println(nom + ", tienes derecho a 14 d�as");	
			}else if (antiguedad == 7) {
				System.out.println(nom + ", tienes derecho a 20 d�as");
			}else {
				System.out.println("Aun no tienes derecho de descanso");
			}
		}else if(clave == 2) {
			if(antiguedad == 1) {
				System.out.println(nom + ", tienes derecho a  7 d�as");
				
			}else if(antiguedad >= 2 && antiguedad <=6) {
				System.out.println(nom + ", tienes derecho a 15 d�as");	
			}else if (antiguedad == 7) {
				System.out.println(nom + ", tienes derecho a 22 d�as");
			}else {
				System.out.println("Aun no tienes derecho de descanso");
			}
		}else if(clave == 3) {
			if(antiguedad == 1) {
				System.out.println(nom + ", tienes derecho a  10 d�as");
				
			}else if(antiguedad >= 2 && antiguedad <=6) {
				System.out.println(nom + ", tienes derecho a 20 d�as");	
			}else if (antiguedad == 7) {
				System.out.println(nom + ", tienes derecho a 30 d�as");
			}else {
				System.out.println("Aun no tienes derecho de descanso");
			}
			
		}else {
			System.out.println("ERROR. La clave es incorrecta");
		}
	}	
}
