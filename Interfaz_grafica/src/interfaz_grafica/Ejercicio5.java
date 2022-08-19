package interfaz_grafica;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio5 extends JFrame implements ActionListener {
	private JLabel label1;
	JButton btn1, btn2, btn3;
	
	public Ejercicio5() {
		setLayout(null);
		
		btn1 = new JButton("1");
		btn1.setBounds(10,100,90,30);
		add(btn1);
		btn1.addActionListener(this);
		
		btn2 = new JButton("2");
		btn2.setBounds(110,100,90,30);
		add(btn2);
		btn2.addActionListener(this);
		
		btn3 = new JButton("3");
		btn3.setBounds(210,100,90,30);
		add(btn3);
		btn3.addActionListener(this);
		
		label1 = new JLabel("En espera de boton");
		label1.setBounds(10,10,300,30);
		add(label1);

	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			label1.setText("Presionaste el boton 1");
		}if(e.getSource() == btn2) {
			label1.setText("Presionaste el boton 2");
			
		}if(e.getSource() == btn3) {
			label1.setText("Presionaste el boton 3");
		}
	}
	
	public static void main(String[] args) {
		Ejercicio5 ej5 = new Ejercicio5();
		ej5.setBounds(0,0,350,200);
		ej5.setVisible(true);
		ej5.setLocationRelativeTo(null);
		ej5.setResizable(false);
	}
}
