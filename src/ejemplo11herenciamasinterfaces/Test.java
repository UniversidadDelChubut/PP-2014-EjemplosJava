package ejemplo11herenciamasinterfaces;

import javax.xml.bind.ValidationEventHandler;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		
		VehiculoTerrestre vt = new Auto();
		System.out.println( "APTO ASFALTO " + vt.isAptoAsfalto());
		
		vt = new Moto();
		System.out.println( "APTO ASFALTO " + vt.isAptoAsfalto());
		
		vt = new MinningTruck();
		System.out.println( "APTO ASFALTO " + vt.isAptoAsfalto());
		
		
		Auto a = new Auto();
		vt = a; 
		Vehiculo v = vt;
		
		Aerotransportable at = a;
		MinningTruck mt = new MinningTruck();
		
		AvionTransporte avion =  new AvionTransporte();
		
		
		Carguero c = new Carguero();
		
		Lancha l = new Lancha();
		
		
		avion.cargar( l );
		c.cargar( l );
		
		
		
	}

}
