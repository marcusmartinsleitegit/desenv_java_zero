package modulo1.bloco3.praticando31;

public class TestaAlgoritmo {
	
	public static void main(String[] args) {
		
		Algoritmo algoritmo = new AlgoritmoBubbleImpl();
		
		int[] vetor = {10, 5 , 6 , 1, 2}; 
		
		algoritmo.processa(vetor);
		
	}
	
}
