package TorresHanoi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.Color;

import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;

public class TorresHanoi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TorresHanoi frame = new TorresHanoi(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public TorresHanoi( String nombre) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnInstruccionesElJuego = new JTextPane();
		txtpnInstruccionesElJuego.setEditable(false);
		txtpnInstruccionesElJuego.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtpnInstruccionesElJuego.setText("INSTRUCCIONES: El juego de las torres de Hanoi consiste en ir cambiando los discos de la torre A a la torre C con la condici\u00F3n de que no se puede mover m\u00E1s de un disco a la vez. RECUERDA: No puede colocarse un disco grande sobre uno peque\u00F1o.");
		txtpnInstruccionesElJuego.setBounds(601, 49, 248, 127);
		contentPane.add(txtpnInstruccionesElJuego);
		
		JButton btnResolver = new JButton("RESOLVER");
		btnResolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Solucion s = new Solucion();
				
				
			}
		});
		btnResolver.setBounds(601, 410, 121, 34);
		contentPane.add(btnResolver);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnSalir.setBounds(721, 410, 128, 34);
		contentPane.add(btnSalir);
		
		
		JLabel Label8 = new JLabel("");
		Label8.setHorizontalAlignment(SwingConstants.CENTER);
		Label8.setLabelFor(Label8);
		Label8.setBounds(78, 111, 83, 34);
		contentPane.add(Label8);
		Label8.setIcon(new ImageIcon("D:\\disco8.png"));
		
		JLabel label7 = new JLabel("");
		label7.setIcon(new ImageIcon("D:\\disco7.png"));
		label7.setBounds(70, 142, 111, 34);
		contentPane.add(label7);
		
		JLabel label6 = new JLabel("");
		label6.setIcon(new ImageIcon("D:\\disco6.png"));
		label6.setBounds(70, 178, 121, 40);
		contentPane.add(label6);
		
		JLabel label5 = new JLabel("");
		label5.setIcon(new ImageIcon("D:\\disco5.png"));
		label5.setBounds(60, 217, 131, 34);
		contentPane.add(label5);
		
		JLabel label4 = new JLabel("");
		label4.setIcon(new ImageIcon("D:\\disco4.png"));
		label4.setBounds(51, 249, 152, 34);
		contentPane.add(label4);
		
		JLabel label3 = new JLabel("");
		label3.setIcon(new ImageIcon("D:\\disco3.png"));
		label3.setBounds(59, 284, 139, 34);
		contentPane.add(label3);
		
		JLabel label2 = new JLabel("");
		label2.setIcon(new ImageIcon("D:\\disco2.png"));
		label2.setBounds(52, 315, 173, 44);
		contentPane.add(label2);
		
		JLabel label1 = new JLabel("");
		label1.setIcon(new ImageIcon("D:\\disco1.png"));
		label1.setBounds(42, 354, 161, 34);
		contentPane.add(label1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\TH.png"));
		label.setBounds(10, 11, 581, 411);
		contentPane.add(label);
		label.setVisible(true);

		
		
		JButton btnRecordsd = new JButton("RECORDS :'D");
		btnRecordsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Lista lista = new Lista();
				lista.setVisible(true);
				 
				
			}
		});
		btnRecordsd.setBounds(601, 365, 121, 34);
		contentPane.add(btnRecordsd);
		
		JLabel lblMovimientos = new JLabel("MOVIMIENTOS");
		lblMovimientos.setForeground(new Color(255, 153, 0));
		lblMovimientos.setFont(new Font("Snap ITC", Font.PLAIN, 14));
		lblMovimientos.setBounds(601, 237, 149, 34);
		contentPane.add(lblMovimientos);
		
		JButton btnAC = new JButton("A - C");
		btnAC.setBounds(618, 276, 61, 26);
		contentPane.add(btnAC);
		
		JButton btnAb = new JButton("A - B");
		btnAb.setBounds(689, 276, 61, 26);
		contentPane.add(btnAb);
		
		JButton btnBa = new JButton("B - A");
		btnBa.setBounds(760, 276, 61, 26);
		contentPane.add(btnBa);
		
		JButton btnBC = new JButton("B - C");
		btnBC.setBounds(618, 315, 61, 26);
		contentPane.add(btnBC);
		
		JButton btnCA = new JButton("C - A");
		btnCA.setBounds(689, 315, 61, 26);
		contentPane.add(btnCA);
		
		JButton btnCB = new JButton("C - B");
		btnCB.setBounds(760, 315, 61, 26);
		contentPane.add(btnCB);
		
		JLabel lblHola = DefaultComponentFactory.getInstance().createLabel("HOLA " + nombre);
		lblHola.setForeground(new Color(204, 51, 102));
		lblHola.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 14));
		lblHola.setBounds(614, 24, 92, 14);
		contentPane.add(lblHola);
		String name = null;
		nombre = name;

		JButton button = new JButton("3");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Object o = e.getSource();
				    if( o instanceof JButton )
				    {
				        JButton opcion = (JButton)o;
				        if( opcion.getText().equals("3") ) TresDiscos(); 
				      
				        	    }
				}
					public void TresDiscos() {
					label1.setVisible(true);
					label2.setVisible(true);
					label3.setVisible(true);
					label4.setVisible(false);
					label5.setVisible(false);
					label6.setVisible(false);
					label7.setVisible(false);
					Label8.setVisible(false);
				}
					
		});
		button.setBounds(601, 216, 47, 23);
		contentPane.add(button);
		
		JLabel lblSeleccioneCantidadDe = new JLabel("Seleccione cantidad de discos:");
		lblSeleccioneCantidadDe.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblSeleccioneCantidadDe.setBounds(601, 178, 210, 26);
		contentPane.add(lblSeleccioneCantidadDe);
		
		JButton button1 = new JButton("4");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					label1.setVisible(true);
					label2.setVisible(true);
					label3.setVisible(true);
					label4.setVisible(true);
					label5.setVisible(false);
					label6.setVisible(false);
					label7.setVisible(false);
					Label8.setVisible(false);
				}	
			
		});
		
		JButton button_2 = new JButton("5");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				label4.setVisible(true);
				label5.setVisible(true);
				label6.setVisible(false);
				label7.setVisible(false);
				Label8.setVisible(false);
			}
		});
		button_2.setBounds(689, 216, 47, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				label4.setVisible(true);
				label5.setVisible(true);
				label6.setVisible(true);
				label7.setVisible(false);
				Label8.setVisible(false);
				
			}
		});
		button_3.setBounds(729, 216, 47, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("7");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				label4.setVisible(true);
				label5.setVisible(true);
				label6.setVisible(true);
				label7.setVisible(true);
				Label8.setVisible(false);
			}
		});
		button_4.setBounds(770, 216, 51, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("8");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				label4.setVisible(true);
				label5.setVisible(true);
				label6.setVisible(true);
				label7.setVisible(true);
				Label8.setVisible(true);
			}
		});
		button_5.setBounds(812, 216, 47, 23);
		contentPane.add(button_5);
		
		JButton button_1 = new JButton("4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				label4.setVisible(true);
				label5.setVisible(false);
				label6.setVisible(false);
				label7.setVisible(false);
				Label8.setVisible(false);
						
				
			}
				
			
		});
		button_1.setBounds(647, 216, 47, 23);
		contentPane.add(button_1);
		
		JButton btnCronmetro = new JButton("CRON\u00D3METRO");
		btnCronmetro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cronómetro crono = new Cronómetro();
				 crono.setVisible(true);
				crono.iniciarCronometro();
			}
		});
		btnCronmetro.setBounds(721, 365, 128, 34);
		contentPane.add(btnCronmetro);
		
	
	}
}

