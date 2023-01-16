package modulo1.bloco3.praticando29e30;

public class TestaCadastro {
	
	public static void main(String[] args) {
		
		//Praticando 29
		Produto[] produtos = new Produto[5];
		
		Dvd dvd = new Dvd();
		dvd.setCapitulos(5);
		
		produtos[0] = dvd;
		
		Cd cd = new Cd();
		cd.setQtdFaixas(20);
		
		produtos[1] = cd;
		
		
		
	}
	
}
