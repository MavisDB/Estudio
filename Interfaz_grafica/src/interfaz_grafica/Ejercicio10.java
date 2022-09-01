package interfaz_grafica;
import javax.swing.*;
import java.awt.event.*;
public class Ejercicio10 extends JFrame implements ActionListener{
	private JTextField txt1,txt2;
	private JLabel label1,label2,label3;
	private JButton btn1;
	
	public Ejercicio10() {
		setLayout(null);
		label1 = new JLabel ("Valor 1: ");
		label1.setBounds(50,5,100,30);
		add(label1);
		
		label2 = new JLabel ("Valor 2: ");
		label2.setBounds(50,35,100,30);
		add(label2);
		
		label3 = new JLabel("Resultado: ");
		label3.setBounds(120,80,100,30);
		add(label3); 
		
		txt1 = new JTextField();
		txt1.setBounds(120,10,150,20);
		add(txt1);
		
		txt2 = new JTextField();
		txt2.setBounds(120,40,150,20);
		add(txt2);
		
		btn1 = new JButton ("Sumar");
		btn1.setBounds(10,80,100,30);
		add(btn1);
		btn1.addActionListener(this);
		
	}
	
	public void actionPerformed (ActionEvent e) {
		if(e.getSource() == btn1) {
			int v1 = 0,v2 = 0,r = 0;
			v1 = Integer.parseInt(txt1.getText());
			v2 = Integer.parseInt(txt2.getText());
			r = v1 + v2;
			label3.setText("Resultado: " + r);
		}
	}
	
	public static void main(String[] args) {
		Ejercicio10 ej10 = new Ejercicio10();
		ej10.setBounds(0,0,300,160);
		ej10.setVisible(true);
		ej10.setLocationRelativeTo(null);
		ej10.setResizable(false);
	}
	
}
