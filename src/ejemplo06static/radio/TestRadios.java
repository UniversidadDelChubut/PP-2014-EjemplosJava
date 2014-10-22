package ejemplo06static.radio;

public class TestRadios {

	
	private static void saludar() {
		System.out.println("Hola amigos este es el programa...");
	}
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		Math.abs(-1);
		
		saludar();
		
		
		System.out.println("Creadas : " + Radio.getCantidadRadiosCreadas());
		
		new Radio();
		new Radio();
		
		
		
		Radio radio1 = new Radio();
		Radio radio2 = new Radio();
		
		
		
		radio1.setVolumen(5);
		radio2.setVolumen(7);
		
		System.out.println(radio1);
		System.out.println(radio2);
		
		
		System.out.println("VOL MAX: " + Radio.MAX_VOLUMEN);
		System.out.println("Creadas : " + Radio.getCantidadRadiosCreadas());
		
	}

}
