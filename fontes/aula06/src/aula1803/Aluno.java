package aula1803;

public class Aluno {
	
	//Atributos de Aluno
	String nome;
	int matricula;
	//Associação entre Aluno e Carteira
	Carteira carteiraEstudantil;
	
	//Método que exibe informações do Aluno e sua Carteira
	void exibirInformacoes() {
		System.out.println("Nome: " + nome + ", matrícula: "
				+ matricula + ", carteirinha: " 
				+ carteiraEstudantil.codigo + ", validade: "
				+ carteiraEstudantil.dataDeValidade);
	}

}
