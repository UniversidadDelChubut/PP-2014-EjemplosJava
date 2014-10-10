package ejemplo03carrerasperros;

public class Perro {
	
	public static final int VELOCIDAD_MAXIMA = 100;  
	
	private final String nombre;
	private int velocidadMaxima;
	private int edad;
	private int velocidadActual;
	private Criadero criadero;
	
	
	// Constructor 
	// Pasarle los valores de los atributos invariantes
	//  y los de los atributos más relevantes del objeto 
	public Perro(String nombre, int velocidadMaxima, int edad) {
		this.nombre = nombre;
		this.setVelocidadMaxima(velocidadMaxima);
		this.edad = edad;
	}

	public void setCriadero(Criadero criadero) {
		this.criadero = criadero;
	}
	
	public Criadero getCriadero() {
		return criadero;
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
	
	public int getVelocidadActual() {
		return velocidadActual;
	}
	
	public void picar(){
		this.velocidadActual = this.velocidadMaxima;
	}
	
	public void correr() {
		this.velocidadActual = (int) (this.velocidadMaxima * 0.8);
	}
	
	public void caminar() {
		this.velocidadActual = 8;
	}
	
	public void detenerse() {
		this.velocidadActual = 0;
	}
	
	public void acelerar(double porcentaje) {
		if (this.velocidadActual == 0 ){
			this.caminar();
			return;
		}
		int velocidaNueva = (int) (this.velocidadActual * (1 + (porcentaje / 100)));
		if (velocidaNueva > this.velocidadMaxima){
			velocidaNueva = this.velocidadMaxima;
		}
		this.velocidadActual = velocidaNueva;
		
	}
	
}
