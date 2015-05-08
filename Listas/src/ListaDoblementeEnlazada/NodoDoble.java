package ListaDoblementeEnlazada;

public class NodoDoble {
	int a;
    NodoDoble siguiente;
	NodoDoble anterior;
//	NodoDoble inicio;
	//NodoDoble aux;
	
	
	public NodoDoble(int dato){
		a = dato;
		anterior =null;
		siguiente = null;
	}
	public void verNodo(){
		System.out.print("("+ a + ")");
	}
	
	
/*	
	void insertar(String s) {
		NodoDoble nuevo = new NodoDoble();
		if(inicio == null){
			inicio = nuevo;
		}else{
			aux = inicio;
			
			while (aux!= null){
				if(aux.siguiente = nuevo );
					
					nuevo.anterior = aux;
							
					else{
						aux = aux.siguiente;
					}
		}}
	}
	
	
*/
}
