package ejempo09herencia;

public class Socio extends Persona {

	private int numeroSocio;
	
	public Socio(String nombre, int edad, int numeroSocio) {
		
		super(nombre, edad);
		this.setNumeroSocio(numeroSocio);
		
	}
	
	public int getNumeroSocio() {
		return numeroSocio;
	}
	
	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}
	
	
	@Override
	public void saludar() {
		System.out.println("Hola soy el socio numero "  + this.getNumeroSocio() + " y me llamo " + this.getNombre());;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " SOCIO " + this.getNumeroSocio();
	}
	
	
	@Override
	public double getMontoAPagar() {
		return super.getMontoAPagar() / 2;
	}

}
