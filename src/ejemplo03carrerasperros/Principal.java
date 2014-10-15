package ejemplo03carrerasperros;

public class Principal {

	public static void main(String[] args) {
		
		Perro [] gateras = new Perro[5];
		
		Criadero criaderoLosGalgosAfganos = new Criadero("Los Galgos Afganos", "Kabul");
		Criadero criaderoLosGalgosRusos = new Criadero("Los Galgos Rusos",   "Moscú");
		
		
		gateras[0] = new Perro("Chiflo", 180, 9);
		gateras[0].setCriadero(criaderoLosGalgosAfganos);
		
		gateras[1] = new Perro("Zurdo", 67, 12);
		gateras[1].setCriadero(criaderoLosGalgosRusos);
		
		gateras[2] = new Perro("Estrella", 72, 10);
		gateras[2].setCriadero(criaderoLosGalgosRusos);
		
		
		
		for (int i = 0; i < gateras.length; i++){
			
			System.out.println( 
					"Gatera " + i  + " : " +  
										gateras[i]
					);
		}
		
		
		Perro perro =gateras[1]; 
		perro .caminar();
		System.out.println(perro.getNombre() + " " + perro.getVelocidadActual());
		perro.acelerar(20);
		System.out.println(perro.getNombre() + " " + perro.getVelocidadActual());
		
		
		
		

		
		
		
		
	}
}
