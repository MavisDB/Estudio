package interfaz_grafica;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio4 extends JFrame implements ActionListener{
	JButton btn1;
	
	public Ejercicio4() {
	setLayout(null);
	btn1 = new JButton("Cerrar");
	btn1.setBounds(300,250,100,30);
	add(btn1);
	btn1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		Ejercicio4 ej4 = new Ejercicio4();
		ej4.setBounds(0,0,450,350);
		ej4.setVisible(true);
		ej4.setLocationRelativeTo(null);
		ej4.setResizable(false);
	}
	
}
