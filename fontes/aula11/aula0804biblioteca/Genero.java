package aula0804biblioteca;

public class Genero {
	
	private String descricao;

	//Getters e setters
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	//Métodos da classe
	public void exibirInfo() {
		System.out.println("Genero [descricao=" + descricao + "]");
	}
}
