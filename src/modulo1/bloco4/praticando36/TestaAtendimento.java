package modulo1.bloco4.praticando36;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestaAtendimento {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue<String> preferencial = new LinkedList<>();
		Queue<String> normal = new LinkedList<>();
		
		new Thread(new AtendimentoThread(preferencial, normal)).start();
		
		while (true) {
			
			System.out.println("Digite o nome do cliente ou Sair para finalizar");
			
			String nome = sc.next();
			
			if (nome.toUpperCase().equals("SAIR")) {
				System.exit(0);
			}
			
			System.out.println("Favor Digitar a Idade: ");
			int idade = sc.nextInt();
			
			if(idade > 60) {
				preferencial.offer(nome);
			}else {
				normal.offer(nome);
			}
		}
	}
}
