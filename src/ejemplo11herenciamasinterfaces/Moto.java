package ejemplo11herenciamasinterfaces;

public class Moto extends VehiculoTerrestre implements Aerotransportable {

	private int cilindrada;
	private String modelo;
	
	
	@Override
	public void avanzar() {
		
	}
	
	public int getCilindrada() {
		return cilindrada;
	}
	
	public String getModelo() {
		return modelo;
	}

	@Override
	public int getCantidadRuedas() {
		return 2;
	}
	
	
	
}
