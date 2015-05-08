package Intento;

	import java.awt.Checkbox;
	import java.awt.FlowLayout;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;

	public class checkbox extends JFrame{
	    private JButton botonGuardar;
	    private JButton botonSalir;
	    private Checkbox checkBox1;
	    private Checkbox checkBox2;
	    private Checkbox checkBox3;
	    private Checkbox checkBox4;
	   
	    public checkbox(){
	        super("Prueba"); //Establecemos un titulo a nuestra ventana
	        setLayout(new FlowLayout());
	        //creamos nuestro boton "guardar".
	        botonGuardar = new JButton("Guardar");
	        botonSalir = new JButton("   Salir   ");
	        //Creamos nuestros CheckBox, inicializados en false.
	        checkBox1 = new Checkbox("checkBox1", false);
	        checkBox2 = new Checkbox("checkBox2", false);
	        checkBox3 = new Checkbox("checkBox3", false);
	        checkBox4 = new Checkbox("checkBox4", false);
	       
	        //Adicionamos nuestros elementos al panel
	        add(checkBox1);
	        add(checkBox2);
	        add(checkBox3);
	        add(checkBox4);
	        add(botonGuardar);
	        add(botonSalir);
	       
	        //Establecemos la dimension de la ventana
	        setSize(170, 220);
	        setVisible(true);          
	    }
	   
	    //Este metodo se encarga de manejar los eventos que suceden
	    //al presionar el boton guardar y los CheckBox
	    public void manejadorEventos(){
	        //eventos que ocurren al presionar el botonGuardar
	        botonGuardar.addMouseListener(new MouseAdapter() {
	            //Metodos que ocurren al hacer check en algun checkBox
	            public void mousePressed(MouseEvent e) {
	                if(checkBox1.getState()==true){
	                    JOptionPane.showMessageDialog(null, "Se hizo check en el checkBox1");
	                }
	                if(checkBox2.getState()==true){
	                    JOptionPane.showMessageDialog(null, "Se hizo check en el checkBox2");
	                }
	                if(checkBox3.getState()==true){
	                    JOptionPane.showMessageDialog(null, "Se hizo check en el checkBox3");
	                }
	                if(checkBox4.getState()==true){
	                    JOptionPane.showMessageDialog(null, "Se hizo check en el checkBox4");
	                }
	            }
	        });
	       
	        //sale del programa al presionar en el boton salir
	        botonSalir.addMouseListener(new MouseAdapter() {
	            public void mousePressed(MouseEvent e) {
	                System.exit(0);
	            }
	        });
	    }
	   
	    public static void main(String[] args) {
	    	checkbox test = new checkbox();
	        test.setLocationRelativeTo(null);
	        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        test.manejadorEventos();
	    }
	
}
