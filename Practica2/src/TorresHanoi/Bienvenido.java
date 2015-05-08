package TorresHanoi;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import Intento.Discos;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Bienvenido extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String nombre = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenido frame = new Bienvenido();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Bienvenido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidos = DefaultComponentFactory.getInstance().createLabel("BIENVENIDO\r\n");
		lblBienvenidos.setForeground(new Color(0, 153, 255));
		lblBienvenidos.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblBienvenidos.setBounds(208, 11, 146, 51);
		contentPane.add(lblBienvenidos);
		
		JLabel lblTorresDeHanoi = DefaultComponentFactory.getInstance().createTitle("TORRES DE HANOI");
		lblTorresDeHanoi.setForeground(new Color(128, 0, 0));
		lblTorresDeHanoi.setFont(new Font("Snap ITC", Font.PLAIN, 27));
		lblTorresDeHanoi.setBounds(116, 54, 316, 51);
		contentPane.add(lblTorresDeHanoi);
		
		JLabel lblInstrucciones = DefaultComponentFactory.getInstance().createLabel("INSTRUCCIONES:");
		lblInstrucciones.setForeground(new Color(75, 0, 130));
		lblInstrucciones.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 14));
		lblInstrucciones.setBounds(29, 105, 156, 14);
		contentPane.add(lblInstrucciones);
		
		JTextPane txtpnPonAPrueba = new JTextPane();
		txtpnPonAPrueba.setEditable(false);
		txtpnPonAPrueba.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		txtpnPonAPrueba.setText("\u00A1Pon a prueba tu inteligencia!   El juego de la torre de Hanoi consiste en ir cambiando los discos de la torre A a la torre C con la condici\u00F3n de que no se puede mover m\u00E1s de un disco a la vez, y que no puede colocarse un disco grande sobre uno peque\u00F1o. \r\n   \u00A1TU PUEDES!");
		txtpnPonAPrueba.setBounds(10, 130, 471, 97);
		contentPane.add(txtpnPonAPrueba);
		
	
		 
		
		Button button = new Button("INICIAR");
		button.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				nombre = textField.getText();
				TorresHanoi Torres = new TorresHanoi( nombre);//nombre
				Torres.setVisible(true);
				//Cronómetro crono = new Cronómetro();
				// crono.setVisible(true);
				//crono.iniciarCronometro();
				  Discos d = new Discos();
/*
					 button.addMouseListener(new MouseAdapter() {
						 
						 public void mousePressed(MouseEvent e) {
				                if(checkbox.getState()==true){
				                    JOptionPane.showMessageDialog(null, "Se hizo check en el checkBox1");
				               
				                }
						 }*/
				  
			}

		});
		
		button.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		button.setBounds(143, 325, 107, 33);
		contentPane.add(button);
	
		
		Button button_1 = new Button("SALIR");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); 
			}
		});
		
	
		button_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		button_1.setBounds(253, 326, 101, 32);
		contentPane.add(button_1);
		
		JLabel lblIngreseSuNombre = new JLabel("Ingrese su nombre:");
		lblIngreseSuNombre.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblIngreseSuNombre.setBounds(10, 249, 197, 33);
		contentPane.add(lblIngreseSuNombre);
		
		textField = new JTextField();
		textField.setBounds(10, 283, 471, 20);
		 
		contentPane.add(textField);
		textField.setColumns(10);
		
	    
	}
        }
  
   