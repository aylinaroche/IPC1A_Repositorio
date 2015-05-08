package ListaDoblementeEnlazada;

public class ListaDoble {
     NodoDoble inicio;
     NodoDoble fin;
     
 public ListaDoble(){
	 inicio = null;
	 fin = null;
 }
	private boolean vacia(){
		 boolean vacia = false;
		 if(inicio == null){
			 vacia = true;
		 }
		 return vacia;
		 
	 }
	
	public void InsertarInicio(int a){
		NodoDoble tmp = new NodoDoble(a);
		if(vacia()){
			inicio = tmp;
			fin = tmp;
		}else{
			tmp.siguiente = inicio;
			inicio.anterior = tmp;
			inicio = tmp;
		}
	}
	public void InsertarFin(int a){
		NodoDoble tmp = new NodoDoble(a);
		if(vacia()){
			inicio = tmp;
			fin = tmp;
			
		}else{
			fin.siguiente = tmp;
			tmp.anterior = fin;
			fin = tmp;
		}
	}
	public String Listar(){
		String a = "";
		NodoDoble aux = inicio;
		
		while(aux!=null){
			a+="("+aux.a+")";
			aux = aux.siguiente;
		}
		return (a);
	}
	
	
/*	
	private void enlazar(NodoDoble nodoA, NodoDoble nodoB){
		nodoA.siguiente = nodoB;
		nodoB.anterior = nodoA;
	}
	public void insertarInicio(int dato){
		NodoDoble nuevo = new NodoDoble(dato);
		if(estaVacia()){
			inicio = nuevo;
		fin = nuevo;
		} 	else{
			enlazar(nuevo, inicio);
			inicio = nuevo;
	}
	
	}*/
}
	 
 
	

