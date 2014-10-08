package ejemplo03carrerasperros;

public class Principal {

	public static void main(String[] args) {
		
		Perro [] gateras = new Perro[5];
		
		gateras[0] = new Perro("Chiflo", 180, 9);
		gateras[1] = new Perro("Zurdo",67, 12);
		
		
		gateras[2] = gateras[0];
		gateras[0] = null;
		
		
		

		for (int i = 0; i < gateras.length; i++){
			
			System.out.println( 
					"Gatera " + i  + " : " +  
							((gateras[i] != null) ? 
									gateras[i].getNombre() + " tiene " + gateras[i].getEdad()  + " meses " 
									: "VACIA" ));
		}
		
		System.out.println("------");
		
		for (Perro perro: gateras){
			if (perro != null) {
				System.out.println(perro.getNombre());
			} else {
				System.out.println("vacia");
			}
		}
		
		System.out.println(gateras[6].getNombre());
		
		///System.out.println("La velocidad maxima de " + perro.getNombre() + " es " + perro.getVelocidadMaxima() + " km/h");
		
		
	}
}
