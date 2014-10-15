package ejemplo04igualdad;

import java.text.SimpleDateFormat;

public class ArmadoDeFiesta {

	public static void main(String[] args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Fiesta fiesta = new Fiesta();
		
		fiesta.invitar( new Persona(23457651, "Juan Ramirez",   sdf.parse("01/08/1972")));
		fiesta.invitar( new Persona(34123127, "Ana Gomez",      sdf.parse("01/09/1989")));
		fiesta.invitar( new Persona(32145256, "Lisa Dominguez", sdf.parse("31/08/1989")));
		fiesta.invitar( new Persona(31456223, "Andres Perez",   sdf.parse("15/01/1978")));
		fiesta.invitar( new Persona(34123127, "Ana Gomez",      sdf.parse("01/09/1989")));
		
		System.out.println("===INVITADOS===");
		for (Persona invitado: fiesta.getInvitados()){
			if (invitado != null)
				System.out.println(invitado);
		}
		
	}
}
