package interfaz_grafica;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio9 extends JFrame implements ActionListener{
	private JTextField txt1;
	private JButton btn1;
	private JTextArea txtArea;
	private JScrollPane txtSPane;
	String txt = "";
	
	public Ejercicio9() {
		setLayout(null);
		txt1 = new JTextField();
		txt1.setBounds(10,10,200,30);
		add(txt1);
		
		btn1 = new JButton("Agregar");
		btn1.setBounds(250,10,100,30);
		add(btn1);
		btn1.addActionListener(this);
		
		txtArea = new JTextArea();
		txtSPane = new JScrollPane(txtArea);
		txtSPane.setBounds(10,50,400,300);
		add(txtSPane);
	}
	
	public void actionPerformed (ActionEvent e) {
		if(e.getSource() == btn1) {
			txt += txt1.getText() + "\n";
			txtArea.setText(txt);
			txt1.setText("");
		}
	}
	
	public static void main(String[] args) {
		Ejercicio9 ej9 = new Ejercicio9();
		ej9.setBounds(0,0,540,400);
		ej9.setVisible(true);
		ej9.setLocationRelativeTo(null);
		ej9.setResizable(false);
	}
	
}
