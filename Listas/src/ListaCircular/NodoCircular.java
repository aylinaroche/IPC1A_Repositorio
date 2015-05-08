package ListaCircular;

public class NodoCircular {
	
	private Integer dato;
	private NodoCircular siguiente;
	public Integer getDato(){
		return dato;
	}
	public void setDato(Integer dato){
		this.dato = dato;
	}
	public NodoCircular getSiguiente(){
		return siguiente;
	}
	public void setsiguiente(NodoCircular siguiente){
		this.siguiente = siguiente;
		
	}
	
	public NodoCircular(Integer d){
		dato = d;
		siguiente = this;
		
	}

}
