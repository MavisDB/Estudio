package estructura_repetitiva_ejercicios;

public class CiclosDos {
	public static void main(String[] args) {
		int i = 1;
		int j = 99;
		System.out.println("Serie con FOR: ");
		
		for(i=1; i<=5; i++) {
			if(i < 5) {
				System.out.print(i +  ", ");
				System.out.print(j + ", "); 
			}else {
				System.out.print(i + ", ");
				System.out.print(j);
				System.out.println("");
			}
			j--;
		}
		System.out.println("*********************");
		i = 1;
		j = 99;
		System.out.println("Serie con WHILE: ");
		while(i<=5) {
			if(i < 5) {
				System.out.print(i +  ", ");
				System.out.print(j + ", ");
			}else {
				System.out.print(i + ", ");
				System.out.print(j);
				System.out.println("");
			}
			i++;
			j--;
		}
		System.out.println("*********************");
		i = 1;
		j = 99;
		System.out.println("Serie con DO-WHILE: ");
		do{
			if(i < 5) {
				System.out.print(i +  ", ");
				System.out.print(j + ", ");
			}else {
				System.out.print(i + ", ");
				System.out.print(j);
			}
			i++;
			j--;
		}while(i <= 5);
	}
}
