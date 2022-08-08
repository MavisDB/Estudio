package vectores;

public class ArreglosDinamicos {
	public static void main(String[] args) {
		int numeros[] = new int[5];
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i+10;
		}
		System.out.println("El arreglo es " + 
						"[" + numeros[0] + "]" +
						"[" + numeros[1] + "]" +
						"[" + numeros[2] + "]" +
						"[" + numeros[3] + "]" +
						"[" + numeros[4] + "]");
	}
}
