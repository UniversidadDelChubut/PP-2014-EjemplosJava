package ejemplo09herencia;

public class TestSocios {

	
	public static void main(String[] args) {
		Socio socio = new Socio("Juan Carlos", 34, 45);

		
		SocioVitalicio socioVitalicio = new SocioVitalicio("Don José", 72, 2);
		
		
		Persona persona = new Persona("Jauna", 23);
		
		//System.out.println("Socio " + socio.getNombre() + " Numero " + socio.getNumeroSocio()  );
		
		
		//socio.saludar();
		//persona.saludar();
		
		
		System.out.println(persona + " PAGA " + persona.getMontoAPagar());
		System.out.println(socio + " PAGA " + socio.getMontoAPagar());
		System.out.println(socioVitalicio + " PAGA " + socioVitalicio.getMontoAPagar());
		
	}
}
