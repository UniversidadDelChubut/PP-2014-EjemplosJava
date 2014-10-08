package ejemplo03carrerasperros;

public class Perro {
	
	public static final int VELOCIDAD_MAXIMA = 100;  
	
	private final String nombre;
	private int velocidadMaxima;
	private int edad;
	
	

	// Constructor 
	// Pasarle los valores de los atributos invariantes
	//  y los de los atributos más relevantes del objeto 
	public Perro(String nombre, int velocidadMaxima, int edad) {
		this.nombre = nombre;
		this.setVelocidadMaxima(velocidadMaxima);
		this.edad = edad;
	}

	
	public String getNombre() {
		return nombre;
	}
	


	public int getEdad() {
		return edad;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		if (velocidadMaxima > VELOCIDAD_MAXIMA) {
			velocidadMaxima = VELOCIDAD_MAXIMA;
		}
		this.velocidadMaxima = velocidadMaxima;
	}
	
}
