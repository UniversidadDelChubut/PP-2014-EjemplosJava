package ejemplo04igualdad;

public class TestIgualdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1 = "Pepe";
		String cadena2 = "pepe";
		String cadena3 = cadena1.toLowerCase();
		
		System.out.println(cadena1 + " " +  cadena2 + " "+ cadena3);
		
		System.out.println(cadena1 == cadena2);
		System.out.println(cadena2 == cadena3);
		System.out.println(    cadena2.equals(cadena3)  );
		
		
		
		
	}

}
