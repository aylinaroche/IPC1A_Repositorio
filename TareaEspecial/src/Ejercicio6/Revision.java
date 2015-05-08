package Ejercicio6;

import java.util.Scanner;

public class Revision {

	//public static void main(String[] args) {
		public void clase3(int PrecioF){

			Scanner s= new Scanner(System.in);
			 int h, Precio, coste;
			System.out.println("Ingrese horas necesarias para realizar el trabajo");
			h = s.nextInt();
			System.out.println("Ingrese precio de material");
            coste = s.nextInt();
			
			Precio = (PrecioF*h) + 20;
			
			System.out.println("El precio del trabajo es: Q" + Precio);
		}

}
