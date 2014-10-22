package ejemplo07static.barcos;

public class TestBarcos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Barco titanic = new Barco("Titanic", 160);
		Barco maersk = new Barco("Maersk I", 380);
		Barco mimosa = new Barco("Mimosa", 38);
		
		System.out.println("El mas grande es el " + Barco.getElMasGrande().getNombre() + 
				" y su eslora es " + Barco.getElMasGrande().getEslora());
	
		
		
		
	}

}
