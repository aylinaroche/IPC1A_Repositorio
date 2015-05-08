package Ejercicio6;
import java.util.Scanner;

public class RepMecanica {
	//public static void main(String[] args) {
		public void clase1(int PrecioF){

			int Precio, coste, h;
			Scanner s= new Scanner(System.in);
			
			System.out.println("Ingrese horas necesarias para realizar el trabajo");
			h = s.nextInt();
			System.out.println("Ingrese precio de material");
			coste = s.nextInt();
			
			Precio = (PrecioF*h) + (coste*2);
			
			System.out.println("El precio del trabajo es: Q" + Precio);
			
			
	}

}
