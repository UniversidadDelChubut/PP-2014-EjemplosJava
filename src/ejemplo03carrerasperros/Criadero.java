package ejemplo03carrerasperros;

public class Criadero {
	private String nombre;
	private String localidad;
	
	
	
	public Criadero(String nombre, String localidad) {
		this.nombre = nombre;
		this.localidad = localidad;
	}

	public String getLocalidad() {
		return localidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}

}
