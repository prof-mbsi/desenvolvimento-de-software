package aula05.aula1303;

public class Pessoa {
	
	//Atributos de Pessoa
	String nome;
	Passaporte pass;
	
	//Método que vincula um passaporte a uma Pessoa
	void vincularPassaporte(Passaporte p) {
		pass = p;
	}
	
	//Método que exibe os dados da pessoa com seu passaporte
	void exibirDados() {
		System.out.println("Nome: " + nome + 
				", passaporte: " + pass.numero 
				+ ", país: " + pass.pais);
	}
}
