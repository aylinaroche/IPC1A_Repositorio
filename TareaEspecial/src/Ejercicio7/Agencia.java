package Ejercicio7;
import java.util.Scanner;

public class Agencia {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.println("Bienvenido a la AGENCIA DE VIAJES\n ");
		
		int num;
		
		Clientes op1= new Clientes();
		op1.clase1();
		//Reciba información acerca del cliente
		
		System.out.println("¿Cuántos viajes desea reservar?");
		num = s.nextInt();
		
		Reservas op2 = new Reservas();
		op2.clase2();
		//De información
		
		Establecimientos op3 = new Establecimientos();
		op3.clase3();
		//De información
		
		Vuelo op4 = new Vuelo();
		op4.clase4();
		//De información
		
		System.out.println("¡Gracias por revervar en nuestra AGENCIA DE VIAJES");
		

	}

}
