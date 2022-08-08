package lenght_substring;
import java.util.Scanner;
public class Lenght_SubString {
	public static void main(String[] args) {
	String palabraOriginal = "";
	String palabraSubstraccion = "";
	int numCaracteres = 0, desde = 0, hasta = 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingresa una palabra");
	palabraOriginal = sc.nextLine();
	numCaracteres = palabraOriginal.length();
	System.out.println("Cantidad de caracteres: " + numCaracteres);
	System.out.println("Desde que caracter desea obtener la nueva cadena?");
	desde = sc.nextInt();
	System.out.println("Hasta que caracter desea obtener la nueva cadena?");
	hasta = sc.nextInt();
	palabraSubstraccion = palabraOriginal.substring(desde, hasta);
	System.out.println("La nueva cadena es: " + palabraSubstraccion);
	}
}
