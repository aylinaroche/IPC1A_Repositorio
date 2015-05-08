package Ejercicio4;

import java.util.Scanner;

public class Encargados {
	
	public void clase5(){

	Scanner s= new Scanner(System.in);
	
	double SueldoB,SueldoM, extras, SueldoT;
	int com, i, sum, conT=0;
	System.out.println("Ingrese sueldo base");
	SueldoB = s.nextDouble();
	System.out.println("Cantidad de comerciales a su cargo");
	com = s.nextInt();
	
	
	System.out.println("Cantidad de contratos conseguidos por cada comercial:");

	for(i=1;i<com+1;i++){
								
			System.out.println(i +".");
			sum = s.nextInt();
			conT = conT + sum;
	}
	System.out.println("La cantidad total de contratos es " + conT);
	SueldoT=(SueldoB + (0.1*SueldoB*conT));
	System.out.println("Su sueldo total es: " + SueldoT);
	

}
}
