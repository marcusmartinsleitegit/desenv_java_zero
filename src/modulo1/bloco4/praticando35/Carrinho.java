package modulo1.bloco4.praticando35;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private LocalDate dataCompra;
	private List<ItemCarrinho> itens = new ArrayList<>();
	
	
	public Carrinho(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}
	
	public void adicionar (ItemCarrinho item) {
		itens.add(item);
	}
	
	public void remover (ItemCarrinho item) {
		itens.remove(item);
	}
	
	public void listarItens() {
		
		for (ItemCarrinho item: itens) {
			System.out.println("Produto no carrinho : " + item.getProduto().getNome());
		}
		
	}
	
	
	public double valorTotalCarrinho () {
		double total = 0;
		
		for (ItemCarrinho item: itens) {
			
			double totalItem = ( item.getProduto().getValor() - item.getProduto().getDesconto() ) * item.getQuantidade();
			total += totalItem;
		}
		return total;
	}
	
}
