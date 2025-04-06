package aula0104;

public class ContaBancaria {
	
	private String titular;
	private double saldo;
	
	//Construtores
	public ContaBancaria(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}
	public ContaBancaria() {
		
	}

	//Getters e setters
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//Métodos específicos da ContaBancaria
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		} else {
			System.err.println("Depósito permitido apenas para valores positivos!");
		}
	}
	public void sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.err.println("A conta de " + this.getTitular() 
				+ " não possui saldo suficiente para sacar R$" + valor);
		}
	}
}
