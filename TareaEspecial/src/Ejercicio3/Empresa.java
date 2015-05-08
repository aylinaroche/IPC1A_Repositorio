package Ejercicio3;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		
   System.out.println("Bienvenido a RESERVA UN AUTOMÓVIL\n");
   Scanner s = new Scanner(System.in);
  
   String FechaIn;
	
	 
	 System.out.println("Ingrese fecha de inicio de reserva: ");
		FechaIn = s.next();
      
  Cliente Alquiler = new Cliente();
	Alquiler.clase1();
	//Reciba información acerca del cliente
		
	Reserva Alquiler1 = new Reserva();
	Alquiler1.clase2();
	////De la información acerca de las reservas
		
	Automoviles Alquiler2 = new Automoviles();
	Alquiler2.clase3();
	//De la información acerca de los automóviles disponibles
	
	 String FechaFin;
		System.out.println("Ingrese fecha de final de reserva: ");
		FechaFin = s.next();

		
		
	System.out.println("FELIZ DIA");
	}

}
