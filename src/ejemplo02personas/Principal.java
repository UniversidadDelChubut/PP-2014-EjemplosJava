package ejemplo02personas;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona personaA = new Persona ("Pepe", 28);
		Persona personaB = null;
		
		personaB = new Persona ("Ana", 25);
		
		
		personaB.saludar();
		
		personaA.saludar();
		
		personaA.saludar(personaB);
		
	}

}
