package ejemplo11herenciamasinterfaces;

public class Test {

	/** 
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		// ¿A qué variables puedo asignar una referencia?
		
		Moto moto = new Moto();
		moto.getCantidadRuedas();
		
		
		Vehiculo[] flota = new Vehiculo[20];
		
		flota[0] = moto;
		flota[1] = new AvionTransporte();
		
		
		flota[0].avanzar();
		
		Moto moto2 = null;
		
		if (flota[0] instanceof Moto ) {
			moto2 = (Moto)flota[0];
		}
		
		
		VehiculoTerrestre vt = (VehiculoTerrestre)flota[0];
		vt.getPeso();
		
		VehiculoAcuatico va = new Lancha();
		
		
		
		//((Carguero)va).cargar(moto);;
		 
		
		//¿Qué es el tipo concreto y el tipo de referencia?

		
		
		// Cómo hago para acceder a los métodos específicos del objeto 
		
		
		//Cómo puedo saber la clase de un objeto
		
		System.out.println( va.getClass().getName());
		
		
		
		
		Flota <Moto> flotaMia = new Flota<>(10);
		
		flotaMia.agregrIntegrante(new Moto());
	
		
		Flota <Lancha> otraFlota = new Flota<>(5);
		
		//otraFlota.agregrIntegrante(integrante);
	
		
		
		
		
		
		
		
	}

}
