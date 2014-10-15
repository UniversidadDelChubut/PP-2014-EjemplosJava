package ejemplo04igualdad;

public class Fiesta {

	private Persona [] invitados = new Persona[15];

	
	public void invitar (Persona persona){
		
		int i = 0;
		
		while (i < this.invitados.length && this.invitados[i] != null) {
			if (this.invitados[i].equals(persona) ){
				System.out.println(persona + " ya estaba invitada");
				return;
			}
			i++;
		}
		
		if (i < this.invitados.length) {
			this.invitados[i] = persona;
		} else {
			System.out.println("No hay lugar para " + persona);
		}
	} 

	
	public Persona[] getInvitados() {
		return invitados;
	}
	
}
