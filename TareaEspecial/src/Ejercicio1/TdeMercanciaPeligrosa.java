package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class TdeMercanciaPeligrosa {
	public void clase4(int h){
	
	//public static void main(String[] args) {		

		Scanner s = new Scanner(System.in);
		ArrayList<String> cadena;
		
		cadena = new ArrayList<String>();
		
		int base = 700;
		int ton, cant;
		double sueldo;
			
		System.out.println("Ingrese la cantidad de toneladas transportadas");
		ton = s.nextInt();
		System.out.println("Ingrese la cantidad de transportes realizados");
		cant = s.nextInt();
		sueldo =(base +((5)*h)+(2*ton)+(50*cant));
		System.out.println("El sueldo del Conductor es Q"+ sueldo+"\n");
	
//cadena.add("El sueldo del Conductor con número de registro " + dpi +" es Q"+ sueldo);
		
	
	}
		
		
	}


