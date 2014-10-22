package ejemplo07static.barcos;

public class Barco {

	private static Barco elMasGrande = null; 
	
	private int eslora;
	private String nombre;
	
	public Barco (String nombre, int eslora){

		
		this.nombre = nombre;
		this.eslora = eslora;

		if (Barco.elMasGrande ==  null || eslora > Barco.elMasGrande.getEslora()){
			Barco.elMasGrande = this;
		}

	}
	
	public static Barco getElMasGrande() {
		return elMasGrande;
	}
	
	public int getEslora() {
		return eslora;
	}
	
	public String getNombre() {
		return nombre;
	}

}
