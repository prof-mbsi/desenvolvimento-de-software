package aula0605;

public class FuncionarioCLT extends Funcionario {
	
	double salario;

	//Método que a superclasse obriga a implementação
	@Override
	double calculaSalario() {
		return salario;
	}

}
