package ejemplo01listas;

class Nodo <T> {
	
	private T dato;
	private Nodo <T> siguiente;
	
	Nodo(T dato){
		this.dato = dato;
	}
	
	Nodo <T> getSiguiente() {
		return siguiente;
	}
	
	void setSiguiente(Nodo <T> siguiente) {
		this.siguiente = siguiente;
	}
	
	T getDato() {
		return dato;
	}
	
}
