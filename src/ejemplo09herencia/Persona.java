package ejemplo09herencia;

public class Persona {
	
	private static double valorEntrada = 80;

	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	// Accessor Methods o metodos de acceso
	public String getNombre(){
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	//metodos
	public void saludar() {
		System.out.println("Hola, soy " + this.nombre);
	}
	
	public void saludar(Persona otraPersona){
		System.out.println("Hola " + otraPersona.getNombre() + ", soy " + this.nombre);
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public double getMontoAPagar(){
		return Persona.valorEntrada;
	}
	
	
}
