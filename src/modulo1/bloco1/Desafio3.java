package modulo1.bloco1;

import java.util.Scanner;

public class Desafio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1 - Somar");
		System.out.println("Digite 2 - Subtrair");
		System.out.println("Digite 3 - Multiplicar");
		System.out.println("Digite 4 - Dividir");
		
		int opcao = sc.nextInt();
		
		double valor1 = sc.nextDouble();
		double valor2 = sc.nextDouble();
		double resultado = 0;
		
		switch (opcao) {
		case 1: 
			resultado = valor1 + valor2;
			break;
		case 2: 
			resultado = valor1 - valor2;
			break;
		case 3: 
			resultado = valor1 * valor2;
			break;
		case 4: 
			resultado = valor1 / valor2;
			break;
	}
		System.out.println("Resultado da Operação : " + resultado);
		sc.close();
		
	}
}
