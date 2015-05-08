package Ejercicio7;

import java.util.Scanner;

public class Clientes {

	//public static void main(String[] args) {
	public void clase1(){
		//\n
		Scanner s = new Scanner(System.in);
		int dpi, tel;
		String name, direc, ciudad; 
		
		System.out.println("Ingrese los datos del Cliente");
		System.out.println("NOMBRE: ");
		name = s.nextLine();
		System.out.println("DPI: ");
		dpi = s.nextInt();
		System.out.println("DIRECCIÓN:");
		direc = s.next();
		System.out.println("TELÉFONO:");
		tel = s.nextInt();
		System.out.println("CIUDAD: ");
		ciudad = s.next();
	}

}
