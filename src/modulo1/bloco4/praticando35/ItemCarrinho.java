package modulo1.bloco4.praticando35;

public class ItemCarrinho {
	
	private int quantidade;
	private Produto produto;
	
	public ItemCarrinho(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
