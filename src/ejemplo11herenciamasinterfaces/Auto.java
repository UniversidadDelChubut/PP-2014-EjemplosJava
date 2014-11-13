package ejemplo11herenciamasinterfaces;

public class Auto extends VehiculoTerrestre implements Aerotransportable {

	private String modelo;
	private String tipo;

	@Override
	public void avanzar() {
			
	}
	
	@Override
	public int getCantidadRuedas() {
		return 4;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	

}
