package Ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;

public class Sueldo {
	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			ArrayList<String> cadena;
					
			cadena = new ArrayList<String>();
				
			int trans, h,f=0,d;
			System.out.println("Bienvenido al programa SUELDO A PAGAR\n");
			
			do{
				Conductor cond = new Conductor();
				cond.clase1();
				//Reciba los datos del conductor
				
				System.out.println("Ingrese cantidad de horas trabajadas por el Conductor");
				h = s.nextInt();		
				
				System.out.println("TIPOS DE TRANSPORTE");
				System.out.println("1. Transporte de Personas");
				System.out.println("2. Transporte de Mercancías");
				System.out.println("3. Transporte de Mercancías Peligrosas\n");
						
				System.out.println("Ingrese número de transporte utilizado");
				trans =s.nextInt();
											
		switch(trans){
				case 1:{
					TransporteDePersonas trans1 = new TransporteDePersonas();
					trans1.clase2(h);
					//Calculo del sueldo para este tipo de transporte
					break;
										}
				case 2:{
					TransporteDeMercancias trans2 = new TransporteDeMercancias();
					trans2.clase3(h);	
					//Calculo del sueldo para este tipo de transporte
					break;
				}
				case 3: {
					TdeMercanciaPeligrosa trans3 = new TdeMercanciaPeligrosa();
				trans3.clase4(h);	
				//Calculo del sueldo para este tipo de transporte
			
				break;
				}
		}
			System.out.println("¿Desea agregar otro conductor?");
			System.out.println("Si = 1, No = 0");
			System.out.println("____________________________________________________________");
			d = s.nextInt();
			
			f++;
					}
					while(d!=0); 
				/*	
					for(int i =0;i<cadena.size();i++){
						
						System.out.println("-"+ cadena.get(i));
				
					}*/
					}
}
