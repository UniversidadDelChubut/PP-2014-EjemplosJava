package ejemplo01listastest;

import ejemplo01listas.Lista;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lista<String> lista1 = new Lista<String>();
		Lista<Integer> lista2 = new Lista<Integer>();

		
		lista1.agregar("Jose");
		lista1.agregar("Luisa");
		lista2.agregar(0);
		
		lista1.agregar("Américo");
		
		lista2.agregar(1);
		
		lista2.agregar(3);
		
		lista2.agregar(4);
		
		
		String nombre = lista1.next();
		while (nombre != null) {
			System.out.println(nombre);
			nombre = lista1.next();
		}

		
		Integer i;
		while ((i = lista2.next())!= null ){
			System.out.println(i);
		}
		
		System.out.println("Lista 1 tiene " + lista1.getCantidadElementos() + " elementos");
		
		
	}

}
