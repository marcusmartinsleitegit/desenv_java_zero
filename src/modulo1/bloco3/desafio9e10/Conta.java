package modulo1.bloco3.desafio9e10;

public abstract class Conta {
	
	protected Pessoa titular = new Pessoa();
	protected int numero;
	protected Double saldo;
	
	
	public Pessoa getTitular () {
		return titular;
	}
	
	public void setTitular (Pessoa titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero (int numero) {
		this.numero = numero;
	}
	
	public Double getSaldo () {
		return saldo;
	}
	
	public void setSaldo (Double saldo) {
		this.saldo = saldo;
	}
	
	
	public boolean saque (double saque) throws Exception{
		
		if (saque > saldo) {
			throw new Exception("Saldo Insuficiente");
		}
		saldo -= saque;
		return true;
		
	}
	
	
	
}
