package ejemplo05maps;

import java.text.SimpleDateFormat;
import java.util.HashMap;

import ejemplo04igualdad.Persona;

public class EjemploMaps {

	
	public static void main(String[] args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		HashMap<Persona, String> platosPrincipales = new HashMap<Persona, String>();
		
		Persona juan   = new Persona(23457651, "Juan Ramirez",   sdf.parse("01/08/1972"));
		Persona ana    = new Persona(34123127, "Ana Gomez",      sdf.parse("01/09/1989"));
		Persona lisa   = new Persona(32145256, "Lisa Dominguez", sdf.parse("31/08/1989"));
		Persona andres = new Persona(31456223, "Andres Perez",   sdf.parse("15/01/1978"));
		Persona lisa2  = new Persona(32145256, "Lisa Dominguez", sdf.parse("31/08/1989"));
		
		platosPrincipales.put(juan,   "Asado");
		platosPrincipales.put(ana,    "Ensalada");
		platosPrincipales.put(lisa,   "Lasagna");
		platosPrincipales.put(andres, "Capón");
		
		
		platosPrincipales.put(juan,   "Ensalada");
		platosPrincipales.put(lisa2,   "Pato a la naranja");
		
		
		for(Persona p: platosPrincipales.keySet()){
			System.out.println( p  + " eligio " + platosPrincipales.get(p) );
		}
		
		
		
		
	
		
		
	}
}
