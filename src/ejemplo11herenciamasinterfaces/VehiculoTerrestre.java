package ejemplo11herenciamasinterfaces;

public abstract class VehiculoTerrestre extends Vehiculo implements Transportable {

	
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
	
	public abstract int getCantidadRuedas();
	
	public boolean isAptoAsfalto(){
		return true;
	}
	
}
