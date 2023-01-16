package modulo1.bloco3.praticando32;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class TestaPilha {
	
	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Favor digitar quantidade de valores");
			int qtd = sc.nextInt();
			
			Stack<Integer> pilhaPar = new Stack<>();
			Stack<Integer> pilhaImpar = new Stack<>();
			
			for (int i = 0; i < qtd; i++) {
				int numeroDigitado = sc.nextInt();
				
				if (numeroDigitado % 2 == 0) {
					pilhaPar.push(numeroDigitado);
				} else {
					pilhaImpar.push(numeroDigitado);
				}
			}
			
			System.out.println("Elementos Pares");
			while (!pilhaPar.isEmpty()) {
				System.out.println(pilhaPar.pop());
			}
			
			System.out.println("Elementos Impares");
			while (!pilhaImpar.isEmpty()) {
				System.out.println(pilhaImpar.pop());
			}
			
			pilhaPar.pop();
			sc.close();
			
			
		} catch (InputMismatchException e) {
			System.out.println("Permitido somente valores numéricos!!");
		} catch (Exception e) {
			
			System.out.println("Erro no sistema");
		}
		
		
		
		
		
	}
	

}
