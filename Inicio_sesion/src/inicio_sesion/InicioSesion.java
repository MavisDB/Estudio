package inicio_sesion;
import java.util.Scanner;
public class InicioSesion {
 public static void main(String[] args) {
	String usuario = "";
	String pass = "";
	
	Scanner sc = new Scanner(System.in);
	System.out.println("INICIO DE SESION");
	System.out.println("Nombre de usuario");
	usuario = sc.nextLine();
	System.out.println("Contraseña");
	pass = sc.nextLine();
	
	if(usuario.equals("Mavis") && pass.equals("1234")) {
		System.out.println("Inicio de sesión. CORRECTO");
	}else {
		System.out.println("Nombre de usuario o contraseña INCORRECTOS");
	}
 }
}
