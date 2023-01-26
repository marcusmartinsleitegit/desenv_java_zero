package modulo1.bloco4.praticando35;

import java.time.LocalDate;

public class TestaCarrinho {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto(10, "Camiseta", 40.0, 0.0);
		Produto produto2 = new Produto(12, "Meia", 10.0, 2.0);
		
		ItemCarrinho item1 = new ItemCarrinho(2, produto1);
		ItemCarrinho item2 = new ItemCarrinho(5, produto2);
		
		Carrinho carrinho = new Carrinho(LocalDate.now());
		
		carrinho.adicionar(item1);
		carrinho.adicionar(item2);
		
		carrinho.listarItens();
		
		System.out.println("Valor do carrinho: " + carrinho.valorTotalCarrinho());
		
		
	}
	
	
}
