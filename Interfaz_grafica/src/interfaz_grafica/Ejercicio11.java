package interfaz_grafica;
import javax.swing.*;
import java.awt.event.*;
public class Ejercicio11 extends JFrame implements ItemListener{
	private JComboBox jCombo;
	
	public Ejercicio11() {
		setLayout(null);
		jCombo = new JComboBox();
		jCombo.setBounds(10,10,80,20);
		add(jCombo);
		jCombo.addItem("negro");
		jCombo.addItem("verde");
		jCombo.addItem("rosa");
		jCombo.addItem("naranja");
		jCombo.addItem("amarillo");
		jCombo.addItemListener(this);
	}
	
	public void itemStateChanged (ItemEvent e) {
		if(e.getSource() == jCombo) {
			String txt = jCombo.getSelectedItem().toString();
			setTitle(txt);
		}
	}
	public static void main(String[] args) {
		Ejercicio11 ej11 = new Ejercicio11();
		ej11.setBounds(0,0,200,150);
		ej11.setVisible(true);
		ej11.setLocationRelativeTo(null);
		ej11.setResizable(false);
	}

}
