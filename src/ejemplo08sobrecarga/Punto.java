package ejemplo08sobrecarga;

public class Punto {
	
	private double x;
	private double y;
	
	
	public Punto () {
		this(0, 0);
	}
	
	public Punto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	
	public double distancia (double x, double y ){
		return this.distancia( new Punto(x, y) );
	}
	
	public double distancia() {
		return this.distancia( new Punto() );
	}
	
	public double distancia(Punto otroPunto){
		
		return Math.sqrt(
				(this.x - otroPunto.x)  * (this.x - otroPunto.x) + 
				(this.y - otroPunto.y)  * (this.y - otroPunto.y) ); 
		
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
}
