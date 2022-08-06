package alumno_por;

public class Promedio_Alumno {
	public static void main(String[] args) {
		int mat = 5, bio = 8, quim = 7;
		int promedio;
		
		promedio = (mat + bio + quim)/3;
		System.out.println("Tu promedio final es de: " + promedio);
		
		if(promedio >= 6) {
			System.out.println("Aprobaste el semestre");
		}else {
			System.out.println("Reprobaste el semestre");
		}
	}
}
