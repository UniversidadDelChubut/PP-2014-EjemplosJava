package ejempo09herencia;

public class SocioVitalicio extends Socio {

	
	public SocioVitalicio(String nombre, int edad, int numeroSocio) {
		super(nombre, edad, numeroSocio);
	}
	
	@Override
	public double getMontoAPagar() {
		return 0;
	}
}
