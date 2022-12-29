package modulo1.bloco1;

import java.util.Scanner;

public class Desafio4 {
	public static void main(String[] args) {
		
		System.out.println("Digite o valor do raio");
		Scanner sc = new Scanner(System.in);
		
		int raio = sc.nextInt();
		double pi = 3.14;
		
		double circulo = pi * raio * raio;
		
		System.out.println("O calculo do circulo é : " + circulo);
		sc.close();
		
	}
}
