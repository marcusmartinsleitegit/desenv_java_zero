package modulo1.bloco1;

public class TestaControleRemoto {

	public static void main(String[] args) {
		Televisao tv = new Televisao();
		ControleRemoto controleRemoto = new ControleRemoto();

		controleRemoto.desliga(tv);
		System.out.println("Televisão Ligada: " + tv.ligada);
	}
	
}
