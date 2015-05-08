package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;
public class TransporteDePersonas {
	
public	 void clase2(int h){

//	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<String> cadena;
		
		cadena = new ArrayList<String>();
		
		int p;
		int base = 700;
		
		double sueldo;
		
		System.out.println("Ingrese número de personas transportadas");
		p = s.nextInt();

if(p>9){
	sueldo = (base+(5+1)*h);
	System.out.println("Ha realizado un Transporte colectivo");
	System.out.println("El sueldo del conductor es Q"+ sueldo+"\n");
	
	//cadena.add("El sueldo del Conductor con número de registro " + dpi +" es Q"+ sueldo);
	

} else{
	sueldo = (base+(5+0.5)*h);
	System.out.println("No se ha realizado un Transporte colectivo");
	
	System.out.println("El sueldo del Conductor es Q"+ sueldo+"\n");
	
	//cadena.add("El sueldo del Conductor con número de registro " + dpi +" es Q"+ sueldo);
	
}

	}


}
