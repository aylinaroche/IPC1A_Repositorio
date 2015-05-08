package Ejercicio2;

import java.util.Scanner;

public class Especies {

	public void clase1(){
		Scanner s = new Scanner(System.in);
		
		int num, Mam, Av, Rep, Pec, Ins;
		
		System.out.println("Ha ingresado a ESPECIES 2.1");
	/*	System.out.println("1. Mamíferos");
		System.out.println("2. Aves");
		System.out.println("3. Reptiles");
		System.out.println("4. Peces");
		System.out.println("5. Insectos");
		
		System.out.println("Ingrese No. del grupo que desea ver;");
		num = s.nextInt();
		
		switch(num){
		case 1:{
		
		*/
			System.out.println("MAMÍFEROS 2.0");
			System.out.println("1. Guepardo");
			System.out.println("2. Lobo");
			System.out.println("3. León");
			System.out.println("4. Mono Araña");
			System.out.println("5. Elefante");
			
			System.out.println("Ingrese No. de mamifero que desea ver: ");
			Mam = s.nextInt();
			
			switch(Mam){
			case 1:{
				System.out.println("GUEPARDO 2.0");
				System.out.println("Nombre científico: Acynonyx jubatus");
				System.out.println("Es un felino de gran tamaño que habita en la mayor parte de África y partes de Irán");
				break;
				}
			case 2:{
				System.out.println("LOBO 2.0");
				System.out.println("Nombre científico: Canis lupus");
				System.out.println("Es una especie de mamífero placentario del Orden de los carnívoros");
				break;
			}
			case 3:{
				System.out.println("LEON 2.0");
				System.out.println("Nombre científico: Panthera leo");
				System.out.println("El león es uno de los cinco grandes felinos en el género Panthera y un miembro de la familia Felidae");
				break;
				}
			case 4:{
				System.out.println("MONO ARAÑA 2.0");
				System.out.println("Nombre científico: Ateles geoffroyi");
				System.out.println("Es el nombre común de cualquiera de los primates del género Ateles");
				break;
				}
			case 5:{
				System.out.println("ELEFANTE 2.0");
				System.out.println("Nombre científico: Elephas maximus");
				System.out.println("Estos son los grandes mamíferos terrestres con un tronco y colmillos");
				break;
				}
				
				
									}
			
		
	}
	
	
}
