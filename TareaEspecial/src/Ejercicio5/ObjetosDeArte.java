package Ejercicio5;

import java.util.Scanner;

public class ObjetosDeArte {

//	public static void main(String[] args) {
public void clase2(){
		 Scanner s = new Scanner(System.in);
		  int n, tipo, pert; 
		  System.out.println("OBJETOS DE ARTE\n");
		  System.out.println("Los objetos de arte se clasifican: ");
		  System.out.println("1.- TIPO");
		  System.out.println("2.- PERTENENCIA");
		  System.out.println("Seleccione que desea ver; ");
		  n = s.nextInt();
	
	switch (n){
	
	case 1:{
		System.out.println("TIPO");
		System.out.println("1. Pinturas");
		System.out.println("2. Esculturas");
		System.out.println("Ingrese número:");
		tipo = s.nextInt();
		
		switch (tipo){
		
		case 1:{
			System.out.println("PINTURA");
			System.out.println("Tipo de Pintura");
			System.out.println("Soporte");
			System.out.println("Estilo\n");
			break;
		}
		
		case 2:{
			System.out.println("ESCULTURA");
			System.out.println("Material");
			System.out.println("Altura");
			System.out.println("Peso\n");
			break;
		}
		}break;
		
	}
	
	case 2: {
		System.out.println("PERTENENCIA");
		System.out.println("1. Objetos en préstamo");
		System.out.println("2. Objetos de colección permanente");
		System.out.println("Ingrese número:");
		pert = s.nextInt();
		
		switch (pert){
		
		case 1:{
			System.out.println("OBJETOS DE PRÉSTAMO");
			System.out.println("Nombre de colección");
			System.out.println("Fecha de préstamo");
			System.out.println("Fecha de devolución\n");
			break;
		}
		case 2: {
			System.out.println("OBJETOS PERMANENTES");
			System.out.println("Fecha de Adquisición: ");
			System.out.println("Ubicación: \n");
			break;
		}
	
	}break;
		
	}
	
	}
	
	}
	
	

}
