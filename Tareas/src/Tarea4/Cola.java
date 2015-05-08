package Tarea4;

import java.util.ArrayList;
import java.util.Scanner;

public class Cola {
// offer = añadir
	//peek devuelve el ultimo valor
	//poll devuelve y borra el primer valor de entrada
	
	
	private ArrayList<Object> cola = new ArrayList<Object>();
	
	public void offer(Object o){
		cola.add(o);
		
		
	}
		public Object peek(){
			if(!(cola.isEmpty())){
			return cola.get(0);
		}else{
			return null;
		}
		}	
	public Object pull(){
		if(!(cola.isEmpty())){
		  Object o = cola.get(0);
			cola.remove(0);
		return o;
		
		}else{
			return null;
		}
		
	}
		
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Ingrese 3 datos para la COLA:");
	String a, b, c;
	a = s.next();
	b = s.next();
	c = s.next();
	
     Cola  Cola = new Cola(); 
    
     Cola.offer(a);
     Cola.offer(b);
     Cola.offer(c);
     
     System.out.println("COLA NORMAL");
	    System.out.println("Valor:"); 
		System.out.println(Cola.peek()); 

		System.out.println(" "); 
	
		System.out.println("Datos ingresados"); 

		while(Cola.empty()==false){ 
		System.out.println(Cola.pull()); 
		
		}
		System.out.println(" ");
		 System.out.println("CON LOS MÉTODOS DE UNA PILA");
		 Cola.offer(c);
	     Cola.offer(b);
	     Cola.offer(a);
	     
	     System.out.println("Valor:");
		 System.out.println(Cola.peek());
}
boolean empty() {
	
	return cola.isEmpty();
}
}


