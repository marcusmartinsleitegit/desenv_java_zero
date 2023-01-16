package modulo1.bloco3.praticando27;

public class Funcionario {
	
	//Praticando 27
	protected String nome;
	public int matricula;
	protected double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	public void exibirNome() {
		System.out.println("O nome do Funcionário é: " + nome);
	}
	
	public double retornaBonus() {
		return salario * 0.10;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
