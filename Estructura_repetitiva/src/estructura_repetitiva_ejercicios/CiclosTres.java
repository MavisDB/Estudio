package estructura_repetitiva_ejercicios;

public class CiclosTres {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		int i = 0;
		System.out.println("Serie con FOR: ");
		for(i = 0; i<10; i++) {
			if(i < 9) {
				System.out.print(a + ", ");
				c = a + b;
				a = b;
				b = c;
			}else {
				System.out.print(a);
				System.out.println("");
			}
		}
		System.out.println("*********************");
		i = 0;
		b = 1;
		a = 0;
		c = 0;
		System.out.println("Serie con WHILE: ");
		while(i < 10) {
			if(i < 9) {
				System.out.print(a + ", ");
				c = a + b;
				a = b;
				b = c;
			}else {
				System.out.print(a);
				System.out.println("");
			}
			i++;
		}
		System.out.println("*********************");
		i = 0;
		b = 1;
		a = 0;
		c = 0;
		System.out.println("Serie con DO - WHILE: ");
		do {
			if(i < 9) {
				System.out.print(a + ", ");
				c = a + b;
				a = b;
				b = c;
			}else {
				System.out.print(a);
			}
			i++;
		}while(i < 10);
	}
}
