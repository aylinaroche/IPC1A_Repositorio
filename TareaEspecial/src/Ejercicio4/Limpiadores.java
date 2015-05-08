package Ejercicio4;

import java.util.Scanner;

public class Limpiadores {

	// public static void main(String[] args) {
public void clase2(){
	Scanner s = new Scanner(System.in);
		
	double SueldoB,SueldoM, extras, SueldoT;
	
		System.out.println("Ingrese sueldo base");
		SueldoB = s.nextDouble();
		System.out.println("Horas fuera de horario");
		int h;
		h = s.nextInt();
		SueldoT = (SueldoB + (0.005*SueldoB*h));
		System.out.println("Sueldo total es " + SueldoT);
	}

}
