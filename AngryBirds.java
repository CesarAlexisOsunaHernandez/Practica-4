public class AngryBirds{
	public static void main(String args[]){
		PajaroRojo rojo = new PajaroRojo();
		PajaroAmarillo amarillo = new PajaroAmarillo();
		PajaroNegro negro = new PajaroNegro();
		
		System.out.println("Rojo:");
		rojo.volar();
		
		System.out.println("\n");
		
		System.out.println("Amarillo:");
		amarillo.volar();
		amarillo.acelerar();
		
		System.out.println("\n");
		
		System.out.println("Negro:");
		negro.volar();
		negro.explotar();
	}
}