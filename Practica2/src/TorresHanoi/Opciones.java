package TorresHanoi;

import javax.swing.JPanel;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JTextPane;

public class Opciones extends JPanel {

	/**
	 * Create the panel.
	 */
	public Opciones(String nombre) {
		setLayout(null);
		
		Button button = new Button("Resolver");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Resolver res = new Resolver();
				
				//Solucion sol = new Solucion();
				
			}
		});
		button.setBounds(41, 396, 111, 36);
		add(button);
		
		Button button_1 = new Button("Salir");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); 
			}
		});
		button_1.setBounds(172, 396, 117, 36);
		add(button_1);
		
		JLabel lblHola = new JLabel("HOLA" + nombre);
		lblHola.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblHola.setBounds(28, 30, 55, 14);
		add(lblHola);
		
		JTextPane txtpnElJuegoDe = new JTextPane();
		txtpnElJuegoDe.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtpnElJuegoDe.setText("INSTRUCCIONES: El juego de las torres de Hanoi consiste en ir cambiando los discos de la torre A a la torre C con la condici\u00F3n de que no se puede mover m\u00E1s de un disco a la vez. RECUERDA: No puede colocarse un disco grande sobre uno peque\u00F1o.");
		txtpnElJuegoDe.setBounds(10, 266, 304, 114);
		add(txtpnElJuegoDe);

	}
}
