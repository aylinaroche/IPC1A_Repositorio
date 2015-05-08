package Ejercicio6;

import java.util.Scanner;

public class RepPintura {

	//public static void main(String[] args) {
		public void clase2(int PrecioF){

			Scanner s= new Scanner(System.in);
			int h, coste, Precio;
			
			System.out.println("Ingrese horas necesarias para realizar el trabajo");
			h = s.nextInt();
			System.out.println("Ingrese precio de material");
              coste = s.nextInt();
			
			Precio = (PrecioF*h) + (coste*3);
			
			System.out.println("El precio del trabajo es: Q" + Precio);
	}

}
