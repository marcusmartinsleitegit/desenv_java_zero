package modulo1.bloco2;

public class Praticando26 {
	
	public static void main(String[] args) {
		
		long [][] matriz = new long[2][2];
		
		matriz[0][1] = 3L;
		
		System.out.println(matriz[0][1]);
		
		long [][] tabela = { {1,2,3,4} , {5,6,7,8}, {10, 20, 30} } ;
		
		
		for (int i = 0; i < tabela.length; i++) {
			
			for (int j = 0; j < tabela[i].length; j++) {
				
				System.out.println("Linha: " + i + " Coluna: " + tabela[i][j]  );
			}
		}
		
	}
}
