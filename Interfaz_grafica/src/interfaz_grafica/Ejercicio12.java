package interfaz_grafica;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ejercicio12 extends JFrame implements ActionListener {
	private JLabel label1, label2, label3;
	private JComboBox jCombo1, jCombo2, jCombo3;
	private JButton btn1;
	
	public Ejercicio12() {
		setLayout(null);
		label1 = new JLabel ("Rojo");
		label1.setBounds(10,10,100,10);
		add(label1);
		
		jCombo1 = new JComboBox();
		jCombo1.setBounds(120,10,50,30);
		for(int i=0; i <= 255; i++) {
			jCombo1.addItem(String.valueOf(i));
		}
		add(jCombo1);
		
		label2 = new JLabel("Verde");
		label2.setBounds(10,50,100,10);
		add(label2);
		
		jCombo2 = new JComboBox();
		jCombo2.setBounds(120,50,50,30);
		for(int i=0; i <= 255; i++) {
			jCombo2.addItem(String.valueOf(i));
		}
		add(jCombo2);
		
		label3 = new JLabel("Azul");
		label3.setBounds(10,90,100,10);
		add(label3);
		
		jCombo3 = new JComboBox();
		jCombo3.setBounds(120,90,50,30);
		for(int i=0; i <= 255; i++) {
			jCombo3.addItem(String.valueOf(i));
		}
		add(jCombo3);
		
		btn1 = new JButton("Fijar color");
		btn1.setBounds(10,130,100,30);
		add(btn1);
		btn1.addActionListener(this);
	}
	
	public void actionPerformed (ActionEvent e) {
		if(e.getSource() == btn1) {
			String txt1 = jCombo1.getSelectedItem().toString();
			String txt2 = jCombo2.getSelectedItem().toString();
			String txt3 = jCombo3.getSelectedItem().toString();
			
			int rojo = Integer.parseInt(txt1);
			int verde = Integer.parseInt(txt2);
			int azul = Integer.parseInt(txt3);
			
			Color color1 = new Color (rojo, verde, azul);
			btn1.setBackground(color1);
			
		}
	}
	
	public static void main(String[] args) {
		Ejercicio12 ej12 = new Ejercicio12();
		ej12.setBounds(0,0,190,220);
		ej12.setVisible(true);
		ej12.setLocationRelativeTo(null);
		ej12.setResizable(false);
	}
}
