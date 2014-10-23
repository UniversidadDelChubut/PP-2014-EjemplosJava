package ejemplo08sobrecarga;

public class PruebaPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto punto1 = new Punto();
		Punto punto2 = new Punto(2, 3);
		Punto punto3 = new Punto(6, -5);
		
		punto2.distancia(punto3);
		
		punto2.distancia();

		
		System.out.println("carretilla".substring(3));
		System.out.println("carretilla".substring(3, 5));
		
		
	}

}
