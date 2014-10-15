package ejemplo04igualdad;

import java.util.Date;

public class Persona {
	
	private final int numeroDocumento;
	private String nombre;
	private Date fechaNacimiento;
	
	public Persona(int numeroDocumento, String nombre, Date fechaNacimiento) {
		this.numeroDocumento = numeroDocumento;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	@Override
	public String toString() {
		return this.nombre + " (DNI " + this.numeroDocumento + ")";
	}
	
	
	public boolean equals(Persona otraPersona){
		return this.numeroDocumento == otraPersona.numeroDocumento;
	}
}
