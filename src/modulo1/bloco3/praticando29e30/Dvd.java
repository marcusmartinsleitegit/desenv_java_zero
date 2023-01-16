package modulo1.bloco3.praticando29e30;

public class Dvd extends Produto{
	
	private int capitulos;

	
	//Construtor
	public Dvd () {
		super("Aula Breenx");
		System.out.println("Construindo um Dvd");
	}
	
	
	// Getters e Setters 
	public int getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}
	
	

}
