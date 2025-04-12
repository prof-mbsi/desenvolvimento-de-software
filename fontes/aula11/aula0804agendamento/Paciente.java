package aula0804agendamento;

public class Paciente {

	private String nome;
	private String cpf;
	private String dataDeNascimento;
	
	//Getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	//Métodos da classe
	public void exibirInfo() {
		System.out.println("Paciente [nome=" + nome + ", cpf=" + cpf + ", dataDeNascimento=" + dataDeNascimento + "]");
	}
	
	
}
