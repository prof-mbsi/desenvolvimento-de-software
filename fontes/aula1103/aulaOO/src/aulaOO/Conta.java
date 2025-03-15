package aulaOO;

public class Conta {
	
	//Atributos de Conta:
	int numero;
	double saldo;
	double limite;
	Cliente cliente;
	
	/**
	 * Construtor de Conta. Exige um Cliente como parâmetro para que possa instanciar o obejto
	 * Pré-define o limite da conta em 200.
	 * 
	 * @param novoCliente
	 */
	Conta(Cliente novoCliente){
		cliente = novoCliente;
		limite = 200;
	}
	
	// Método que exibe o estado da conta
	void mostrar() {
		System.out.println("Conta: " + numero +  
				", saldo: " + saldo + ", limite: " + limite);
	}
	
	//Método que deposita quantidade na conta
	void depositar(double quantidade) {
		saldo = saldo + quantidade;
	}
	
	//Método que efetua um saque
	void sacar(double quantidade) {
		if(quantidade <= retornaSaldoMaisLimite()) {
			saldo = saldo - quantidade;
		} else {
			System.out.println("Não foi possível sacar!");
		}
	}

	//Método que retorna a soma de saldo com limite
	double retornaSaldoMaisLimite() {
		return saldo + limite;
	}

}
