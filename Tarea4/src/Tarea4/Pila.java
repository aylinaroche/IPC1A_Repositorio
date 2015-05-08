package Tarea4;

import java.util.ArrayList;
import java.util.Scanner;

public class Pila {
	//Push = Poner un valor en la pila
	//Pop = Sacar un valor de la pila
	//peek = Devuelve el último valor

private ArrayList<Object> pila= new ArrayList();
	
	public void push (Object o){
			pila.add(o);
	
	}
		public Object pop (){
		
	       if(!(pila.isEmpty())){
               Object o = pila.get(pila.size()-1);
               pila.remove(pila.size()-1);
               return o;
       }else{
               return null;
       }
	       
	}

	public Object peek(){
			
		 if(!(pila.isEmpty())){
             return pila.get(pila.size()-1);
     }else{
             return null;
     }
		 
	}

	public boolean empty(){
			 return pila.isEmpty();
	}
	
	
	
	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
		System.out.println("Ingrese 3 datos para la PILA:");
		String a, b, c;
		a = s.next();
		b = s.next();
		c = s.next();
				
		Pila p = new Pila();
		
		p.push(a);
		p.push(b);
	    p.push(c);
	    System.out.println("PILA NORMAL");
	    System.out.println("Valor:"); 
		System.out.println(p.peek()); 

		System.out.println(" "); 
	
		System.out.println("Datos ingresados"); 

		while(p.empty()==false){ 
		System.out.println(p.pop()); 
		
		}
		System.out.println(" ");
		 System.out.println("CON LOS MÉTODOS DE UNA COLA");
		 
		 p.push(c);
		 p.push(b);
		 p.push(a);
		 System.out.println("Valor:");
		 System.out.println(p.peek());
	}


}
