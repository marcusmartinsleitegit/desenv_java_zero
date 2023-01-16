package modulo1.bloco3.praticando28;

import modulo1.bloco3.praticando27.Funcionario;

public class Gerente extends Funcionario{
	
	private int qtdFuncionariosGerenciados;
	
	@Override
	public void exibirNome() {
		System.out.println("O nome do Funcionário - Gerente é : " + nome);
	}
	
	//Praticando 28
	@Override
	public double retornaBonus( ) {
		return salario * 0.20;
	}

	public int getQtdFuncionariosGerenciados() {
		return qtdFuncionariosGerenciados;
	}

	public void setQtdFuncionariosGerenciados(int qtdFuncionariosGerenciados) {
		this.qtdFuncionariosGerenciados = qtdFuncionariosGerenciados;
	}
	
	
	
	
	
}
