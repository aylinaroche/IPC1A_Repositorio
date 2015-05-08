package Intento;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class opcion extends JPanel {

	/**
	 * Create the panel.
	 */
	public opcion() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione la cantidad de aros:");
		lblNewLabel.setBounds(1, 1, 337, 34);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		add(lblNewLabel);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(65, 1, 64, 34);
		add(label_6);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(129, 1, 64, 34);
		add(label_5);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(193, 1, 64, 34);
		add(label_7);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(257, 1, 64, 34);
		add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(321, 1, 64, 34);
		add(label_4);
		
		JCheckBox checkBox = new JCheckBox("3");
		checkBox.setBounds(1, 35, 64, 34);
		add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("4");
		checkBox_1.setBounds(65, 35, 64, 34);
		add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("5");
		checkBox_2.setBounds(129, 35, 64, 34);
		add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("6");
		checkBox_3.setBounds(193, 35, 64, 34);
		add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("7");
		checkBox_4.setBounds(257, 35, 64, 34);
		add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("8");
		checkBox_5.setBounds(321, 35, 64, 34);
		add(checkBox_5);
		
		JLabel label = new JLabel("");
		label.setBounds(1, 69, 64, 34);
		add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(65, 69, 64, 34);
		add(label_1);
		
		JButton btnIniciar = new JButton("INICIAR");
		btnIniciar.setBounds(109, 69, 84, 34);
		add(btnIniciar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(193, 69, 84, 34);
		add(btnSalir);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(257, 69, 64, 34);
		add(label_2);

	}

}
