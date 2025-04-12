package aula0804biblioteca;

public class Autor {

	private String nome;
	private String nacionalidade;
	
	//Getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	//Métodos da classe
	public void exibirInfo() {
		System.out.println("Autor [nome=" + nome + ", nacionalidade=" + nacionalidade + "]");
	}
	
}
