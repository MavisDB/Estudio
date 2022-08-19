package interfaz_grafica;
import javax.swing.*;

public class Ejercicio7 extends JFrame {
	private JTextField txt1;
	private JTextArea txtArea;
	
	public Ejercicio7() {
		setLayout(null);
		txt1 = new JTextField();
		txt1.setBounds(10,10,200,30);
		add(txt1);
		
		txtArea = new JTextArea();
		txtArea.setBounds(10,50,400,300);
		add(txtArea);
	}
	
	public static void main(String[] args) {
		Ejercicio7 ej7 = new Ejercicio7();
		ej7.setBounds(0,0,540,400);
		ej7.setVisible(true);
		ej7.setLocationRelativeTo(null);
		ej7.setResizable(false);
	}
}
