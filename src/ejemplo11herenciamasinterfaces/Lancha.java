package ejemplo11herenciamasinterfaces;

public class Lancha implements Aerotransportable {

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

}
