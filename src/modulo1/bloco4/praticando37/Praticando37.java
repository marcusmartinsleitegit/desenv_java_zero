package modulo1.bloco4.praticando37;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Praticando37 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, String> boletim = new HashMap<>();
		
		while(true) {
			
			System.out.println("Favor digitar o nome do aluno ou Sair para finalizar a aplicação");
			String nome = sc.next();
			
			if(nome.toUpperCase().equals("SAIR")) {
				break;
			}
			
			System.out.println("Favor digitar a nota do aluno");
			double nota = sc.nextDouble();
			String notaString = null;
			
			if (nota >= 9) {
				notaString = "A";
			} else if (nota >=8 && nota < 9) {
				notaString = "B";
			} else if (nota >=7 && nota < 8) {
				notaString = "C";
			} else if (nota >=6 && nota < 7) {
				notaString = "D";
			} else {
				notaString = "E";
			}
			
			boletim.put(nome, notaString);
			
		}
		
		while (true) {
			
			System.out.println("Favor digitar o nome do aluno para verificar a nota ou Sair para finalizar a aplicação");
			String nome = sc.next();
			
			if(nome.toUpperCase().equals("SAIR")) {
				break;
			}
			
			System.out.println("Aluno(a) " + nome + " Nota: " + boletim.get(nome));
			
		}
		
	}

}
