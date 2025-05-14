package aula0605;

public class FuncionarioPJ extends Funcionario {
	
	double horasTrabalhadas;
	double valorHora;

	//Método que a superclasse obriga a implementação
	@Override
	double calculaSalario() {
		return horasTrabalhadas * valorHora;
	}

}
