package TorresHanoi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Lista extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private String [][]matriz ={};
	private String []vector = {"No.","Nombre", "Punteo"};
	private DefaultTableModel modelo = new DefaultTableModel(matriz, vector);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista frame = new Lista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param nombre 
	 */
	public Lista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(368, 173, -318, -128);
		contentPane.add(table);
	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(374, 29, -362, 203);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setBounds(133, 209, 326, -140);
		contentPane.add(table_1);
	}

}
