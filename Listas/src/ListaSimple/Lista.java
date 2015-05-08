package ListaSimple;



public class Lista {

	
	Nodo inicio = null;
	
	void agregar(int elemento){
		if(inicio ==null)
			inicio = new Nodo(elemento);
		else{
			Nodo tmp = inicio;
			inicio.siguiente = tmp;
			
			
		}
		
	}
	void Mostrar(){ 
		Nodo tmp = inicio;
		
		if(tmp== null)
			System.out.println("Lista vacia");
		
		else{
			System.out.print("[");
		
		while (tmp!=null){
			System.out.print(tmp.elemento);
			inicio = tmp.siguiente;
			System.out.print("]");
		break;
		}
		}
		}
	
}
/*
if(inicio!=null){
	Persona aux = inicio;
	while(aux!=null){
		System.out.println(aux.nombre+"->");
		aux = aux.siguiente;
*/