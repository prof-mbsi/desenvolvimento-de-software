package aula1803;

public class Pessoa {
	
	//Atributos de Pessoa
	String nome;
	Endereco end;

	//Método que exibe os dados de Pessoa com o Endereco vinculado
	void exibirDados() {
		System.out.println("Nome: " + nome + ". Endereço: " + 
				end.rua + ", " + end.numero + ", CEP: " + 
				end.cep + ". Cidade: " + end.cidade);
	}

}
