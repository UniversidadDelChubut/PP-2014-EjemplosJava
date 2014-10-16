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
		return this.nombre + " (DNI " + this.numeroDocumento + ") ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroDocumento;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (numeroDocumento != other.numeroDocumento)
			return false;
		return true;
	}

	/*
	@Override
	public boolean equals(Object otraPersona){
		if (! ( otraPersona instanceof Persona))
			return false;
		return this.numeroDocumento == ((Persona)otraPersona).numeroDocumento;
	}
	
	
	@Override
	public int hashCode() {
		return this.numeroDocumento;
	}
	*/
	
	
}
