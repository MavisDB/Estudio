package interfaz_grafica;
import javax.swing.*;
public class Ejercicio3 extends JFrame{
	private JLabel label1;
	private JLabel label2;
	
	public Ejercicio3() {
		setLayout(null);
		label1 = new JLabel("Interfaz Gráfica");
		label1.setBounds(10, 20, 300, 30);
		add(label1);
		label2 = new JLabel("Versión 1.0");
		label2.setBounds(10,100,100,30);
		add(label2);
	}
	
	public static void main (String args[]) {
		Ejercicio3 ej3 = new Ejercicio3();
		ej3.setBounds(0, 0, 300, 200);
		ej3.setVisible(true);
		ej3.setLocationRelativeTo(null);
		ej3.setResizable(false);
	}
	
	
}
