package modulo1.bloco1;

public class Desafio2 {
	public static void main(String[] args) {
		
		int fatorial = 1;
		int numeroDesejado = 5;
				
		for (int i = numeroDesejado; i >= 1; i--) {
			fatorial = fatorial * i;
		}
		
		System.out.println("Fatorial de " + numeroDesejado + " é " + fatorial);
		
	}
	
}
