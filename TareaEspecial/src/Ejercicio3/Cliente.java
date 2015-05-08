package Ejercicio3;

import java.util.Scanner;

public class Cliente {

//	public static void main(String[] args) {
		public void clase1(){
			
				Scanner s = new Scanner(System.in);
		int dpi, tel;
		String name;
			
		System.out.println("Ingrese la información del Cliente");
	
		System.out.println("Nombre del Conductor: ");
		name = s.nextLine();		
		System.out.println("Número de DPI: ");
		dpi = s.nextInt();
		System.out.println("Número de Teléfono: ");
		tel = s.nextInt();
				
	}

}
