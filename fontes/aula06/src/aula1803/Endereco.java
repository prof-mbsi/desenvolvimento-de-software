package aula1803;

public class Endereco {
	
	//Atributos de Endereco
	String rua;
	int numero;
	String cep;
	String cidade;
	
	//Método que exibe o Endereco
	void exibirEndereco(){
		System.out.println("Rua: " + rua + ", " + numero + 
				" CEP: " + cep + ", " + cidade);
	}

}
