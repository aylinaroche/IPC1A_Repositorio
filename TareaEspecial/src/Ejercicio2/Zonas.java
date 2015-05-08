package Ejercicio2;

import java.util.Scanner;

public class Zonas {

//	public static void main(String[] args) {
	public void clase3(){
		 Scanner s = new Scanner(System.in);
			
			int zona;
		 
		 
		 System.out.println("Ha ingresado a ZONAS 2.1");
			System.out.println("1. Laguna");
			System.out.println("2. Pradera");
			System.out.println("3. Montaña");
			System.out.println("4. Granja");
			
			System.out.println("Ingrese No. de zona que desea ver: ");
			zona = s.nextInt();
			
			switch(zona){
			case 1:{
				System.out.println("LAGUNA");
				System.out.println("Extensión: 20 metros cuadrados ");
				break;
				}
			case 2:{
				System.out.println("PRADERA");
				System.out.println("Extensión: 10 x 30 metros ");
				break;
				}
			case 3:{
				System.out.println("MONTAÑA");
				System.out.println("Extensión: 30 metros ");
				break;
				}
			case 4:{
				System.out.println("GRANJA");
				System.out.println("Extensión: 20 metros cuadrados ");
				break;
				}
	}

}
}
