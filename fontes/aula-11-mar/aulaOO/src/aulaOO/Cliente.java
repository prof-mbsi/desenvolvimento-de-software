package aulaOO;

public class Cliente {
	
	//Atributos de Cliente:
	String nome;
	String cpf;
	String telefone;
	
	/**
	 * Construtor de Cliente. Quando definido um ou mais construtores, fica impossibilitada a
	 * utilização de construtores não definidos na classe. Nesse caso, usar Cliente c = new Cliente();
	 * dentro do método main vai gerar um erro.
	 * 
	 * @param novoCliente
	 */
	Cliente (String novoCliente){
		nome = novoCliente;
	}

}
