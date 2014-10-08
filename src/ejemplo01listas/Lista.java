package ejemplo01listas;

public class Lista <T> {
	
	// Atributos de instancia
	private Nodo <T> cabecera;
	private Nodo <T> siguiente;

	// Constructor
	public Lista() {
		this.cabecera = null;
	}
	
	//Métodos	
	public void agregar(T dato) {
		Nodo<T> nodoAgregar = new Nodo<T>(dato);
		if (this.cabecera == null) {
			this.cabecera = nodoAgregar;
			this.siguiente = nodoAgregar;
		} else {
			Nodo<T> aux = this.cabecera;
			while (aux.getSiguiente() != null){
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nodoAgregar);
		}
	}
	
	public T next() {
		if (this.siguiente == null){
			return null;
		}
		T dato = this.siguiente.getDato();
		this.siguiente = this.siguiente.getSiguiente();
		return dato;
	}
	
	public int getCantidadElementos(){
		Nodo <T> aux;
		int cantidad = 0;
		aux = this.cabecera;
		while(aux != null){
			cantidad++;
			aux = aux.getSiguiente();
		}
		return cantidad;
	}
	
}
