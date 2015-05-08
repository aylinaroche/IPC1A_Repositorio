package Ejercicio3;

import java.util.Scanner;

public class Automoviles {

	//public static void main(String[] args) {
		public void clase3(){
			

			Scanner s = new Scanner(System.in);
		 int marca;
				
			System.out.println("1. Ford");
			System.out.println("2. BMW");
			System.out.println("3. Chevrolet");
			System.out.println("4. Honda");
			System.out.println("5. Isuzu\n");

			System.out.println(" Ingrese el número de la marca que desea reservar;");
			marca = s.nextInt();
		String color;
		String modelo;
	switch (marca){
	
	case 1:{
		System.out.println("FORD disponibles");
		System.out.println("Colores: Rojo, Azul, Gris");
		System.out.println("Modelo: 2014, 2012, 2000");
		System.out.println("Precio: Q20000\n");
		
		System.out.println("Ingrese el color que desea:");
		
		color = s.next();
		
		System.out.println("Ingrese el modelo que desea:");
		
		modelo = s.next();
		
		System.out.println("¡GRACIAS POR SU RESERVA!");
		System.out.println("Usted a reservado un FORD / Modelo " + modelo +"/ Color "+ color+ " / Matrícula P CTRL2015");
		break;
	}
	
	case 2:{
		System.out.println("BMW disponibles");
		System.out.println("Colores: Rojo");
		System.out.println("Modelo: 2012, 2000");
		System.out.println("Precio: Q40000\n");
		
		System.out.println("Ingrese el color que desea:");
		
		color = s.next();
		
		System.out.println("Ingrese el modelo que desea:");
		
		modelo = s.next();
		
		System.out.println("¡GRACIAS POR SU RESERVA!\n");
		System.out.println("Usted a reservado un BMW / Modelo " + modelo +"/ Color "+ color+ " / Matrícula P CTRL2015");
		break;
	}
	case 3:{
		System.out.println("CHEVROLET disponibles");
		System.out.println("Colores: Verde, Azul");
		System.out.println("Modelo: 2012, 2000, 1996");
		System.out.println("Precio: Q15000\n");
		
		System.out.println("Ingrese el color que desea:");
				color = s.next();
		
		System.out.println("Ingrese el modelo que desea:");
				modelo = s.next();
		
		System.out.println("¡GRACIAS POR SU RESERVA!\n");
		System.out.println("Usted a reservado un Chevrolet / Modelo " + modelo +"/ Color "+ color+ " / Matrícula P CTRL2015");
		break;
	}
	case 4:{
		System.out.println("HONDA disponibles");
		System.out.println("Colores:  Azul, Gris, Beige");
		System.out.println("Modelo: 2013, 2000, 2011");
		System.out.println("Precio: Q20000\n");
		
		System.out.println("Ingrese el color que desea:");
				color = s.next();
		
		System.out.println("Ingrese el modelo que desea:");
				modelo = s.next();
		
		System.out.println("¡GRACIAS POR SU RESERVA!\n");
		System.out.println("Usted a reservado un HONDA / Modelo " + modelo +"/ Color "+ color+ " / Matrícula P CTRL2015");
		break;
	}
	case 5:{
		System.out.println("ISUZU disponibles");
		System.out.println("Colores: Rojo, Azul, Gris");
		System.out.println("Modelo: 2014, 2012, 2000");
		System.out.println("Precio: Q25000\n");
		
		System.out.println("Ingrese el color que desea:");
				color = s.next();
		
		System.out.println("Ingrese el modelo que desea:");
				modelo = s.next();
		
		System.out.println("¡GRACIAS POR SU RESERVA!\n");
		System.out.println("Usted a reservado un ISUZU / Modelo " + modelo +"/ Color "+ color+ " / Matrícula P CTRL2015");
		break;
	}
	}
		
		
	}

}
