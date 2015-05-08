package Ejercicio7;

import java.util.Scanner;

public class Establecimientos {

	//public static void main(String[] args) {
	public void clase3(){
Scanner s = new Scanner(System.in);
		
		int estab;
		System.out.println("Tipos de Establecimientos: ");
		System.out.println("1. Apartamento");
		System.out.println("2. Hotel;");
		System.out.println("3. Albergue");
		
		estab = s.nextInt();
		
	switch(estab){
		
	case 1:{
		System.out.println("APARTAMENTO");
		System.out.println("Precio total = Precio requerido por alojamiento*1.15");
		break;
	}
	case 2:{
		System.out.println("HOTEL");
		System.out.println("Precio total = Precio requerido por alojamiento*1.1");
		break;
		
	}
	case 3:{
		System.out.println("ALBERGUE");
		System.out.println("Precio total = Precio requerido por alojamiento*1.02");
		break;
	}
	}

	}

}
