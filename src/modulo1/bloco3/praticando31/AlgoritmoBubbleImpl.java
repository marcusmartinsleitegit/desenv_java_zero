package modulo1.bloco3.praticando31;

public class AlgoritmoBubbleImpl implements Algoritmo {

	@Override
	public void processa(int[] vetor) {

		int aux = 0;
		
		System.out.println("Vetor de entrada");
		
		for (int i = 0; i< vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		
		for (int i = 0; i< vetor.length; i++) {
			
			for (int j = 0; j < vetor.length -1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		
		
		System.out.println("Vetor de ordenado");
		
		for (int i = 0; i< vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		
	}

}
