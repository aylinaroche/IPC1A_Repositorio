package Intento;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class inicio extends JPanel {

	/**
	 * Create the panel.
	 */
	public inicio() {
		setLayout(new GridLayout(4, 0, 2, 0));
		
		JLabel lblBienvenido = new JLabel("BIENVENIDO");
		lblBienvenido.setForeground(new Color(75, 0, 130));
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setFont(new Font("Tempus Sans ITC", Font.BOLD, 27));
		add(lblBienvenido);
		
		JLabel lblTorresDeHanoi = new JLabel("TORRES DE HANOI");
		lblTorresDeHanoi.setFont(new Font("Papyrus", Font.PLAIN, 16));
		lblTorresDeHanoi.setForeground(new Color(128, 0, 0));
		lblTorresDeHanoi.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTorresDeHanoi);
		
		JLabel lblInstrucciones = new JLabel("Instrucciones:");
		add(lblInstrucciones);
		
		JLabel lblElJuegoConsiste = new JLabel("El juego consiste en colocar todos los aros en orden en\r\n cualquiera de las otras torres");
		lblElJuegoConsiste.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		add(lblElJuegoConsiste);

	}

}
