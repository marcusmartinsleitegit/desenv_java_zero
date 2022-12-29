package modulo1.bloco1;

import java.util.Scanner;

public class Praticando7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1 - Para somar 2 numeros");
		System.out.println("Digite 2 - Digitar seu nome");
		System.out.println("Digite 3 - Retornar ao Menu principal");
		
		int opcao = sc.nextInt();
		
		switch(opcao) {
			case 1:	
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println("Soma dos dois numero: " + (num1 + num2));
				break;
			case 2:
				System.out.println("Digite o seu nome");
				String nome = sc.next();
				System.out.println("Nome digitado: " + nome);
				break;
			case 3:
				System.exit(0); // Finaliza o programa com sucesso
		}
		
		sc.close();
	
	}
	
}
