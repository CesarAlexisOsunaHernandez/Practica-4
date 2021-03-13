public class Pajaros{
	String color;
	int peso;
	boolean angry = true;
	
	public Pajaros(String color, int peso){
		this.color = color;
		this.peso = peso;
	}
	
	public void volar(){
		System.out.println("Volando...");
	}
}