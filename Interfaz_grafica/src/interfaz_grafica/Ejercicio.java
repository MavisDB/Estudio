package interfaz_grafica;
import javax.swing.*;
public class Ejercicio extends JFrame{
	private JLabel label1;
	
	public Ejercicio() {
		setLayout(null);
		label1 = new JLabel("Mitzi Hernandez");
		label1.setBounds(10, 20, 200, 300);
		add(label1);
	}
	
	public static void main(String[] args) {
		Ejercicio formulario1 = new Ejercicio();
		formulario1.setBounds(0,0,400,300);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);
	}
}
