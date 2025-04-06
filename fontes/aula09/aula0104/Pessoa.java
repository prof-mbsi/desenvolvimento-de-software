package aula0104;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa() {
		this.nome = "Desconhecido";
		this.idade = 18;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade > 0) {
			this.idade = idade;
		} else {
			System.err.println("Valor inválido para o campo idade");
		}
	}
	
	public void mostrarPessoa() {
		System.out.println(this.getNome() + " tem " + this.getIdade() + " anos.");
	}
}
