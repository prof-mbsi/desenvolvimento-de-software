package aula0804agendamento;

public class Medico {
	
	private String nome;
	private String especialidade;
	
	//Getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	//Métodos da classe
	public void exibirInfo() {
		System.out.println("Medico [nome=" + nome + ", especialidade=" + especialidade + "]");
	}	

}
