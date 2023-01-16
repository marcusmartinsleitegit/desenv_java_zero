package modulo1.bloco3.desafio9e10;

public class TestaConta {

	public static void main(String[] args) throws Exception {

		Conta conta = new ContaPoupanca();
		
		conta.getTitular().setNome("Felipe");
		conta.setSaldo(1000.00);
		
		System.out.println("Seja bem vindo: " + conta.getTitular().getNome());
		
		if (conta.saque(1100.0)) {
			System.out.println("Saque realizado");
		}
		
	}

}
