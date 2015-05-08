package Ejercicio2;

import java.util.Scanner;

public class Hábitats {

//	public static void main(String[] args) {
 public void clase2(){
	 Scanner s = new Scanner(System.in);
		
		int hab;
	 
	 
	 System.out.println("Ha ingresado a HÁBITATS 2.1");
		System.out.println("1. Bosque");
		System.out.println("2. Desierto");
		System.out.println("3. Montaña");
		System.out.println("4. Río");
		System.out.println("5. Pantano");
		
		System.out.println("Ingrese No. de hábitat que desea ver: ");
		hab = s.nextInt();
		
		switch(hab){
		case 1:{
			System.out.println("BOSQUE");
			System.out.println("Clima: Templado, Tropical, Subtropical");
			System.out.println("Vegetación: Bosque de frondosa, coníferas y mixto ");
			System.out.println("Continentes: Asia, Oceanía, África, América, Europa");
			break;
			}
		case 2:{
			System.out.println("DESIERTO");
			System.out.println("Clima: Caluroso  ");
			System.out.println("Vegetación: plantas espinosas, como los cactus y matorrales");
			System.out.println("Continentes: África");
			break;
		}
		case 3:{
			System.out.println("MONTAÑA");
			System.out.println("Clima: Templado, húmedo");
			System.out.println("Vegetación: Praderas");
			System.out.println("Continentes:  América");
			break;
			}
		case 4:{
			System.out.println("RIO");
		    System.out.println("Clima: Frío, húmedo");
		    System.out.println("Vegetación: Algas");
		    System.out.println("Continentes: América, Asía, Oceanía ");
			break;
			}
		case 5:{
			System.out.println("Pantano");
			System.out.println("Clima: Húmedo");
			System.out.println("Vegetación: Algas, Valles");
			System.out.println("Continentes: África, Europa, Asia");
			break;
			}
			
			
								}
		

		
		
		
		
		
	}

}
