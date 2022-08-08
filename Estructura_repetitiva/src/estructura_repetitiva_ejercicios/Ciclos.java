package estructura_repetitiva_ejercicios;

public class Ciclos {
	public static void main(String[] args) {
		int i = 0;
		System.out.println("Serie con FOR: ");
		for(i=1; i<=10; i++) {
			if (i < 10) {
				System.out.print(i + ",");
			}else {
				System.out.print(i);
				System.out.println("");
			}
		}
		
		i = 1;
		System.out.println("*********************");
		System.out.println("Serie con WHILE: ");
		while(i <= 10) {
			if (i < 10) {
				System.out.print(i + ",");
			}else {
				System.out.print(i);
				System.out.println("");
			}
			i++;
		}
		
		i = 1;
		System.out.println("*********************");
		System.out.println("DO - WHILE");
		do {
			if (i < 10) {
				System.out.print(i + ",");
			}else {
				System.out.print(i);
			}
			i++;
		}while(i <=10);
	}
}
