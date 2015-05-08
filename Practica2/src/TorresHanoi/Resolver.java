package TorresHanoi;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;


public class Resolver extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	
	public Resolver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscribaElNmero = new JLabel("Escriba el numero de aros:");
		lblEscribaElNmero.setBounds(41, 62, 301, 51);
		contentPane.add(lblEscribaElNmero);
		
		JLabel lblSolucin = new JLabel("SOLUCI\u00D3N");
		lblSolucin.setBounds(170, 11, 110, 51);
		contentPane.add(lblSolucin);
		
		
		
		textField = new JTextField();
		String n = textField.getText();
//	int  num = Integer.parseInt(n);
		textField.setBounds(140, 124, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAlgoritmo = new JLabel("ALGORITMO");
		lblAlgoritmo.setBounds(41, 155, 116, 36);
		contentPane.add(lblAlgoritmo);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				JTextPane txtpnFasdfasd = new JTextPane();
				txtpnFasdfasd.setText("");
				txtpnFasdfasd.setBounds(85, 190, 245, 60);
				contentPane.add(txtpnFasdfasd);			
				Solucion s = new Solucion();
				
				
		btnMostrar.setBounds(305, 124, 89, 23);
		contentPane.add(btnMostrar);
		
		JLabel lblNewLabel = new JLabel("");
		
		
			}
		}
		
	}
}

public void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Resolver frame = new Resolver();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
	
}
	/*
	 * class Solucion {

		public void Hanoi(int num, int inicio, int temp, int fin){
			
			if (num ==1){
				System.out.println("Moviendo de torre inicio "+ inicio +" a la torre de destino " + fin);
				
			} else {
				Hanoi(num-1, inicio, fin, temp);
				System.out.println("Moviendo de torre inicio "+ inicio +" a la torre de destino " + fin);
				Hanoi(num-1, temp, inicio, fin);
				
			}
			}
			}
		}*/
	 */
	