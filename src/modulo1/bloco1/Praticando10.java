package modulo1.bloco1;

import java.util.Scanner;

public class Praticando10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		boolean continua = true;
		
		System.out.println("Digite Numero para serem somados");
		System.out.println("Finalize Digitando um numero negativo");
		
		while (continua) {
			int num = sc.nextInt();
			
			if (num < 0 ) {
				System.out.println("Sistema Finalizado");
				break;
			}
			
			soma += num;
			System.out.println("Soma : " + soma);
		}
		
		sc.close();
	}
}
