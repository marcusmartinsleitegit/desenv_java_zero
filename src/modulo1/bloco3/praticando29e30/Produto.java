package modulo1.bloco3.praticando29e30;

public class Produto {
	
	protected String nome;
	
	public Produto () {
		System.out.println("Construindo um Produto");
	}
	
	public Produto(String nome) {
		this.nome = nome;
		System.out.println("Construindo um Produto com nome");
	}
	
}
