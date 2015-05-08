package Ejercicio5;

import java.util.Scanner;

public class Museo {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
     
    int info;
    
    System.out.println("Bienvenidos a APP MUSEO\n");
    System.out.println("1.- Colecciones: ");
    System.out.println("2.- Objetos de Arte: ");
    System.out.println("3.- Artistas:");
    System.out.println("4.- Exposiciones: ");
    System.out.println("Seleccione que desea ver:"); 
   info = s.nextInt();
   
   switch (info){
   case 1:{
    Colecciones op1 = new Colecciones();
    op1.clase1();
    //De información
    break;
   }
   
   case 2:{
    ObjetosDeArte op2 = new ObjetosDeArte();
    op2.clase2();
    //De información
    break;
   }
   case 3:{
    Artistas op3 = new Artistas();
    op3.clase3();
    //De información
    break;
   }
   case 4:{
    Exposiciones op4 = new Exposiciones();
    op4.clase4();
    //De información
    break;
   }}
    

		
		
		

	}

}
