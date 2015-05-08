package Ejercicio4;

import java.util.Scanner;

public class Comerciales {

	//public static void main(String[] args) {
		public void clase3(){
			Scanner s= new Scanner(System.in);
			
			double SueldoB,SueldoM, extras, SueldoT;
			
		System.out.println("Ingrese sueldo base");
		SueldoB = s.nextDouble();
		System.out.println("Cantidad de contratos conseguidos");
		int cant;
		cant = s.nextInt();
		SueldoT = (SueldoB + (0.01*SueldoB*cant));
		System.out.println("Sueldo total es " + SueldoT);
	}

}
