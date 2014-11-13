package ejemplo11herenciamasinterfaces;

public class Lancha extends VehiculoAcuatico implements Aerotransportable {

	private int peso;
	private int volumen;
	@Override
	public int getPeso() {
		return this.peso;
	}
	
	
	@Override
	public int getVolumen() {
		// TODO Auto-generated method stub
		return this.volumen;
	}

	@Override
	public void avanzar() {
		// TODO Auto-generated method stub
		
	}
}
