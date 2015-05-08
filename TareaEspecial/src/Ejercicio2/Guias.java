package Ejercicio2;

import java.util.Scanner;

public class Guias {

	//public static void main(String[] args) {
	public void clase5(){	
	Scanner s = new Scanner(System.in);
			
			int gui;
		 
		 
		 System.out.println("Ha ingresado a GUIAS 2.1");
			System.out.println("1. Sebastian Aroche");
			System.out.println("2. Diana Martinez");
			System.out.println("3. Mike Garcia");

			
			System.out.println("Ingrese No. de Guia que desea ver: ");
			gui = s.nextInt();
			
			switch(gui){
			case 1:{
				System.out.println("SEBASTIAN AROCHE");
				System.out.println("Dirección: Zona 4");
				System.out.println("Teléfono: 59019945");
				System.out.println("Fecha de inicio: 20/10/2009");
				System.out.println("Itinerarios a su cargo: Código 1.3 - Código 1.1");
				break;
				}
			case 2:{
				System.out.println("DIANA MARTINEZ");
				System.out.println("Dirección: Zona 2");
				System.out.println("Teléfono: 558284863");
				System.out.println("Fecha de inicio: 04/12/2012");
				System.out.println("Itinerarios a su cargo: Código 1.2");
				break;
				}
			case 3:{
				System.out.println("MIKE GARCIA");
				System.out.println("Dirección: Zona 12");
				System.out.println("Teléfono: 55989442");
				System.out.println("Fecha de inicio: 25/05/2010");
				System.out.println("Itinerarios a su cargo: Código 1.1");
				break;
				}
			

	}
	}
}
