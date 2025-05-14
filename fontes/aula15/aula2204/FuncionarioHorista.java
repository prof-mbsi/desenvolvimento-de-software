package aula2204;

public class FuncionarioHorista extends Funcionario{
	
	private double valorHora;
	
	//Getters e setters
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	//Outros métodos da classe
	/*
	 * Polimorfismo de sobrecarga (assinatura do método diferente).
	 * Não é possível adicionar a anotação Override
	 */
	public double calcularSalario(double horasTrabalhadas) {
		return valorHora * horasTrabalhadas;
	}

}
