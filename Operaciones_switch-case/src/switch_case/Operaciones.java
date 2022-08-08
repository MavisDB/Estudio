package switch_case;

public class Operaciones {
	public static void main(String[] args) {
		int v1 = 5, v2 = 3, r = 0;
		int parametro = 3;
	
	switch (parametro) {
	
	case 1:
		System.out.println("SUMA");
		r = v1 + v2;
		System.out.println("El resultado es: " + r);
		break;
	case 2:
		System.out.println("RESTA");
		r = v1 - v2;
		System.out.println("El resultado es: " + r);
		break;
	case 3:
		System.out.println("MULTIPLICACION");
		r = v1 * v2;
		System.out.println("El resultado es: " + r);
		break;
	case 4:
		System.out.println("DIVISION");
		r = v1 / v2;
		System.out.println("El resultado es: " + r);
		break;
	default: System.out.println("ERROR. La opcion no es valida");
		break;
	
		}
	}		
}
