package interfaz_grafica;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio6 extends JFrame implements ActionListener{
	private JLabel label1;
	private JTextField txt1;
	private JButton btn1;
	
	public Ejercicio6() {
		setLayout(null);
		label1 = new JLabel("Usuario");
		label1.setBounds(10,10,100,30);
		add(label1);
		txt1 = new JTextField();
		txt1.setBounds(120,17,150,20);
		add(txt1);
		btn1 = new JButton("Aceptar");
		btn1.setBounds(10,80,100,30);
		add(btn1);
		btn1.addActionListener(this);
	}
	
	public void actionPerformed (ActionEvent e) {
		if(e.getSource() == btn1) {
		String texto = txt1.getText();
		setTitle(texto);
		}
	}
	
	public static void main (String args[]) {
		Ejercicio6 ej6 = new Ejercicio6();
		ej6.setBounds(0,0,300,160);
		ej6.setVisible(true);
		ej6.setLocationRelativeTo(null);
		ej6.setResizable(false);
	}
	
	
}
