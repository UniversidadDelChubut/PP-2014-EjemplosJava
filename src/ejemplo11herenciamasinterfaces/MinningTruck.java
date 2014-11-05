package ejemplo11herenciamasinterfaces;

public class MinningTruck extends VehiculoTerrestre {

	@Override
	public void avanzar() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int getCantidadRuedas() {
		return 4;
	}
	
	@Override
	public boolean isAptoAsfalto() {
		return false;
	}
}
