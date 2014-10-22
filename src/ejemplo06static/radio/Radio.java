package ejemplo06static.radio;

public class Radio {

	public static final int MIN_VOLUMEN = 0;
	public static final int MAX_VOLUMEN = 10;
	
	//Atributos de clases
	private static int proximoNumeroSerie = 1; 
	
	//Atributos de instancia
	private int numeroSerie;
	private boolean encendido = false;
	private int volumen = 0;
	private double frecuencia = 88.7;

	
	public Radio() {
		this.numeroSerie = Radio.proximoNumeroSerie++;
	}
	
	public static int getCantidadRadiosCreadas(){
		return Radio.proximoNumeroSerie - 1;
	}
	
	@Override
	public String toString() {
		return "Serie " + this.numeroSerie + " - Volumen : " + this.volumen;
	}
	
	
	public void encender(){
		this.encendido = true;
	}
	
	public void apagar(){
		this.encendido = false;
	}
	
	public void setVolumen(int volumen) {
		if (volumen > MAX_VOLUMEN){
			volumen = MAX_VOLUMEN;
		}
		if (volumen < MIN_VOLUMEN){
			volumen = MIN_VOLUMEN;
		}
		this.volumen = volumen;
	}
	
	
	public int getVolumen() {
		return volumen;
	}
	
	public double getFrecuencia() {
		return frecuencia;
	}
	
	public int getNumeroSerie() {
		return numeroSerie;
	}
	
	public boolean isEncendido() {
		return encendido;
	}
	
}
