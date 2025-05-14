package aula2204;

public class FuncionarioCLT extends Funcionario{
	
	private double salario;
	
	//Getters e setters
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	//Outros métodos da classe
	@Override
	public double calcularSalario() {
		return salario;
	}
}
