package Ejercicio5;

import java.util.Scanner;

public class Artistas {
public void clase3(){
	
	  Scanner s = new Scanner(System.in);
	  int art; 
	  System.out.println("ARTISTAS\n");
	  System.out.println("1. Artista 1");
	  System.out.println("2. Artista 2");
	  System.out.println("Seleccione el número:");
	  art = s.nextInt();
	  
	switch(art){
	
	case 1:{
		System.out.println("ARTISTA 1");
		System.out.println("Fecha de nacimiento: ");
		System.out.println("País de Origen: ");
		System.out.println("Época:");
		System.out.println("Estilo Principal:");
		System.out.println("Descripción: \n");
	}
	case 2:{
		System.out.println("ARTISTA 2");
		System.out.println("Fecha de nacimiento: ");
		System.out.println("País de Origen: ");
		System.out.println("Época:");
		System.out.println("Estilo Principal:");
		System.out.println("Descripción: \n");
	}
	}
	
	
}
}