package Intento;
import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	public class Discos {

		//private ImageIcon disco1 = new ImageIcon("Graficos\\disco1.png");
		private ImageIcon disco1 = new ImageIcon("/disco1.png");
		private ImageIcon disco2 = new ImageIcon("/disco2.png");
		private ImageIcon disco3 = new ImageIcon("/disco3.png");
		private ImageIcon disco4 = new ImageIcon("/disco4.png");
		private ImageIcon disco5 = new ImageIcon("/disco5.png");
		private ImageIcon disco6 = new ImageIcon("/disco6.png");
		private ImageIcon disco7 = new ImageIcon("/disco7.png");
		private ImageIcon disco8 = new ImageIcon("/disco8.png");
		
	public static void generarDiscos(JFrame ventana, String Discos){
			
			Discos jn = new Discos();
			JLabel disco1 = new JLabel(jn.disco1);
			JLabel disco2 = new JLabel(jn.disco2);
			JLabel disco3 = new JLabel(jn.disco3);
			JLabel disco4 = new JLabel(jn.disco4);
			JLabel disco5 = new JLabel(jn.disco5);
			JLabel disco6 = new JLabel(jn.disco6);
			JLabel disco7 = new JLabel(jn.disco7);
			JLabel disco8 = new JLabel(jn.disco8);
			
			final int y[] ={485,445,405,365,325,285,245,205};
			
			int d = Integer.parseInt(Discos);
			
			//GENERANDO DISCOS
			if(d==3){
				disco3.setBounds(45, y[0], 240, 40);
				disco2.setBounds(45, y[1], 240, 40);
				disco1.setBounds(45, y[2], 240, 40);
				ventana.add(disco3);
				ventana.add(disco2);
				ventana.add(disco1);
				ventana.repaint();
			}else if(d==4){
				disco4.setBounds(45, y[0], 240, 40);
				disco3.setBounds(45, y[1], 240, 40);
				disco2.setBounds(45, y[2], 240, 40);
				disco1.setBounds(45, y[3], 240, 40);
				ventana.add(disco4);
				ventana.add(disco3);
				ventana.add(disco2);
				ventana.add(disco1);
				ventana.repaint();
			}else if (d==5){
				disco5.setBounds(45, y[0], 240, 40);
				disco4.setBounds(45, y[1], 240, 40);
				disco3.setBounds(45, y[2], 240, 40);
				disco2.setBounds(45, y[3], 240, 40);
				disco1.setBounds(45, y[4], 240, 40);
				ventana.add(disco5);
				ventana.add(disco4);
				ventana.add(disco3);
				ventana.add(disco2);
				ventana.add(disco1);
				ventana.repaint();
			}else if(d==6){
				disco6.setBounds(45, y[0], 240, 40);
				disco5.setBounds(45, y[1], 240, 40);
				disco4.setBounds(45, y[2], 240, 40);
				disco3.setBounds(45, y[3], 240, 40);
				disco2.setBounds(45, y[4], 240, 40);
				disco1.setBounds(45, y[5], 240, 40);
				ventana.add(disco6);
				ventana.add(disco5);
				ventana.add(disco4);
				ventana.add(disco3);
				ventana.add(disco2);
				ventana.add(disco1);
				ventana.repaint();
			}else if (d==7){
				disco7.setBounds(45, y[0], 240, 40);
				disco6.setBounds(45, y[1], 240, 40);
				disco5.setBounds(45, y[2], 240, 40);
				disco4.setBounds(45, y[3], 240, 40);
				disco3.setBounds(45, y[4], 240, 40);
				disco2.setBounds(45, y[5], 240, 40);
				disco1.setBounds(45, y[6], 240, 40);
				ventana.add(disco7);
				ventana.add(disco6);
				ventana.add(disco5);
				ventana.add(disco4);
				ventana.add(disco3);
				ventana.add(disco2);
				ventana.add(disco1);
				ventana.repaint();
			}else{
				disco8.setBounds(45, y[0], 240, 40);
				disco7.setBounds(45, y[1], 240, 40);
				disco6.setBounds(45, y[2], 240, 40);
				disco5.setBounds(45, y[3], 240, 40);
				disco4.setBounds(45, y[4], 240, 40);
				disco3.setBounds(45, y[5], 240, 40);
				disco2.setBounds(45, y[6], 240, 40);
				disco1.setBounds(45, y[7], 240, 40);
				ventana.add(disco8);
				ventana.add(disco7);
				ventana.add(disco6);
				ventana.add(disco5);
				ventana.add(disco4);
				ventana.add(disco3);
				ventana.add(disco2);
				ventana.add(disco1);
				ventana.repaint();
			}
			
		}

	}

