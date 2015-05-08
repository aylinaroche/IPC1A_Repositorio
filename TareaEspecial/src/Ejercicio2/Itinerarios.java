package Ejercicio2;

import java.util.Scanner;

public class Itinerarios {

	//public static void main(String[] args) {
public void clase4(){
		 Scanner s = new Scanner(System.in);
			
			int it;
		 
		 System.out.println("Ha ingresado a ITINERARIOS 2.1");
			System.out.println("1.  Código 1.1");
			System.out.println("2.  Código 1.2");
			System.out.println("3.  Código 1.3");
			
			System.out.println("Ingrese No. de código que desea ver: ");
			it = s.nextInt();
			
			switch(it){
			case 1:{
				System.out.println("CODIGO 1.1");
				System.out.println("Duración del recorrido: 2 horas");
				System.out.println("Maximo de Visitantes: 40 personas");
				System.out.println("Cantidad de especies visitadas: 15 especies");
				break;
				}
			case 2:{
				System.out.println("CODIGO 1.2");
				System.out.println("Duración del recorrido: 4 horas");
				System.out.println("Maximo de Visitantes: 20 personas");
				System.out.println("Cantidad de especies visitadas: 25 especies");
				break;
				}
			case 3:{
				System.out.println("CODIGO 1.3");
				System.out.println("Duración del recorrido: 5 horas");
				System.out.println("Maximo de Visitantes: 20 personas");
				System.out.println("Cantidad de especies visitadas: 40 especies ");
				break;
				}
	}

}
}