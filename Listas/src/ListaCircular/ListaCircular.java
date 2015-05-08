package ListaCircular;

public class ListaCircular {
	
	private NodoCircular inicio;
	
	
	public ListaCircular(){
		inicio = null;
			
	}
	
	public void agregar(Integer d){
		
			NodoCircular nuevo = new NodoCircular(d);
			
			if(inicio ==null){
				inicio=nuevo;
			}
		
		else{
			NodoCircular aux = inicio;
			while (aux.getSiguiente()!=inicio){
				aux = aux.getSiguiente();
			}
			aux.setsiguiente(nuevo);
			nuevo.setsiguiente(inicio);
		}
	}
	public void recorrer(){
		NodoCircular aux = inicio;
		while(aux.getSiguiente()!=inicio){
			System.out.println(aux.getDato()+" ");
			aux = aux.getSiguiente();
		}
		System.out.println(aux.getDato()+" ");
		
	}
}
