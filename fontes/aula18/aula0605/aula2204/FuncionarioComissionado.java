package aula2204;

public class FuncionarioComissionado extends Funcionario{
	
	private double salario;
	
	//Getters e setters
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Outros métodos da classe
	/*
	 * Polimorfismo de sobrecarga (assinatura do método diferente).
	 * Não é possível adicionar a anotação Override
	 */
	public double calcularSalario(double valorVendas, double percentualComissao) {
		return salario + (valorVendas * (percentualComissao / 100));
	}
}
